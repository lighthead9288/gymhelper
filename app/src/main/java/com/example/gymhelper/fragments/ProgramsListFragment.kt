package com.example.gymhelper.fragments

import android.app.AlertDialog
import android.app.Application
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
import com.example.gymhelper.adapters.DeleteProgramClickListener
import com.example.gymhelper.adapters.ProgramListClickListener
import com.example.gymhelper.adapters.ProgramsListAdapter
import com.example.gymhelper.databinding.FragmentProgramsListBinding
import com.example.gymhelper.viewmodel.ProgramsListViewModel
import com.example.gymhelper.factories.ProgramsListViewModelFactory
import kotlinx.android.synthetic.main.fragment_add_dialog.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProgramsListFragment : Fragment() {

    private lateinit var binding: FragmentProgramsListBinding
    private lateinit var programsListViewModel: ProgramsListViewModel
    private lateinit var programsListAdapter: ProgramsListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application = requireNotNull(this.activity).application

        initViewModel(application)
        initBinding(inflater, application)
        initObservables()

        return binding.root
    }

    private fun initObservables() {
        programsListViewModel.trainingProgramsList.observe(viewLifecycleOwner, Observer {
            it?.let {
                programsListAdapter.submitList(it)
            }
        })
    }

    private fun initBinding(inflater: LayoutInflater, application: Application) {
        binding = FragmentProgramsListBinding.inflate(inflater)
        binding.viewModel = programsListViewModel

        programsListAdapter =
            ProgramsListAdapter(
                ProgramListClickListener {
                    this.findNavController().navigate(
                        ProgramsListFragmentDirections.actionProgramsListFragmentToProgramEditFragment(
                            it.trainingProgram.TrainingProgramId
                        )
                    )
                },
                DeleteProgramClickListener {
                    programsListViewModel.deleteTrainingProgram(it.trainingProgram)
                })
        binding.programsListRv.adapter = programsListAdapter
        binding.programsListRv.addItemDecoration(DividerItemDecoration(application, DividerItemDecoration.VERTICAL))
        binding.addProgramFb.setOnClickListener {
            val dialogView = LayoutInflater.from(context).inflate(R.layout.fragment_add_dialog,null)

            val builder = AlertDialog.Builder(context).setView(dialogView).setTitle("")
            val alertDialog = builder.show()

            dialogView.confirmAdd.setOnClickListener {
                alertDialog.dismiss()
                programsListViewModel.addNewTrainingProgram(dialogView.name.text.toString())
            }

            dialogView.cancelAdd.setOnClickListener {
                alertDialog.dismiss()
            }
        }

        binding.lifecycleOwner = this
    }

    private fun initViewModel(application: Application) {
        val viewModelFactory =
            ProgramsListViewModelFactory(
                application
            )
        programsListViewModel = ViewModelProviders.of(this, viewModelFactory).get(
            ProgramsListViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()
        programsListViewModel.getTrainingPrograms()
    }

}
