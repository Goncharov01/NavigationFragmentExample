package com.navigationfragment.app.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.navigationfragment.app.databinding.ListItemBinding

class CatAdapter(var list: List<Cat>) : RecyclerView.Adapter<CatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(layoutInflater, parent, false)
        return CatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class CatViewHolder(var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(cat: Cat) {

        binding.textNameCat.text = cat.name
        binding.textAgeCat.text = cat.age.toString()
        binding.constraintList.setOnClickListener {
            println(cat.name)
        }
    }
}