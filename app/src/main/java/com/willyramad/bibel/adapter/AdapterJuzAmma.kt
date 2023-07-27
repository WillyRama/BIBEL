package com.willyramad.bibel.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.bibel.DetailJuzAmmaActivity
import com.willyramad.bibel.databinding.ItemJuzammaBinding
import com.willyramad.bibel.modeljuzamma.ModelSurah
import kotlinx.android.synthetic.main.item_juzamma.view.namaSurah
import java.util.ArrayList

class AdapterJuzAmma (private val mContext: Context) : RecyclerView.Adapter<AdapterJuzAmma.ViewHolder>() {
    private val modelSurahList = ArrayList<ModelSurah>()

    fun setAdapter(items: ArrayList<ModelSurah>) {
        modelSurahList.clear()
        modelSurahList.addAll(items)
        notifyDataSetChanged()
    }

    class ViewHolder (var binding: ItemJuzammaBinding) : RecyclerView.ViewHolder(binding.root) {
        var crsurah : CardView
        var namaSurah : TextView

        init {
            crsurah = binding.crJuzamma
            namaSurah = binding.namaSurah
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemJuzammaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = modelSurahList[position]

        holder.binding.namaSurah.text = data.nama

        holder.binding.crJuzamma.setOnClickListener {
            val intent = Intent(mContext, DetailJuzAmmaActivity::class.java)
            intent.putExtra(DetailJuzAmmaActivity.DETAIL_SURAH, modelSurahList[position])
            mContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return modelSurahList.size

    }

}