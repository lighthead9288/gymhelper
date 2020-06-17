package com.example.gymhelper.fragments

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.gymhelper.adapters.ProgramEditExpandableListAdapter
import com.example.gymhelper.fragments.ProgramEditFragmentArgs
import com.example.gymhelper.fragments.ProgramEditFragmentDirections
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentProfileEditBinding
import com.example.gymhelper.databinding.FragmentProgramEditBinding
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.viewmodel.ProgramEditViewModel
import com.example.gymhelper.viewmodel.ProgramEditViewModelFactory
import kotlinx.android.synthetic.main.fragment_add_dialog.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProgramEditFragment : Fragment() {

    private lateinit var viewModel: ProgramEditViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentProgramEditBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_program_edit, container, false)
        val application = requireNotNull(this.activity).application
        val db = ExcersizeDatabase.getInstance(application)

        val arguments =
            ProgramEditFragmentArgs.fromBundle(
                arguments!!
            )
        val trainingProgramId = arguments?.trainingProgramId

        val viewModelFactory =
            ProgramEditViewModelFactory(
                trainingProgramId,
                db,
                application
            )
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ProgramEditViewModel::class.java)
        binding.programEditViewModel = viewModel


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
                        //viewModel.getCurTrainingProgram()
                    },
                    { trainingDayId, groupPosition ->
                        findNavController().navigate(
                            ProgramEditFragmentDirections.actionProgramEditFragmentToExcersizesListFragment(
                                trainingDays.get(groupPosition).Excercizes.toTypedArray(),
                                trainingDayId
                            )
                        )
                    }
                )

            binding.curProgramEdLv.setAdapter(adapter)
            binding.curProgramEdLv.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
                    findNavController().navigate(
                        ProgramEditFragmentDirections.actionProgramEditFragmentToExcersizesListFragment(
                            trainingDays.get(groupPosition).Excercizes.toTypedArray(),
                            daysList.get(groupPosition).TrainingProgramDayId!!.toLong()
                        )
                    )
                    false }
        })

        viewModel.newTrainingDay.observe(viewLifecycleOwner, Observer {
           /* findNavController().navigate(ProgramEditFragmentDirections.actionProgramEditFragmentToExcersizesListFragment(
                mutableListOf<Excersize>().toTypedArray(), it)) */
        })



        binding.setLifecycleOwner(this)



        val addDayBtn = binding.root.findViewById<Button>(R.id.addDayBtn)
        addDayBtn.setOnClickListener {

            val dialogView = LayoutInflater.from(context).inflate(R.layout.fragment_add_dialog, null)

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



        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.getCurTrainingProgram()
    }
}
