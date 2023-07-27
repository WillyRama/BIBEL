package com.willyramad.bibel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.willyramad.bibel.adapter.AdapterDoaFavorit
import com.willyramad.bibel.adapter.AdapterJuzFavorit
import com.willyramad.bibel.databinding.ActivityFavoritDoaBinding
import com.willyramad.bibel.localdoa.DoaFavorit
import com.willyramad.bibel.localjuz.JuzFavorit
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FavoritDoaActivity : AppCompatActivity() {

    lateinit var binding : ActivityFavoritDoaBinding
    private var dbDoa : DoaFavorit? = null
    private var dbJuz : JuzFavorit?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFavoritDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dbDoa = DoaFavorit.getInstance(this)
        dbJuz = JuzFavorit.getInstance(this)

        ambilListdoaFav()
        ambilListJuzFav()
    }

    fun ambilListdoaFav(){
        binding.rcFavDoa.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        GlobalScope.launch {
            val lisFav = dbDoa?.DoaDao()?.getFavoritDoa()
            runOnUiThread {
                lisFav.let {
                    val adapterfavdoa = AdapterDoaFavorit(it!!)
                    binding.rcFavDoa.adapter = adapterfavdoa
                }
            }
        }
    }
    fun ambilListJuzFav(){
        binding.rcFavJuzAmma.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        GlobalScope.launch {
            val lisFavJuz = dbJuz?.JuzDao()?.getFavoritJuz()
            runOnUiThread {
                lisFavJuz.let {
                    val adapterfavJuz = AdapterJuzFavorit(it!!)
                    binding.rcFavJuzAmma.adapter = adapterfavJuz
                }
            }
        }
    }
}