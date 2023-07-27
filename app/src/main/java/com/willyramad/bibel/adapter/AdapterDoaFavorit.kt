package com.willyramad.bibel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.bibel.data.DataDoa
import com.willyramad.bibel.databinding.ItemDoaBinding
import com.willyramad.bibel.localdoa.DataFavDoa

class AdapterDoaFavorit (val listFavDoa : List<DataFavDoa>): RecyclerView.Adapter<AdapterDoaFavorit.ViewHolder>()  {

    class ViewHolder (var binding : ItemDoaBinding) : RecyclerView.ViewHolder(binding.root){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemDoaBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFavDoa.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.namadoa.text = listFavDoa[position].juduldoa
    }
}