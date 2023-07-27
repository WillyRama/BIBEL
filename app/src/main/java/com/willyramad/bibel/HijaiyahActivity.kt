package com.willyramad.bibel

import android.app.Dialog
import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.willyramad.bibel.databinding.ActivityHijaiyahBinding
import com.willyramad.bibel.databinding.ActivityHomeBinding

class HijaiyahActivity : AppCompatActivity() {

    lateinit var binding : ActivityHijaiyahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHijaiyahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alif.setOnClickListener {
            showdeskalif()
        }
        binding.ba.setOnClickListener{
            showdeskba()
        }
        binding.ta.setOnClickListener{
            showdeskta()
        }
        binding.tsa.setOnClickListener{
            showdesktsa()
        }
        binding.jim.setOnClickListener{
            showdeskjim()
        }
        binding.kha.setOnClickListener{
            showdeskkha()
        }
        binding.kho.setOnClickListener{
            showdeskkho()
        }
        binding.dal.setOnClickListener{
            showdeskdal()
        }
        binding.dzal.setOnClickListener{
            showdeskdzal()
        }
        binding.ra.setOnClickListener{
            showdeskra()
        }
        binding.zai.setOnClickListener{
            showdeskzai()
        }
        binding.sin.setOnClickListener{
            showdesksin()
        }
        binding.syin.setOnClickListener{
            showdesksyin()
        }
        binding.shad.setOnClickListener{
            showdeskshad()
        }
        binding.dhad.setOnClickListener{
            showdeskdhad()
        }
        binding.tha.setOnClickListener{
            showdesktha()
        }
        binding.zha.setOnClickListener{
            showdeskzha()
        }
        binding.ain.setOnClickListener{
            showdeskain()
        }
        binding.ghin.setOnClickListener{
            showdeskghin()
        }
        binding.fa.setOnClickListener{
            showdeskfa()
        }
        binding.qaf.setOnClickListener{
            showdeskqaf()
        }
        binding.kaf.setOnClickListener{
            showdeskkaf()
        }
        binding.lam.setOnClickListener{
            showdesklam()
        }
        binding.mim.setOnClickListener{
            showdeskmim()
        }
        binding.nun.setOnClickListener{
            showdesknun()
        }
        binding.wau.setOnClickListener{
            showdeskwau()
        }
        binding.ha.setOnClickListener{
            showdeskhabatu()
        }
        binding.lamalif.setOnClickListener{
            showdesklamalif()
        }
        binding.hamzah.setOnClickListener{
            showdeskhamzah()
        }
        binding.ya.setOnClickListener{
            showdeskya()
        }
    }
    private fun showdeskalif(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_alif)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaraa  = MediaPlayer.create(this, R.raw.a)
        val btnsuaraa : ImageView = dialog.findViewById(R.id.suaraalif)
        btnsuaraa.setOnClickListener{
            suaraa.start()
        }
        dialog.show()
    }
    private fun showdeskba(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_ba)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaraba  = MediaPlayer.create(this, R.raw.fatah_ba)
        val btnsuaraba : ImageView = dialog.findViewById(R.id.suaraba)
        btnsuaraba.setOnClickListener{
            suaraba.start()
        }
        dialog.show()
    }
    private fun showdeskta(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_ta)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarata  = MediaPlayer.create(this, R.raw.fatah_ta)
        val btnsuarata : ImageView = dialog.findViewById(R.id.suarata)
        btnsuarata.setOnClickListener{
            suarata.start()
        }
        dialog.show()
    }
    private fun showdesktsa(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_tsa)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaratsa  = MediaPlayer.create(this, R.raw.fatah_tsa)
        val btnsuaratsa : ImageView = dialog.findViewById(R.id.suaraTsa)
        btnsuaratsa.setOnClickListener{
            suaratsa.start()
        }
        dialog.show()
    }
    private fun showdeskjim(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_jim)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarajim  = MediaPlayer.create(this, R.raw.fatah_ja)
        val btnsuarajim : ImageView = dialog.findViewById(R.id.suarajim)
        btnsuarajim.setOnClickListener{
            suarajim.start()
        }
        dialog.show()
    }
    private fun showdeskkha(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_ha)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarakha  = MediaPlayer.create(this, R.raw.fatah_ha)
        val btnsuarakha : ImageView = dialog.findViewById(R.id.suarakha)
        btnsuarakha.setOnClickListener{
            suarakha.start()
        }
        dialog.show()
    }
    private fun showdeskkho(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_kha)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarakho  = MediaPlayer.create(this, R.raw.fatah_kho)
        val btnsuarakho : ImageView = dialog.findViewById(R.id.suarakho)
        btnsuarakho.setOnClickListener{
            suarakho.start()
        }
        dialog.show()
    }
    private fun showdeskdal(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_dal)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaradal  = MediaPlayer.create(this, R.raw.fatah_da)
        val btnsuaradal : ImageView = dialog.findViewById(R.id.suaradal)
        btnsuaradal.setOnClickListener{
            suaradal.start()
        }
        dialog.show()
    }
    private fun showdeskdzal(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_dzal)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaradzal  = MediaPlayer.create(this, R.raw.fatah_dza)
        val btnsuaradzal : ImageView = dialog.findViewById(R.id.suaradzal)
        btnsuaradzal.setOnClickListener{
            suaradzal.start()
        }
        dialog.show()
    }
    private fun showdeskra(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_ra)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suararo  = MediaPlayer.create(this, R.raw.fatah_ro)
        val btnsuarara : ImageView = dialog.findViewById(R.id.suarara)
        btnsuarara.setOnClickListener{
            suararo.start()
        }
        dialog.show()
    }
    private fun showdeskzai(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_zai)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarazai  = MediaPlayer.create(this, R.raw.fatah_za)
        val btnsuarazai : ImageView = dialog.findViewById(R.id.suarazai)
        btnsuarazai.setOnClickListener{
            suarazai.start()
        }
        dialog.show()
    }
    private fun showdesksin(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_sin)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarasin  = MediaPlayer.create(this, R.raw.fatah_sa)
        val btnsuarasin : ImageView = dialog.findViewById(R.id.suarasin)
        btnsuarasin.setOnClickListener{
            suarasin.start()
        }
        dialog.show()
    }
    private fun showdesksyin(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_syin)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarasyin  = MediaPlayer.create(this, R.raw.fatah_sya)
        val btnsuarasyin : ImageView = dialog.findViewById(R.id.suarasyin)
        btnsuarasyin.setOnClickListener{
            suarasyin.start()
        }
        dialog.show()
    }
    private fun showdeskshad(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_shad)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarashad  = MediaPlayer.create(this, R.raw.fatah_sho)
        val btnsuarashad : ImageView = dialog.findViewById(R.id.suarashad)
        btnsuarashad.setOnClickListener{
            suarashad.start()
        }
        dialog.show()
    }
    private fun showdeskdhad(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_dhad)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaradhad  = MediaPlayer.create(this, R.raw.fatah_dho)
        val btnsuaradhad : ImageView = dialog.findViewById(R.id.suaradhad)
        btnsuaradhad.setOnClickListener{
            suaradhad.start()
        }
        dialog.show()
    }
    private fun showdesktha(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_tha)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaratha  = MediaPlayer.create(this, R.raw.fatah_tho)
        val btnsuaratha : ImageView = dialog.findViewById(R.id.suaratha)
        btnsuaratha.setOnClickListener{
            suaratha.start()
        }
        dialog.show()
    }
    private fun showdeskzha(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_zha)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarazha  = MediaPlayer.create(this, R.raw.fatah_dzo)
        val btnsuarazha : ImageView = dialog.findViewById(R.id.suarazha)
        btnsuarazha.setOnClickListener{
            suarazha.start()
        }
        dialog.show()
    }
    private fun showdeskain(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_ain)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaraain  = MediaPlayer.create(this, R.raw.fatah_aa)
        val btnsuaraain : ImageView = dialog.findViewById(R.id.suaraain)
        btnsuaraain.setOnClickListener{
            suaraain.start()
        }
        dialog.show()
    }
    private fun showdeskghin(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_ghin)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaraghin  = MediaPlayer.create(this, R.raw.fatah_gho)
        val btnsuaraghin : ImageView = dialog.findViewById(R.id.suaraghin)
        btnsuaraghin.setOnClickListener{
            suaraghin.start()
        }
        dialog.show()
    }
    private fun showdeskfa(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_fa)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarafa  = MediaPlayer.create(this, R.raw.fatah_fa)
        val btnsuarafa : ImageView = dialog.findViewById(R.id.suarafa)
        btnsuarafa.setOnClickListener{
            suarafa.start()
        }
        dialog.show()
    }
    private fun showdeskqaf(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_qaf)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaraqaf  = MediaPlayer.create(this, R.raw.fatah_qo)
        val btnsuaraqaf : ImageView = dialog.findViewById(R.id.suaraqaf)
        btnsuaraqaf.setOnClickListener{
            suaraqaf.start()
        }
        dialog.show()
    }
    private fun showdeskkaf(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_kaf)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarakaf  = MediaPlayer.create(this, R.raw.fatah_ka)
        val btnsuarakaf : ImageView = dialog.findViewById(R.id.suarakaf)
        btnsuarakaf.setOnClickListener{
            suarakaf.start()
        }
        dialog.show()
    }
    private fun showdesklam(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_lam)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaralam  = MediaPlayer.create(this, R.raw.fatah_la)
        val btnsuaralam : ImageView = dialog.findViewById(R.id.suaralam)
        btnsuaralam.setOnClickListener{
            suaralam.start()
        }
        dialog.show()
    }
    private fun showdeskmim(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_mim)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaramim  = MediaPlayer.create(this, R.raw.fatah_ma)
        val btnsuaramim : ImageView = dialog.findViewById(R.id.suaramim)
        btnsuaramim.setOnClickListener{
            suaramim.start()
        }
        dialog.show()
    }
    private fun showdesknun(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_nun)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaranun  = MediaPlayer.create(this, R.raw.fatah_na)
        val btnsuaranun : ImageView = dialog.findViewById(R.id.suaranun)
        btnsuaranun.setOnClickListener{
            suaranun.start()
        }
        dialog.show()
    }
    private fun showdeskwau(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_wau)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarawau  = MediaPlayer.create(this, R.raw.fatah_wa)
        val btnsuarawau : ImageView = dialog.findViewById(R.id.suarawau)
        btnsuarawau.setOnClickListener{
            suarawau.start()
        }
        dialog.show()
    }
    private fun showdeskhabatu(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_habatu)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarahabatu  = MediaPlayer.create(this, R.raw.fatah_haa)
        val btnsuarahabatu : ImageView = dialog.findViewById(R.id.suarahabatu)
        btnsuarahabatu.setOnClickListener{
            suarahabatu.start()
        }
        dialog.show()
    }
    private fun showdesklamalif(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_lamalif)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaralamalif  = MediaPlayer.create(this, R.raw.fatah_la)
        val btnsuaralamalif : ImageView = dialog.findViewById(R.id.suaralamalif)
        btnsuaralamalif.setOnClickListener{
            suaralamalif.start()
        }
        dialog.show()
    }
    private fun showdeskhamzah(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_hamzah)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suarahamzah  = MediaPlayer.create(this, R.raw.a)
        val btnsuarahamzah : ImageView = dialog.findViewById(R.id.suarahamzah)
        btnsuarahamzah.setOnClickListener{
            suarahamzah.start()
        }
        dialog.show()
    }
    private fun showdeskya(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.costum_dialog_ya)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        val suaraya  = MediaPlayer.create(this, R.raw.fatah_ya)
        val btnsuaraya : ImageView = dialog.findViewById(R.id.suaraya)
        btnsuaraya.setOnClickListener{
            suaraya.start()
        }
        dialog.show()
    }
}