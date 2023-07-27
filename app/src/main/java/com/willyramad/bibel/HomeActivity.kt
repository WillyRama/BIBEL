package com.willyramad.bibel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willyramad.bibel.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //pindah ke menu hijaiyah
        binding.btnhijaiyah.setOnClickListener {
            startActivity(Intent(this,HijaiyahActivity::class.java))
        }
        //pindah ke menu doa
        binding.btndoa.setOnClickListener {
            startActivity(Intent(this,DoaActivity::class.java))
        }
        //pindah ke menu juz amma
        binding.btnjuzamma.setOnClickListener {
            startActivity(Intent(this,JuzAmmaActivity::class.java))
        }
        //Favorit
        binding.BtnFav.setOnClickListener {
            startActivity(Intent(this, FavoritDoaActivity::class.java))
        }
    }
}