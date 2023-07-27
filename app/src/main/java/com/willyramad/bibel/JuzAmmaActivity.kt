package com.willyramad.bibel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.willyramad.bibel.adapter.AdapterDeskripsiSurah
import com.willyramad.bibel.adapter.AdapterJuzAmma
import com.willyramad.bibel.databinding.ActivityJuzAmmaBinding
import com.willyramad.bibel.modeldoa.JuzAmmaViewModel
import com.willyramad.bibel.modeljuzamma.ModelSurah
import java.util.ArrayList

class JuzAmmaActivity : AppCompatActivity() {

    var REQ_PERMISSION = 100
    lateinit var binding : ActivityJuzAmmaBinding
    lateinit var adapterjuzamma: AdapterJuzAmma
    lateinit var adapterDeskripsiSurah: AdapterDeskripsiSurah
    lateinit var juzAmmaViewModel: JuzAmmaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityJuzAmmaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapterjuzamma = AdapterJuzAmma(this)
        binding.rcjuzamma.setHasFixedSize(true)
        binding.rcjuzamma.setLayoutManager(LinearLayoutManager(this))
        binding.rcjuzamma.setAdapter(adapterjuzamma)
        setViewModel()

       // juzAmmaViewModel = ViewModelProvider(this).get(JuzAmmaViewModel::class.java)
    }
    private fun setViewModel() {
        juzAmmaViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(JuzAmmaViewModel::class.java)
        juzAmmaViewModel.setSurah()
        juzAmmaViewModel.getSurah()
            .observe(this, { modelSurah: ArrayList<ModelSurah> ->
                if (modelSurah.size != 0) {
                    adapterjuzamma.setAdapter(modelSurah)
                } else {
                    Toast.makeText(this, "Data Tidak Ditemukan!", Toast.LENGTH_SHORT).show()
                }
            })
    }
}