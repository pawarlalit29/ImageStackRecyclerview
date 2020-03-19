package com.lalitpawar.imagestackrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lalitpawar.imagestackrecyclerview.databinding.ItemViewBinding

class ImageViewAdapter : RecyclerView.Adapter<ImageViewAdapter.ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        var binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ImageViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {

    }

    class ImageViewHolder(var binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root){

    }
}