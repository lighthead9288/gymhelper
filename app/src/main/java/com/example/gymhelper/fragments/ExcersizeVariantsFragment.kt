package com.example.gymhelper.fragments

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
import com.example.gymhelper.adapters.ExcersizeVariantClickListener
import com.example.gymhelper.adapters.ExcersizeVariantsListAdapter
import com.example.gymhelper.databinding.FragmentExcersizeVariantsBinding
import com.example.gymhelper.viewmodel.ExcersizeVariantsViewModel
import com.example.gymhelper.factories.ExcersizeVariantsViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class ExcersizeVariantsFragment : Fragment() {

    private lateinit var binding: FragmentExcersizeVariantsBinding
    private lateinit var viewModel: ExcersizeVariantsViewModel
    private lateinit var excersizeVariantsListAdapter: ExcersizeVariantsListAdapter
    private var exId: Long? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val application = requireNotNull(this.activity).application
        var arguments =
            ExcersizeViewFragmentArgs.fromBundle(
                requireArguments()
            )
        exId = arguments.excersizeId

        initViewModel(application)
        initBinding(inflater, application)
        initObservables()

        return binding.root
    }

    private fun initObservables() {
        viewModel.excersizeVariants.observe(viewLifecycleOwner, Observer {
            it?.let {
                excersizeVariantsListAdapter.submitList(it)
            }
        })
    }

    private fun initBinding(inflater: LayoutInflater, application: Application) {
        binding = FragmentExcersizeVariantsBinding.inflate(inflater)
        binding.viewModel = viewModel

        excersizeVariantsListAdapter =
            ExcersizeVariantsListAdapter(
                ExcersizeVariantClickListener {
                    findNavController().navigate(
                        ExcersizeVariantsFragmentDirections.actionExcersizeVariantsFragmentToExcersizeViewFragment(
                            it.ExcersizeId
                        )
                    )
                })

        binding.excersizeVariantsRv.adapter = excersizeVariantsListAdapter
        binding.excersizeVariantsRv.addItemDecoration(DividerItemDecoration (
                application,
                DividerItemDecoration.VERTICAL
            )
        )
        binding.lifecycleOwner = this

    }

    private fun initViewModel(application: Application) {
        val viewModelFactory =
            ExcersizeVariantsViewModelFactory(
                exId,
                application
            )
        viewModel = ViewModelProvider(this, viewModelFactory).get(ExcersizeVariantsViewModel::class.java)
    }

}
