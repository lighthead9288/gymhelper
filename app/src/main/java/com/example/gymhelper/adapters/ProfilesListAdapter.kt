package com.example.gymhelper.adapters

import com.example.gymhelper.databinding.ProfilesListItemBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.gymhelper.model.TrainingProfileWithDetails

class ProfilesListAdapter(val profListClickListener: ProfileListClickListener, val deleteProfileClickListener: DeleteProfileClickListener):
    ListAdapter<TrainingProfileWithDetails, ProfilesListAdapter.ViewHolder>(
        ProfilesListDiffCallback()
    ) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(profListClickListener, deleteProfileClickListener, item)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(
            parent
        )
    }

    class ViewHolder private constructor(private var binding: ProfilesListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(profListClickListener: ProfileListClickListener, deleteProfileClickListener: DeleteProfileClickListener, item: TrainingProfileWithDetails) {
            binding.profileListClickListener = profListClickListener
            /*  binding.deleteProgramIb.setOnClickListener {
                  deleteProgramClickListener.onClick(item)
              }*/
            binding.deleteProfileClickListener = deleteProfileClickListener
            binding.trainingProfile = item
            binding.isProfileChecked = item.isChecked
            binding.executePendingBindings()
        }

        companion object {

            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)

                val binding = ProfilesListItemBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(
                    binding
                )
            }
        }
    }

}

class ProfilesListDiffCallback: DiffUtil.ItemCallback<TrainingProfileWithDetails>() {
    override fun areItemsTheSame(oldItem: TrainingProfileWithDetails, newItem: TrainingProfileWithDetails): Boolean {
        return oldItem.trainingProfile.TrainingProfileId == newItem.trainingProfile.TrainingProfileId

    }

    override fun areContentsTheSame(oldItem: TrainingProfileWithDetails, newItem: TrainingProfileWithDetails): Boolean {
        return oldItem==newItem
    }


}

class ProfileListClickListener(val clickListener: (trainingProfile: TrainingProfileWithDetails)->Unit) {
    fun onClick(trainingProfile: TrainingProfileWithDetails) = clickListener(trainingProfile)
}

class DeleteProfileClickListener(val clickListener: (trainingProfile: TrainingProfileWithDetails)->Unit) {
    fun onClick(trainingProfile: TrainingProfileWithDetails) = clickListener(trainingProfile)

}