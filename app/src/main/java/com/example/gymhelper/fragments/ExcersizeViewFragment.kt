package com.example.gymhelper.fragments

import android.app.Application
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.gymhelper.adapters.PhotosAdapter
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentExcersizeViewBinding
import com.example.gymhelper.viewmodel.ExcersizeViewViewModel
import com.example.gymhelper.factories.ExcersizeViewViewModelFactory


/**
 * A simple [Fragment] subclass.
 */
class ExcersizeViewFragment : Fragment() {

    private lateinit var binding: FragmentExcersizeViewBinding
    private lateinit var viewModel: ExcersizeViewViewModel
    private var exId: Long = 0

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
        initBinding(inflater, container)
        initObservables()

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun initObservables() {
        viewModel.excersize.observe(viewLifecycleOwner, Observer {
            val exName = it.excersize.Name

            binding.youtubeFb.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setPackage("com.google.android.youtube")
                intent.data = Uri.parse("https://www.youtube.com/results?search_query=$exName")
                startActivity(intent)
            }

            binding.excersizeVariantsFb.setOnClickListener {
                findNavController().navigate(
                    ExcersizeViewFragmentDirections.actionExcersizeViewFragmentToExcersizeVariantsFragment(
                        exId
                    )
                )
            }
        })
    }

    private fun initBinding(inflater: LayoutInflater, container: ViewGroup?) {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_excersize_view, container, false)
        binding.excersizeViewViewModel = viewModel
        binding.photosRv.adapter =
            PhotosAdapter()
        binding.lifecycleOwner = this
    }

    private fun initViewModel(application: Application) {
        val viewModelFactory =
            ExcersizeViewViewModelFactory(
                exId,
                application
            )
        viewModel = ViewModelProvider(this, viewModelFactory).get(ExcersizeViewViewModel::class.java)
    }
}
