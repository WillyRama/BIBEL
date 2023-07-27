package com.willyramad.bibel.adapter

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.bibel.data.DataDoa
import com.willyramad.bibel.databinding.ItemDoaBinding

class DoaAdapter (var listDoa : ArrayList<DataDoa>) : RecyclerView.Adapter<DoaAdapter.ViewHolder>(){
    lateinit var mediaplayer: MediaPlayer
    var onClick : ((DataDoa) -> Unit)? = null
    class ViewHolder (var binding : ItemDoaBinding) : RecyclerView.ViewHolder(binding.root){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemDoaBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDoa.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.namadoa.text = listDoa[position].juduldoa
        holder.binding.crDoa.setOnClickListener {
            onClick?.invoke(listDoa[position])

        }
    }

    fun setDataDoa(Doalist : ArrayList<DataDoa>){
        this.listDoa = Doalist
    }

}