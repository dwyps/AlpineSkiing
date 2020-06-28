package com.example.alpineskiing2020season.ui.standings.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.alpineskiing2020season.data.model.Racer
import com.example.alpineskiing2020season.databinding.ItemRacerBinding

class StandingsRecyclerAdapter : ListAdapter<Racer, StandingsRecyclerAdapter.ViewHolder>(StandingsDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = getItem(position)

        holder.bind(item)
    }

    class ViewHolder private constructor(
        private val binding: ItemRacerBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Racer) {
            binding.itemRacer = item
            binding.executePendingBindings()
        }

        companion object {

            fun from(parent: ViewGroup) : ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)

                val binding = ItemRacerBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }

    }

    class StandingsDiffCallback : DiffUtil.ItemCallback<Racer>() {
        override fun areItemsTheSame(oldItem: Racer, newItem: Racer): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Racer, newItem: Racer): Boolean {
            return oldItem == newItem
        }

    }
}