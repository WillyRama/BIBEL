package com.willyramad.bibel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.bibel.databinding.ItemJuzammaBinding
import com.willyramad.bibel.localjuz.DataFavJuz

class AdapterJuzFavorit(val lisfavjuz : List<DataFavJuz>): RecyclerView.Adapter<AdapterJuzFavorit.ViewHolder>()  {
    class ViewHolder (var binding: ItemJuzammaBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemJuzammaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lisfavjuz.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.namaSurah.text = lisfavjuz[position].indo
    }
}