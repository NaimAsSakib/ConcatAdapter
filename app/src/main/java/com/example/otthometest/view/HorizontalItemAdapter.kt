package com.example.otthometest.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.otthometest.databinding.ItemRcvHorizontalBinding

class HorizontalItemAdapter(private val imageResIds: List<Int> ): RecyclerView.Adapter<HorizontalItemAdapter.Viewholder>() {

    inner class Viewholder( val binding: ItemRcvHorizontalBinding ):
    RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HorizontalItemAdapter.Viewholder {
        val binding = ItemRcvHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Viewholder(binding)    }



    override fun onBindViewHolder(holder: HorizontalItemAdapter.Viewholder, position: Int) {
        holder.binding.ivWatchListContent.setImageResource(imageResIds[position])
    }

    override fun getItemCount(): Int {
        return imageResIds.size
    }

}