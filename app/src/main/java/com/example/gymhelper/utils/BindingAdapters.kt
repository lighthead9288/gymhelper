package com.example.gymhelper.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.gymhelper.R
import com.example.gymhelper.adapters.PhotosAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<String>?) {
    val adapter = recyclerView.adapter as PhotosAdapter
    adapter.submitList(data)
}

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        Glide.with(imgView.context)
            .load(imgUrl)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.photo_preload)
                .error(R.drawable.noimage))
            .into(imgView)
    }
}
