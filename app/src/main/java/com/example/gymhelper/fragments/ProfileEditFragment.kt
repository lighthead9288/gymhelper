package com.example.gymhelper.fragments

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
import com.example.gymhelper.fragments.ProfileEditFragmentArgs
import com.example.gymhelper.fragments.ProfileEditFragmentDirections
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentProfileEditBinding
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.viewmodel.ProfileEditViewModel
import com.example.gymhelper.viewmodel.ProfileEditViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class ProfileEditFragment : Fragment() {

    private lateinit var viewModel: ProfileEditViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentProfileEditBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_profile_edit, container, false)
        val application = requireNotNull(this.activity).application
        val db = ExcersizeDatabase.getInstance(application)

        val arguments =
            ProfileEditFragmentArgs.fromBundle(
                arguments!!
            )
        val profileId = arguments.trainingProfileId

        val viewModelFactory =
            ProfileEditViewModelFactory(
                profileId,
                db,
                application
            )
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ProfileEditViewModel::class.java)
        binding.profileEditViewModel = viewModel

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
                    if (selected)
                        viewModel.onExcersizeChecked(profileId, exId)
                    else
                        viewModel.onExcersizeUnchecked(profileId, exId)
                }
            binding.excersizesListLv.setAdapter(adapter)
            binding.excersizesListLv.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
                val exId = exs.get(groupPosition)?.excersizes.get(childPosition)?.ExcersizeId
                findNavController().navigate(
                    ProfileEditFragmentDirections.actionProfileEditFragmentToExcersizeViewFragment(
                        exId
                    )
                )
                false
            }
        })

        binding.setLifecycleOwner(this)

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        viewModel.getAllExcersizes()
    }

}
