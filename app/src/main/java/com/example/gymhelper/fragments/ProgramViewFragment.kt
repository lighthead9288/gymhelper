package com.example.gymhelper.fragments

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.gymhelper.adapters.ProgramViewExpandableListAdapter
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentProgramViewBinding
import com.example.gymhelper.viewmodel.ProgramViewViewModel
import com.example.gymhelper.factories.ProgramViewViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class ProgramViewFragment : Fragment() {

    private lateinit var binding: FragmentProgramViewBinding
    private lateinit var viewModel: ProgramViewViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application = requireNotNull(this.activity).application

        initViewModel(application)
        initBinding(inflater, container)
        initObservables(application)

        return binding.root
    }

    private fun initObservables(application: Application) {
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
    }

    private fun initBinding(inflater: LayoutInflater, container: ViewGroup?) {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_program_view, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    private fun initViewModel(application: Application) {
        val viewModelFactory =
            ProgramViewViewModelFactory(
                application
            )
        viewModel = ViewModelProvider(this, viewModelFactory).get(ProgramViewViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()
        viewModel.getCurrentTrainingProgram()
    }

}
