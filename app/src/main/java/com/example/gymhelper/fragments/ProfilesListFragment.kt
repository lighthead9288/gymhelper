package com.example.gymhelper.fragments

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.gymhelper.*
import com.example.gymhelper.adapters.DeleteProfileClickListener
import com.example.gymhelper.adapters.ProfileListClickListener
import com.example.gymhelper.adapters.ProfilesListAdapter
import com.example.gymhelper.databinding.FragmentProfilesListBinding
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.viewmodel.ProfilesListViewModel
import com.example.gymhelper.viewmodel.ProfilesListViewModelFactory
import kotlinx.android.synthetic.main.fragment_add_dialog.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProfilesListFragment : Fragment() {

    private lateinit var viewModel: ProfilesListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentProfilesListBinding.inflate(inflater)
        val application = requireNotNull(this.activity).application
        val dataSource = ExcersizeDatabase.getInstance(application)

        val viewModelFactory =
            ProfilesListViewModelFactory(
                dataSource,
                application
            )

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ProfilesListViewModel::class.java)

        binding.viewModel = viewModel

        val adapter =
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
        binding.profilesListRv.adapter = adapter
        binding.profilesListRv.addItemDecoration(DividerItemDecoration(application, DividerItemDecoration.VERTICAL))

        viewModel.trainingProfilesList.observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.submitList(it)
            }
        })

        binding.addProfileFb.setOnClickListener {
            val dialogView = LayoutInflater.from(context).inflate(R.layout.fragment_add_dialog,null)

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

        binding.setLifecycleOwner(this)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        viewModel.getTrainingProfiles()
    }

}
