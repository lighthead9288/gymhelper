package com.example.gymhelper.fragments

import android.app.AlertDialog
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.gymhelper.*
import com.example.gymhelper.adapters.DeleteProfileClickListener
import com.example.gymhelper.adapters.ProfileListClickListener
import com.example.gymhelper.adapters.ProfilesListAdapter
import com.example.gymhelper.databinding.FragmentProfilesListBinding
import com.example.gymhelper.viewmodel.ProfilesListViewModel
import com.example.gymhelper.factories.ProfilesListViewModelFactory
import kotlinx.android.synthetic.main.fragment_add_dialog.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProfilesListFragment : Fragment() {

    private lateinit var binding: FragmentProfilesListBinding
    private lateinit var viewModel: ProfilesListViewModel
    private lateinit var profilesListAdapter: ProfilesListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application = requireNotNull(this.activity).application

        initViewModel(application)
        initBinding(inflater, application)
        initObservables()

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun initObservables() {
        viewModel.trainingProfilesList.observe(viewLifecycleOwner, Observer {
            it?.let {
                profilesListAdapter.submitList(it)
            }
        })
    }

    private fun initBinding(inflater: LayoutInflater, application: Application) {
        binding = FragmentProfilesListBinding.inflate(inflater)
        binding.viewModel = viewModel

        profilesListAdapter =
            ProfilesListAdapter(
                ProfileListClickListener {
                    this.findNavController().navigate(
                        ProfilesListFragmentDirections.actionProfilesListFragmentToProfileEditFragment(
                            it.trainingProfile.TrainingProfileId
                        )
                    )
                },
                DeleteProfileClickListener {
                    viewModel.deleteTrainingProfile(it.trainingProfile)
                })
        binding.profilesListRv.adapter = profilesListAdapter
        binding.profilesListRv.addItemDecoration(
            DividerItemDecoration(
                application,
                DividerItemDecoration.VERTICAL
            )
        )

        binding.addProfileFb.setOnClickListener {
            val dialogView = LayoutInflater.from(context).inflate(
                R.layout.fragment_add_dialog,
                null
            )
            val builder = AlertDialog.Builder(context).setView(dialogView).setTitle("")
            val alertDialog = builder.show()

            dialogView.confirmAdd.setOnClickListener {
                alertDialog.dismiss()
                viewModel.addNewTrainingProfile(dialogView.name.text.toString())
            }

            dialogView.cancelAdd.setOnClickListener {
                alertDialog.dismiss()
            }
        }

        binding.lifecycleOwner = this

    }

    private fun initViewModel(application: Application) {
        val viewModelFactory =
            ProfilesListViewModelFactory(
                application
            )
        viewModel = ViewModelProvider(this, viewModelFactory).get(
            ProfilesListViewModel::class.java
        )
    }

    override fun onResume() {
        super.onResume()
        viewModel.getTrainingProfiles()
    }

}
