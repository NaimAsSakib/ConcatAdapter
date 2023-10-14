package com.example.otthometest.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.otthometest.databinding.ItemRcvNameBinding

class NameAdapter(private val nameList: List<String>):
    RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    inner class NameViewHolder(val binding: ItemRcvNameBinding):
    RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameAdapter.NameViewHolder {
        val binding = ItemRcvNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NameViewHolder(binding)    }

    override fun onBindViewHolder(holder: NameAdapter.NameViewHolder, position: Int) {
        holder.binding.tvName.text = nameList[position]
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

}