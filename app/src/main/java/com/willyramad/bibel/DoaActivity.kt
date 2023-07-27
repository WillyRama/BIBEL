package com.willyramad.bibel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.willyramad.bibel.adapter.DoaAdapter
import com.willyramad.bibel.data.DataDoa
import com.willyramad.bibel.databinding.ActivityDoaBinding
import com.willyramad.bibel.modeldoa.DoaViewModel

class DoaActivity : AppCompatActivity() {

    lateinit var binding : ActivityDoaBinding
    lateinit var adapter: DoaAdapter
    lateinit var doavm : DoaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        DataDoa()
        doavm = ViewModelProvider(this).get(DoaViewModel::class.java)

        doavm.getDoa()
        doavm.DoaList.observe(this, Observer {
            adapter.setDataDoa(it as ArrayList<DataDoa>)
        })
        adapter.onClick = {
            val bundle = Bundle()
            bundle.putSerializable("detail", it)

            val pindah = Intent(this, DetailDoaActivity::class.java)
            pindah.putExtras(bundle)
            startActivity(pindah)
        }
    }
    fun DataDoa(){
        adapter = DoaAdapter(ArrayList())

        binding.rcdoa.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rcdoa.adapter = adapter
    }
}