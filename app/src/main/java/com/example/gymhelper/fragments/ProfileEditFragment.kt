package com.example.gymhelper.fragments

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.gymhelper.adapters.ExcersizesListExpandableListAdapter
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentProfileEditBinding
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.viewmodel.ProfileEditViewModel
import com.example.gymhelper.factories.ProfileEditViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class ProfileEditFragment : Fragment() {

    private lateinit var binding: FragmentProfileEditBinding
    private lateinit var viewModel: ProfileEditViewModel
    private var profileId: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application = requireNotNull(this.activity).application
        val arguments =
            ProfileEditFragmentArgs.fromBundle(
                requireArguments()
            )
        profileId = arguments.trainingProfileId

        initViewModel(application)
        initBinding(inflater, container)
        initObservables(application)

        return binding.root
    }

    private fun initObservables(application: Application) {
        var curProfile = mutableListOf<Excersize>()

        viewModel.curTrainingProfile.observe(viewLifecycleOwner, Observer {
            curProfile = it
        })

        viewModel.excersizesByGroups.observe(viewLifecycleOwner, Observer {
            val exs = it.excersizesGroups
            val groups = it.excersizesGroups.map { it.groupName }
            val adapter =
                ExcersizesListExpandableListAdapter(
                    application,
                    groups,
                    exs,
                    R.layout.excersizes_expandable_list_group_layout,
                    R.layout.excersizes_expandable_list_excersize_layout,
                    curProfile
                ) { exId: Long, selected: Boolean ->
                    if (selected) {
                        viewModel.onExcersizeChecked(profileId, exId)
                    } else {
                        viewModel.onExcersizeUnchecked(profileId, exId)
                    }
                }
            binding.excersizesListLv.setAdapter(adapter)
            binding.excersizesListLv.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
                val exId = exs[groupPosition].excersizes[childPosition].ExcersizeId
                findNavController().navigate(
                    ProfileEditFragmentDirections.actionProfileEditFragmentToExcersizeViewFragment(
                        exId
                    )
                )
                false
            }
        })
    }

    private fun initBinding(inflater: LayoutInflater, container: ViewGroup?) {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_profile_edit, container, false)
        binding.profileEditViewModel = viewModel
        binding.lifecycleOwner = this
    }

    private fun initViewModel(application: Application) {
        val viewModelFactory =
            ProfileEditViewModelFactory(
                profileId,
                application
            )
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ProfileEditViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()
        viewModel.getAllExcersizes()
    }

}
