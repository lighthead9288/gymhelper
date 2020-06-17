package com.example.gymhelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.gymhelper.adapters.ExcersizeVariantClickListener
import com.example.gymhelper.fragments.ExcersizeVariantsFragmentDirections
import com.example.gymhelper.adapters.ExcersizeVariantsListAdapter
import com.example.gymhelper.fragments.ExcersizeViewFragmentArgs
import com.example.gymhelper.databinding.FragmentExcersizeVariantsBinding
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.viewmodel.ExcersizeVariantsViewModel
import com.example.gymhelper.viewmodel.ExcersizeVariantsViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class ExcersizeVariantsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      //  val binding: FragmentExcersizeVariantsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_excersize_variants, container, false)
        val binding = FragmentExcersizeVariantsBinding.inflate(inflater)

        val application = requireNotNull(this.activity).application
        val db = ExcersizeDatabase.getInstance(application)

        var arguments =
            ExcersizeViewFragmentArgs.fromBundle(
                arguments!!
            )
        val exId = arguments?.excersizeId

        val viewModelFactory =
            ExcersizeVariantsViewModelFactory(
                exId,
                db,
                application
            )
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(ExcersizeVariantsViewModel::class.java)
        binding.viewModel = viewModel

        val adapter =
            ExcersizeVariantsListAdapter(
                ExcersizeVariantClickListener {
                    findNavController().navigate(
                        ExcersizeVariantsFragmentDirections.actionExcersizeVariantsFragmentToExcersizeViewFragment(
                            it.ExcersizeId
                        )
                    )
                })

        binding.excersizeVariantsRv.adapter = adapter
        binding.excersizeVariantsRv.addItemDecoration(DividerItemDecoration(application, DividerItemDecoration.VERTICAL))

        viewModel.excersizeVariants.observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.submitList(it)
            }

        })

        binding.setLifecycleOwner(this)


        return binding.root
    }



}
