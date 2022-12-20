/*
package com.example.testinghumbergerproject.ui.gallery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.testinghumbergerproject.R
import com.example.testinghumbergerproject.databinding.ItemSkilletBinding
import com.makeramen.roundedimageview.RoundedImageView

class AdapterSkillet (private val skilletList:ArrayList<Model>):Adapter<AdapterSkillet.SkillViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SkillViewHolder(
        ItemSkilletBinding.inflate(LayoutInflater.from(parent.context), parent, false),
    )

    override fun onBindViewHolder(holder: AdapterSkillet.SkillViewHolder, position: Int) {
holder.bind(skilletList[position])    }

    override fun getItemCount()=skilletList.size

    inner class SkillViewHolder(val binding: ItemSkilletBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(model:Model){
            binding.recyclerImag.loadImage(model.oneImg)
            binding.recyclerImage.loadImage(model.twoImage)
        }

        }
    }
*/
