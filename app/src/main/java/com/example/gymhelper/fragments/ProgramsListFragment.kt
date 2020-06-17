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
import com.example.gymhelper.adapters.DeleteProgramClickListener
import com.example.gymhelper.adapters.ProgramListClickListener
import com.example.gymhelper.adapters.ProgramsListAdapter
import com.example.gymhelper.databinding.FragmentProgramsListBinding
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.viewmodel.ProgramsListViewModel
import com.example.gymhelper.viewmodel.ProgramsListViewModelFactory
import kotlinx.android.synthetic.main.fragment_add_dialog.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProgramsListFragment : Fragment() {

    private lateinit var binding: FragmentProgramsListBinding

    private lateinit var programsListViewModel: ProgramsListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProgramsListBinding.inflate(inflater)

        val application = requireNotNull(this.activity).application
        val dataSource = ExcersizeDatabase.getInstance(application)
        val viewModelFactory =
            ProgramsListViewModelFactory(
                dataSource,
                application
            )

        programsListViewModel = ViewModelProviders.of(this, viewModelFactory).get(
            ProgramsListViewModel::class.java)

        binding.viewModel = programsListViewModel

        val adapter =
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
        binding.programsListRv.adapter = adapter
        programsListViewModel.trainingProgramsList.observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.submitList(it)
            }
        })
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

        binding.setLifecycleOwner(this)

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        programsListViewModel.getTrainingPrograms()
    }

}
