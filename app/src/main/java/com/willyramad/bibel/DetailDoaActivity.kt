package com.willyramad.bibel

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.willyramad.bibel.data.DataDoa
import com.willyramad.bibel.databinding.ActivityDetailDoaBinding
import com.willyramad.bibel.localdoa.DataFavDoa
import com.willyramad.bibel.localdoa.DoaFavorit
import com.willyramad.bibel.localdoa.FavoritDoaDao
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import okio.IOException
import kotlin.properties.Delegates

class DetailDoaActivity : AppCompatActivity() {

    private var favdoadao : FavoritDoaDao?=null
    private var favdoa : DoaFavorit?=null
    lateinit var binding : ActivityDetailDoaBinding
    private var suaradoa : Int by Delegates.notNull()
    lateinit var raw : R.raw

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        favdoa = DoaFavorit.getInstance(this)
        favdoadao = favdoa?.DoaDao()

        var detailDoa = intent.getSerializableExtra("detail") as DataDoa
        binding.hidingdoa.text = detailDoa.juduldoa
        binding.doaarab.text = detailDoa.doaarab
        binding.doalatin.text = detailDoa.doalatin
        binding.arti.text = detailDoa.arti
        suaradoa = detailDoa.suara

        var mMediaPlayer: MediaPlayer? = null
        binding.playdoa.setOnClickListener {

            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer.create(this, suaradoa)
                mMediaPlayer!!.isLooping = false
                mMediaPlayer!!.start()
            } else mMediaPlayer!!.start()
            binding.playdoa.visibility = View.GONE
            binding.stopdoa.visibility = View.VISIBLE
        }

        binding.fav.setOnClickListener {
            GlobalScope.async {
                val d = intent.getSerializableExtra("detail") as DataDoa
                val id = detailDoa.id
                val nama =detailDoa.juduldoa
                val favorit = favdoa?.DoaDao()?.addToFavorit(DataFavDoa(id,nama))

                runOnUiThread {
                    if (favorit != 0.toLong()){
                        Toast.makeText(this@DetailDoaActivity, "Berhasil Menambah ke Favorit", Toast.LENGTH_SHORT).show()
                        var _isChecked = false
                        _isChecked = !_isChecked
                        binding.fav.isChecked = _isChecked
                    }else{
                        Toast.makeText(this@DetailDoaActivity, "Data tidak masuk", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

//        binding.stopdoa.setOnClickListener {
//            if (mMediaPlayer == null) {
//                mMediaPlayer = MediaPlayer.create(this, suaradoa)
//                mMediaPlayer!!.stop()
//                mMediaPlayer!!.reset()
//            binding.playdoa.visibility = View.VISIBLE
//            binding.stopdoa.visibility = View.GONE

//        }


        //coba suara 1
       // suaradoa = detailDoa.suara
//        val mediaplayer = MediaPlayer()
//
//        binding.playdoa.setOnClickListener(View.OnClickListener {
//            if (mediaplayer.isPlaying()) {
//                if (mediaplayer != null) {
//                    mediaplayer.stop()
//                }
//            } else {
//                if (mediaplayer != null) {
//                    mediaplayer.start()
//                }
//            }
//        })


//coba suara 2
//        val mediaPlayer = MediaPlayer()
//
//        binding.playdoa.setOnClickListener {
//            try {
//                val afd = getAssets().openFd("audio.mp3");
//                mediaPlayer.setDataSource(afd.getFileDescriptor());
//                mediaPlayer.prepare()
//                mediaPlayer.start()
//            } catch (e: IOException) {
//                e.printStackTrace()
//            }
//            binding.playdoa.visibility = View.GONE
//            binding.stopdoa.visibility = View.VISIBLE
//        }
//
//        binding.stopdoa.setOnClickListener {
//            mediaPlayer.stop()
//            mediaPlayer.reset()
//            binding.playdoa.visibility = View.VISIBLE
//            binding.stopdoa.visibility = View.GONE
//        }
    }
}