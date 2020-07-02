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
import com.example.gymhelper.databinding.FragmentExcersizesListBinding
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.viewmodel.ExcersizesListViewModel
import com.example.gymhelper.factories.ExcersizesListViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class ExcersizesListFragment : Fragment() {

    private lateinit var binding: FragmentExcersizesListBinding
    private lateinit var viewModel: ExcersizesListViewModel
    private lateinit var excersizes: List<Excersize>
    private var trainingDayId: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application = requireNotNull(this.activity).application
        var arguments =
            ExcersizesListFragmentArgs.fromBundle(
                requireArguments()
            )
        trainingDayId = arguments.trainingDayId
        excersizes = arguments.curDayExcersizes.toMutableList()

        initViewModel(application)
        initBinding(inflater, container)
        initObservables(application)

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun initObservables(application: Application) {
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
                    excersizes
                ) { exId: Long, selected: Boolean ->
                    if (selected) {
                        viewModel.onExcersizeChecked(trainingDayId, exId)
                    } else {
                        viewModel.onExcersizeUnchecked(trainingDayId, exId)
                    }
                }
            binding.excersizesListLv.setAdapter(adapter)
            binding.excersizesListLv.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
                val exId = exs[groupPosition].excersizes[childPosition].ExcersizeId
                findNavController().navigate(
                    ExcersizesListFragmentDirections.actionExcersizesListFragmentToExcersizeViewFragment(
                        exId
                    )
                )
                false
            }
        })
    }

    private fun initBinding(inflater: LayoutInflater, container: ViewGroup?) {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_excersizes_list, container, false)
        binding.fragmentExcersizesListViewModel = viewModel
        binding.lifecycleOwner = this
    }

    private fun initViewModel(application: Application) {
        val viewModelFactory =
            ExcersizesListViewModelFactory(
                trainingDayId,
                application
            )
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ExcersizesListViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()
        viewModel.getAllExcersizes()
    }

}
