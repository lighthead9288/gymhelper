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
import com.example.gymhelper.adapters.ProgramViewExpandableListAdapter
import com.example.gymhelper.fragments.ProgramViewFragmentDirections
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentProgramViewBinding
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.viewmodel.ProgramViewViewModel
import com.example.gymhelper.viewmodel.ProgramViewViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class ProgramViewFragment : Fragment() {

    private lateinit var viewModel: ProgramViewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentProgramViewBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_program_view, container, false)
        val application = requireNotNull(this.activity).application
        val db = ExcersizeDatabase.getInstance(application)

        val viewModelFactory =
            ProgramViewViewModelFactory(
                db,
                application
            )
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ProgramViewViewModel::class.java)
        binding.viewModel = viewModel

        viewModel.curTrainingProgram.observe(viewLifecycleOwner, Observer {
            val trainingDays = it.trainingDays
            val daysList = trainingDays.map { it.Day }

            val adapter =
                ProgramViewExpandableListAdapter(
                    application,
                    daysList,
                    trainingDays,
                    R.layout.programview_expandable_list_group_layout,
                    R.layout.programs_expandable_list_child_layout
                )

            binding.curProgramLv.setAdapter(adapter)
            binding.curProgramLv.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
                findNavController().navigate(
                    ProgramViewFragmentDirections.actionProgramViewFragmentToExcersizeViewFragment(
                        trainingDays.get(groupPosition).Excercizes.get(childPosition).ExcersizeId
                    )
                )
                false }
        })

        binding.setLifecycleOwner(this)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.getCurrentTrainingProgram()
    }

}
