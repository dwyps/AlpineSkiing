package com.example.alpineskiing2020season.ui.events.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.alpineskiing2020season.data.model.Event
import com.example.alpineskiing2020season.databinding.ItemEventBinding

class EventsRecyclerAdapter : ListAdapter<Event, EventsRecyclerAdapter.ViewHolder>(StandingsDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = getItem(position)

        holder.bind(item)
    }

    class ViewHolder private constructor(
        private val binding: ItemEventBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Event) {
            binding.itemEvent = item
            binding.executePendingBindings()
        }

        companion object {

            fun from(parent: ViewGroup) : ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)

                val binding = ItemEventBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }

    }

    class StandingsDiffCallback : DiffUtil.ItemCallback<Event>() {
        override fun areItemsTheSame(oldItem: Event, newItem: Event): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Event, newItem: Event): Boolean {
            return oldItem == newItem
        }

    }
}