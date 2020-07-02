package com.example.gymhelper.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.gymhelper.databinding.ExcersizeVariantsListItemBinding
import com.example.gymhelper.db.Excersize

class ExcersizeVariantsListAdapter(
    val exVariantClickListener: ExcersizeVariantClickListener
): ListAdapter<Excersize, ExcersizeVariantsListAdapter.ViewHolder>(
        ExcersizeVariantsListDiffCallback()
    ) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(exVariantClickListener, item)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(
            parent
        )
    }

    class ViewHolder private constructor(private var binding: ExcersizeVariantsListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(exVariantClickListener: ExcersizeVariantClickListener, item: Excersize) {
            binding.excersizeVariantClickListener = exVariantClickListener
            binding.excersize = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ExcersizeVariantsListItemBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
                return ViewHolder(
                    binding
                )
            }
        }
    }

}

class ExcersizeVariantsListDiffCallback: DiffUtil.ItemCallback<Excersize>() {
    override fun areItemsTheSame(oldItem: Excersize, newItem: Excersize): Boolean {
        return oldItem.ExcersizeId == newItem.ExcersizeId
    }

    override fun areContentsTheSame(oldItem: Excersize, newItem: Excersize): Boolean {
        return oldItem==newItem
    }
}

class ExcersizeVariantClickListener(val clickListener: (excersize: Excersize)->Unit) {
    fun onClick(excersize: Excersize) = clickListener(excersize)
}