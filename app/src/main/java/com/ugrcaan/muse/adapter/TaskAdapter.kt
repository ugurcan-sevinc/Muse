package com.ugrcaan.muse.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ugrcaan.muse.R
import com.ugrcaan.muse.databinding.RowTaskBinding
import com.ugrcaan.muse.model.Task

class TaskAdapter(private val taskList: List<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = RowTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.bind(task)
    }

    override fun getItemCount() = taskList.size

    inner class TaskViewHolder(private val binding: RowTaskBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(task: Task) {
            binding.taskHeader.text = task.header
            binding.taskDescription.text = task.description
            binding.dateLabel.text = task.date
            binding.dueTimeLabel.text = task.time

            when(task.priority) {
                1 -> binding.priorityIndicator.setImageResource(R.drawable.ic_low_priority)
                2 -> binding.priorityIndicator.setImageResource(R.drawable.ic_med_priority)
                3 -> binding.priorityIndicator.setImageResource(R.drawable.ic_high_priority)
                else -> { // Note the block
                    Log.e("ADAPTER", "WRONG PRIORITY")
                }
            }
        }
    }


}