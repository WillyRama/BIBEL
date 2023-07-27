package com.willyramad.bibel

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.willyramad.bibel.adapter.AdapterDeskripsiSurah
import com.willyramad.bibel.data.DataDoa
import com.willyramad.bibel.databinding.ActivityDetailJuzAmmaBinding
import com.willyramad.bibel.localjuz.DataFavJuz
import com.willyramad.bibel.localjuz.FavoritJuzDao
import com.willyramad.bibel.localjuz.JuzFavorit
import com.willyramad.bibel.modeldoa.JuzAmmaViewModel
import com.willyramad.bibel.modeljuzamma.ModelAyat
import com.willyramad.bibel.modeljuzamma.ModelSurah
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import java.io.IOException
import java.util.ArrayList

class DetailJuzAmmaActivity : AppCompatActivity() {

    private var favjuzdao : FavoritJuzDao? = null
    private var favjuz : JuzFavorit? = null
    lateinit var detNomor: String
    lateinit var detNama : String
    lateinit var detAyat: String
    lateinit var detArti: String
    lateinit var detAudio: String
    lateinit var modelSurah: ModelSurah
    lateinit var binding : ActivityDetailJuzAmmaBinding
    lateinit var viewModel: JuzAmmaViewModel
    lateinit var adapterDeskripsiSurah: AdapterDeskripsiSurah
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //showdetail()
        binding = ActivityDetailJuzAmmaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        favjuz = JuzFavorit.getInstance(this)
        favjuzdao = favjuz?.JuzDao()

        //idd = intent.getIntExtra(EXTRA_ID, 0)
        viewModel = ViewModelProvider(this).get(JuzAmmaViewModel::class.java)

        handler = Handler()

        modelSurah = intent.getSerializableExtra(DETAIL_SURAH) as ModelSurah
        if (modelSurah != null) {
            detAyat = modelSurah.ayat
            detArti = modelSurah.arti
            detNomor = modelSurah.nomor
            detNama = modelSurah.nama
            detAudio = modelSurah.audio

            //menampilkan pada layout
            binding.hidingSurat.text = detNama

            binding.suarastop.visibility = View.GONE
            binding.suara.visibility = View.VISIBLE
            //tilawah
            val mediaPlayer = MediaPlayer()

            binding.suara.setOnClickListener {
                try {
                    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)
                    mediaPlayer.setDataSource(detAudio)
                    mediaPlayer.prepare()
                    mediaPlayer.start()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
                binding.suara.visibility = View.GONE
                binding.suarastop.visibility = View.VISIBLE
            }

            binding.suarastop.setOnClickListener {
                mediaPlayer.stop()
                mediaPlayer.reset()
                binding.suara.visibility = View.VISIBLE
                binding.suarastop.visibility = View.GONE
            }
        }
        adapterDeskripsiSurah = AdapterDeskripsiSurah()
        binding.rcayat.setHasFixedSize(true)
        binding.rcayat.layoutManager = LinearLayoutManager(this)
        binding.rcayat.adapter = adapterDeskripsiSurah
        Tampildeskripsi()

        binding.fav.setOnClickListener {
            GlobalScope.async {
                val d = intent.getSerializableExtra(DETAIL_SURAH) as ModelSurah
                val id = modelSurah.nomor
                val nama =modelSurah.nama
                val favorit = favjuz?.JuzDao()?.addToFavorit(DataFavJuz(id,nama))

                runOnUiThread {
                    if (favorit != 0.toLong()){
                        Toast.makeText(this@DetailJuzAmmaActivity, "Berhasil Menambah ke Favorit", Toast.LENGTH_SHORT).show()
                        var _isChecked = false
                        _isChecked = !_isChecked
                        binding.fav.isChecked = _isChecked
                    }else{
                        Toast.makeText(this@DetailJuzAmmaActivity, "Data tidak masuk", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

    }
        private fun Tampildeskripsi() {
            viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(JuzAmmaViewModel::class.java)
            viewModel.setDetailSurah(detNomor)
            viewModel.getDetailSurah()
                .observe(this, { modelAyat: ArrayList<ModelAyat> ->
                    if (modelAyat.size != 0) {
                        adapterDeskripsiSurah.setAdapter(modelAyat)
                    } else {
                        Toast.makeText(this, "Data Tidak Ditemukan!", Toast.LENGTH_SHORT).show()
                    }
                })
        }
        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (item.itemId == android.R.id.home) {
                finish()
                return true
            }
            return super.onOptionsItemSelected(item)
        }
    companion object{
        const val  DETAIL_SURAH = "DETAIL_SURAH"
    }

}