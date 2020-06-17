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
import com.example.gymhelper.fragments.ExcersizesListFragmentArgs
import com.example.gymhelper.fragments.ExcersizesListFragmentDirections
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentExcersizesListBinding
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.viewmodel.ExcersizesListViewModel
import com.example.gymhelper.viewmodel.ExcersizesListViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class ExcersizesListFragment : Fragment() {

    private lateinit var viewModel: ExcersizesListViewModel

    private var trainingDayId: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentExcersizesListBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_excersizes_list, container, false)
        val application = requireNotNull(this.activity).application
        val db = ExcersizeDatabase.getInstance(application)

        var arguments =
            ExcersizesListFragmentArgs.fromBundle(
                arguments!!
            )
       /* val trainingProgramId = arguments?.trainingProgramId
        val dayName = arguments?.dayName*/

        trainingDayId = arguments?.trainingDayId
        val excersizes = arguments?.curDayExcersizes.toMutableList()

        val viewModelFactory =
            ExcersizesListViewModelFactory(
                trainingDayId,
                excersizes,
                db,
                application
            )
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ExcersizesListViewModel::class.java)
        binding.fragmentExcersizesListViewModel = viewModel


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
                    if (selected)
                        viewModel.onExcersizeChecked(trainingDayId, exId)
                    else
                        viewModel.onExcersizeUnchecked(trainingDayId, exId)
                }
            binding.excersizesListLv.setAdapter(adapter)
            binding.excersizesListLv.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
                val exId = exs.get(groupPosition)?.excersizes.get(childPosition)?.ExcersizeId
                findNavController().navigate(
                    ExcersizesListFragmentDirections.actionExcersizesListFragmentToExcersizeViewFragment(
                        exId
                    )
                )
                false
            }
        })


        binding.setLifecycleOwner(this)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        viewModel.getAllExcersizes()
    }




}
