package com.example.gymhelper.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.gymhelper.fragments.ExcersizeViewFragmentArgs
import com.example.gymhelper.fragments.ExcersizeViewFragmentDirections
import com.example.gymhelper.adapters.PhotosAdapter
import com.example.gymhelper.R
import com.example.gymhelper.databinding.FragmentExcersizeViewBinding
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.viewmodel.ExcersizeViewViewModel
import com.example.gymhelper.viewmodel.ExcersizeViewViewModelFactory


/**
 * A simple [Fragment] subclass.
 */
class ExcersizeViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentExcersizeViewBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_excersize_view, container, false)
        val application = requireNotNull(this.activity).application
        val db = ExcersizeDatabase.getInstance(application)

        var arguments =
            ExcersizeViewFragmentArgs.fromBundle(
                arguments!!
            )
        val exId = arguments?.excersizeId

        val viewModelFactory =
            ExcersizeViewViewModelFactory(
                exId,
                db,
                application
            )
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(ExcersizeViewViewModel::class.java)
        binding.excersizeViewViewModel = viewModel

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

      /*  viewModel.excersizeVariants.observe(viewLifecycleOwner, Observer {
            val list = it
            val s = ""
        })*/

        binding.photosRv.adapter =
            PhotosAdapter()



        binding.setLifecycleOwner(this)

        // Inflate the layout for this fragment
        return binding.root
    }
}
