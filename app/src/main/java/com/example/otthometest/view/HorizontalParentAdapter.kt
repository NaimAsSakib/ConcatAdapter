package com.example.otthometest.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.otthometest.databinding.ItemRcvParentHorizontalBinding

class HorizontalParentAdapter (private val list: List<List<Int>>): RecyclerView.Adapter<HorizontalParentAdapter.Viewholder>(){
    class Viewholder(val binding: ItemRcvParentHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HorizontalParentAdapter.Viewholder {
        val binding = ItemRcvParentHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: HorizontalParentAdapter.Viewholder, position: Int) {

        holder.binding.rcvHorizontalParent.layoutManager = LinearLayoutManager(holder.binding.rcvHorizontalParent.context, RecyclerView.HORIZONTAL, false)
        holder.binding.rcvHorizontalParent.adapter = HorizontalItemAdapter(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}