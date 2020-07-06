package com.example.alpineskiing2020season.ui.records.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.alpineskiing2020season.data.model.Record
import com.example.alpineskiing2020season.databinding.ItemRecordsBinding


class RecordsRecyclerAdapter : ListAdapter<Record, RecordsRecyclerAdapter.ViewHolder>(StandingsDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = getItem(position)

        holder.bind(item)
    }

    class ViewHolder private constructor(
        private val binding: ItemRecordsBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Record) {
            binding.itemRecord = item
            binding.executePendingBindings()
        }

        companion object {

            fun from(parent: ViewGroup) : ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)

                val binding = ItemRecordsBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }

    }

    class StandingsDiffCallback : DiffUtil.ItemCallback<Record>() {
        override fun areItemsTheSame(oldItem: Record, newItem: Record): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Record, newItem: Record): Boolean {
            return oldItem == newItem
        }

    }
}