package com.example.gymhelper.fragments

import android.app.AlertDialog
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.gymhelper.adapters.ProgramEditExpandableListAdapter
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentProgramEditBinding
import com.example.gymhelper.viewmodel.ProgramEditViewModel
import com.example.gymhelper.factories.ProgramEditViewModelFactory
import kotlinx.android.synthetic.main.fragment_add_dialog.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProgramEditFragment : Fragment() {

    private lateinit var binding: FragmentProgramEditBinding
    private lateinit var viewModel: ProgramEditViewModel
    private var trainingProgramId: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application = requireNotNull(this.activity).application
        val arguments =
            ProgramEditFragmentArgs.fromBundle(
                requireArguments()
            )
        trainingProgramId = arguments.trainingProgramId

        initViewModel(application)
        initBinding(inflater, container)
        initObservables(application)

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun initObservables(application: Application) {
        viewModel.curTrainingProgram.observe(viewLifecycleOwner, Observer {
            val trainingDays = it.trainingDays
            val daysList = trainingDays.map { it.Day }

            val adapter =
                ProgramEditExpandableListAdapter(
                    application,
                    daysList,
                    trainingDays,
                    R.layout.programs_expandable_list_group_layout,
                    R.layout.programs_expandable_list_child_layout,
                    { trainingDayId ->
                        viewModel.deleteTrainingDay(trainingDayId)
                    },
                    { trainingDayId, groupPosition ->
                        findNavController().navigate(
                            ProgramEditFragmentDirections.actionProgramEditFragmentToExcersizesListFragment(
                                trainingDays[groupPosition].Excercizes.toTypedArray(),
                                trainingDayId
                            )
                        )
                    }
                )

            binding.curProgramEdLv.setAdapter(adapter)
            binding.curProgramEdLv.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
                findNavController().navigate(
                    ProgramEditFragmentDirections.actionProgramEditFragmentToExcersizesListFragment(
                        trainingDays[groupPosition].Excercizes.toTypedArray(),
                        daysList[groupPosition].TrainingProgramDayId
                    )
                )
                false }
        })

        viewModel.newTrainingDay.observe(viewLifecycleOwner, Observer {
        })
    }

    private fun initBinding(inflater: LayoutInflater, container: ViewGroup?) {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_program_edit, container, false)
        binding.programEditViewModel = viewModel
        val addDayBtn = binding.root.findViewById<Button>(R.id.addDayBtn)
        addDayBtn.setOnClickListener {
            val dialogView = LayoutInflater.from(context).inflate(
                R.layout.fragment_add_dialog,
                null
            )
            val builder = AlertDialog.Builder(context).setView(dialogView).setTitle("")
            val alertDialog = builder.show()

            dialogView.confirmAdd.setOnClickListener {
                alertDialog.dismiss()
                viewModel.addNewTrainingDay(trainingProgramId, dialogView.name.text.toString())
            }

            dialogView.cancelAdd.setOnClickListener {
                alertDialog.dismiss()
            }

        }
        binding.lifecycleOwner = this
    }

    private fun initViewModel(application: Application) {
        val viewModelFactory =
            ProgramEditViewModelFactory(
                trainingProgramId,
                application
            )
        viewModel = ViewModelProvider(this, viewModelFactory).get(
            ProgramEditViewModel::class.java
        )
    }

    override fun onResume() {
        super.onResume()
        viewModel.getCurTrainingProgram()
    }
}
