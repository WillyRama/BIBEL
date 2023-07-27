package com.willyramad.bibel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.bibel.databinding.ItemDetailsurahBinding
import com.willyramad.bibel.modeljuzamma.ModelAyat
import kotlinx.android.synthetic.main.item_detailsurah.view.ayatarab
import kotlinx.android.synthetic.main.item_detailsurah.view.ayatarti
import kotlinx.android.synthetic.main.item_detailsurah.view.ayatlatin
import java.util.ArrayList

class AdapterDeskripsiSurah() : RecyclerView.Adapter<AdapterDeskripsiSurah.ViewHolder>() {
    private val modelAyatList = ArrayList<ModelAyat>()

    fun setAdapter(items: ArrayList<ModelAyat>) {
        modelAyatList.clear()
        modelAyatList.addAll(items)
        notifyDataSetChanged()
    }


    class ViewHolder (var binding : ItemDetailsurahBinding) : RecyclerView.ViewHolder(binding.root){
        var tvayatrab: TextView
        var tvnomor: TextView
        var tvTerjemahan: TextView

        init {
            tvayatrab = binding.ayatarab
            tvnomor = binding.ayatlatin
            tvTerjemahan = binding.ayatarti
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemDetailsurahBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return modelAyatList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = modelAyatList!![position]

        holder.binding.ayatarab.text = data.arab
        holder.binding.ayatlatin.text = data.nomor
        holder.binding.ayatarti.text = data.indo

    }
}