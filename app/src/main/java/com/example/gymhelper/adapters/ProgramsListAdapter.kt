package com.example.gymhelper.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.gymhelper.databinding.ProgramsListItemBinding
import com.example.gymhelper.model.TrainingProgramWithDetails

class ProgramsListAdapter(
    val progListClickListener: ProgramListClickListener,
    val deleteProgramClickListener: DeleteProgramClickListener
) : ListAdapter<TrainingProgramWithDetails, ProgramsListAdapter.ViewHolder>(
        ProgramsListDiffCallback()
    ) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(progListClickListener, deleteProgramClickListener, item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(
            parent
        )
    }

    class ViewHolder private constructor(private var binding: ProgramsListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(
            progListClickListener: ProgramListClickListener,
            deleteProgramClickListener: DeleteProgramClickListener,
            item: TrainingProgramWithDetails) {
            binding.programListClickListener = progListClickListener
            binding.deleteProgramClickListener = deleteProgramClickListener
            binding.trainingProgram = item
            binding.isProgramChecked = item.isChecked
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ProgramsListItemBinding.inflate(
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

class ProgramsListDiffCallback: DiffUtil.ItemCallback<TrainingProgramWithDetails>() {
    override fun areItemsTheSame(
        oldItem: TrainingProgramWithDetails,
        newItem: TrainingProgramWithDetails
    ): Boolean {
        return oldItem.trainingProgram.TrainingProgramId == newItem.trainingProgram.TrainingProgramId

    }

    override fun areContentsTheSame(
        oldItem: TrainingProgramWithDetails,
        newItem: TrainingProgramWithDetails
    ): Boolean {
        return oldItem==newItem
    }
}

class ProgramListClickListener(val clickListener: (trainingProgram: TrainingProgramWithDetails)->Unit) {
    fun onClick(trainingProgram: TrainingProgramWithDetails) = clickListener(trainingProgram)
}

class DeleteProgramClickListener(val clickListener: (trainingProgram: TrainingProgramWithDetails)->Unit) {
    fun onClick(trainingProgram: TrainingProgramWithDetails) = clickListener(trainingProgram)

}