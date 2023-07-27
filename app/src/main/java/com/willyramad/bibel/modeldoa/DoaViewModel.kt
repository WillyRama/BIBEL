package com.willyramad.bibel.modeldoa

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.willyramad.bibel.R
import com.willyramad.bibel.data.DataDoa

class DoaViewModel : ViewModel() {
    val list = arrayListOf(
        DataDoa(1, "Doa Sebelum Tidur", "بِاسْمِكَ اللَّهُمَّ أَمُوْتُ وَأَحْيَا" ,"Bismika-llaahumma amuutu wa ahyaa." , "Dengan Nama-Mu ya Allah, aku mati dan aku hidup." , R.raw.doa_tidur),
        DataDoa(2, "Doa Bangun Tidur", "اَلْحَمْدُ لِلَّهِ الَّذِيْ أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُوْرِ", "Alhamdulillaahil-ladzii ahyaanaa ba'da maa amaatanaa wa ilaihin-nusyuur.", "Segala puji bagi Allah, yang membangunkan kami setelah ditidurkanNya dan kepadaNya kami dibangitkan.",R.raw.doa_bangun_tidur),
        DataDoa(3, "Doa Bila Terjaga Di Malam Hari", "لاَ إِلَـٰهَ إِلاَّ اللَّهُ، وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرٌ، اَلْحَمْدُ لِلَّهِ، وَسُبْحَانَ اللَّهِ، وَلاَ إِلَـٰهَ إِلاَّ اللَّهُ، وَاللَّهُ أَكْبَرُ، وَلاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللَّهِ", "Laa ilaaha illallaah, wahdahu laa syariika lah, lahul mulku wa lahul hamdu, wa huwa 'alaa kulli syai-in qodiir, alhamdulillaah, wa subhaanallaah, wa laa ilaaha illallaah, wallaahu akbar, wa laa haula wa laa quwwata illaa billaah.", "Tidak ada sesembahan yang berhak disembah kecuali Allah, Yang Maha Esa, tiada sekutu bagiNya. BagiNya kerajaan dan pujian. Dia-lah Yang Maha Kuasa atas segala sesuatu. Segala Puji bagi Allah, Maha Suci Allah, tidak ada sesembahan yang berhak disembah kecuali Allah, Allah Maha Besar, tiada daya dan kekuatan kecuali dengan pertolongan Allah.", R.raw.doaterjagadimalamhari),
        DataDoa(4, "Doa Masuk Kamar Mandi", "(بِسْمِ اللَّهِ) اَللَّهُمَّ إِنِّيْ أَعُوْذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ", "(Bismillaah) Allaahumma innii a'uudzu bika minal khubutsi wal khobaa-its.", "Dengan nama Allah. Ya Allah, sesungguhnya aku berlindung kepadaMu dari godaan setan laki-laki dan perempuan.", R.raw.doa_masuk_kamarmandi),
        DataDoa(5, "Doa Keluar Kamar Mandi", "غُفْرَانَكَ", "Ghufroonak.", "Aku minta ampun kepadaMu.", R.raw.doa_keluar_kamarmandi),
        DataDoa(6, "Doa Sebelum Wudhu", "بِسْمِ اللَّهِ", "Bismillaah.", "Dengan nama Allah (aku berwudhu).", R.raw.doa_melepasbaju),
        DataDoa(7,"Doa Setelah Wudhu", "أَشْهَدُ أَنْ لاَ إِلَـٰهَ إِلاَّ اللَّهُ، وَحْدَهُ لاَ شَرِيْكَ لَهُ، وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُوْلُهُ", "Asyhadu al-laa ilaaha illallaah, wahdahu laa syariika lah, wa asyhadu anna muhammadan 'abduhu wa rosuuluh.", "Aku bersaksi, bahwa tidak ada sesembahan yang berhak disembah kecuali Allah, Yang Maha Esa dan tiada sekutu bagiNya. Aku bersaksi, bahwa Muhammad adalah hamba dan utusanNya.", R.raw.doa_setelahwudhu),
        DataDoa(8,"Doa Mengenakan Pakaian", "اَلْحَمْدُ لِلَّهِ الَّذِيْ كَسَانِيْ هَـٰذَا (الثَّوْبَ) وَرَزَقَنِيْهِ مِنْ غَيْرِ حَوْلٍ مِنِّيْ وَلاَ قُوَّةٍ", "Alhamdulillaahil-ladzii kasaanii haadzats-tsauba wa rozaqoniihi min ghoiri haulin minnii wa laa quwwah.", "Segala puji bagi Allah yang memberi pakaian ini kepadaku sebagai rezeki dariNya tanpa daya dan kekuatan dariku.", R.raw.doa_tidur),
        DataDoa(9,"Doa Keluar Rumah", "بِسْمِ اللَّهِ، تَوَكَّلْتُ عَلَى اللَّهِ، لاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللَّهِ", "Bismillaah, tawakkaltu 'alallaah, laa haula wa laa quwwata illaa billaah.", "Dengan nama Allah, aku bertawakkal kepada Allah, tiada daya dan kekuatan kecuali dengan pertolongan Allah.", R.raw.doa_keluar_rumah),
        DataDoa(10,"Doa Melepas/Meletekkan Pakaian", "بِسْمِ اللَّهِ", "Bismillaah", "Dengan nama Allah (aku meletakkan baju).", R.raw.doa_melepasbaju),
        DataDoa(11, "Doa Masuk Rumah", "اَلسَّلَامُ عَلَيْكُمْ", "As-salaamu 'alaikum.", "Semoga keselamatan atas kalian.", R.raw.assalamualaikum),
        DataDoa(12,"Doa Sebelum Makan", "اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ", "Alloohumma barik lanaa fiimaa razaqtanaa waqinaa 'adzaa bannar", "Ya Allah, berkahilah kami dalam rezeki yang telah Engkau limpahkan kepada kami dan jauhkanlah kami dari siksa neraka", R.raw.doasebelummakan),
        DataDoa(13,"Bila Lupa Membaca Doa Sebelum Makan", "بِسْمِ اللَّهِ أَوَّلَهُ وَآخِرَهُ", "Bismillaahi awwalahu wa aakhirohu.", "Dengan nama Allah pada awal dan akhirnya.", R.raw.doa_lupamembacadoamakan),
        DataDoa(14,"Doa Sesudah Makan", "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ", "Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alanaa minal muslimiin", "Segala puji bagi Allah yang telah memberi kami makan dan minum, Serta menjadikan kami termasuk golongan orang-orang muslim", R.raw.doasesudahmakan),
        DataDoa(15,"Doa berlindung dari keburukan", "اَللَّهُمَّ إِنِّيْ أَعُوْذُ بِكَ مِنْ زَوَالِ نِعْمَتِكَ، وَتَحَوُّلِ عَافِيَتِكَ، وَفُجَاءَةِ نِقْمَتِكَ، وَجَمِيْعِ سَخَطِكَ", "Allaahumma innii a'uudzu bika min zawaali ni'matik, wa tahawwuli 'aafiyatik, wa fujaa-ati niqmatik, wa jamii'i sakhathik.", "llah, sesungguhnya aku berlindung kepada-Mu dari hilangnya nikmat yang telah Engkau berikan, dari berubahnya kesehatan yang telah Engkau anugerahkan, dari siksa-Mu yang datang secara tiba-tiba, dan dari segala kemurkaan-Mu.", R.raw.doaberlindungdarikeburukan),
        DataDoa(16,"Doa berlindung dari sifat malas. lemah, pikun, kikir dan siksa kubur", "اَللَّهُمَّ إِنِّى أَعُوذُ بِكَ مِنَ الْكَسَلِ، وَأَعُوذُ بِكَ مِنَ الْجُبْنِ، وَأَعُوذُ بِكَ مِنَ الْهَرَمِ، وَأَعُوذُ بِكَ مِنَ الْبُخْلِ", "Allaahumma innii a'uudzu bika minal kasali, wa a'uudzu bika minal jubni, wa a'uudzu bika minal haromi, wa a'uudzu bika minal bukhli.", "Ya Allah, aku meminta perlindungan pada-Mu dari rasa malas, aku meminta perlindungan pada-Mu dari lemahnya hati, aku meminta perlindungan pada-Mu dari usia tua (yang sulit untuk beramal) dan aku meminta perlindungan pada-Mu dari sifat kikir (pelit)", R.raw.doaantimalas),
        DataDoa(17,"Doa ketika angin ribut, halilintar dan hujan", "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ خَيْرَهَا وَأَعُوْذُ بِكَ مِنْ شَرِّهَا", "Allaahumma innii as-aluka khoirohaa wa a'uudzu bika min syarrihaa.", "Ya Allah, sesungguhnya aku mohon kepadaMu kebaikan angin ini, dan aku berlindung kepadaMu dari kejelekannya", R.raw.doahujanlebat),
        DataDoa(18,"Doa ketika hujan", "اَللَّهُمَّ صَيِّبًا نَافِعًا", "Allaahumma shoyyiban naafi'an.", "Ya Allah, turunkanlah hujan yang bermanfaat (untuk manusia, tanaman dan binatang).", R.raw.doahujan),
        DataDoa(19,"Doa Ketika Hujan Lebat, Atau Agar Hujan Berhenti", "اَللَّهُمَّ حَوَالَيْنَا وَلَا عَلَيْنَا", "Allaahumma hawaalainaa wa laa 'alainaa.", "Ya Allah, turunkanlah hujan di sekitar kami, bukan yang merusak kami.", R.raw.doaagarhujanberhenti),
        DataDoa(20,"Doa Ketika Sakit", "بِسْمِ اللَّهِ أَعُوذُ بِاللَّهِ وَقُدْرَتِهِ مِنْ شَرِّ مَا أَجِدُ وَأُحَاذِرُ", "Bismillaah A'uudzu billaahi wa qudrotihi min syarri maa ajidu wa uhaadzir.", "Dengan nama Allah Aku berlindung kepada Allah dan kekuasaanNya, dari kejahatan sesuatu yang aku jumpai dan aku khawatirkan.", R.raw.doaketikasakit),
        DataDoa(21,"Doa Memohon Ilmu", "رَبِّ زِدْنِي عِلْمًا", "Robbi zidnii 'ilman.", "Wahai Rabb-ku, tambahkanlah ilmu kepadaku.", R.raw.doamemintailmu),
        DataDoa(22,"Doa Bersin", "اَلْحَمْدُ لِلَّهِ", "Alhamdulillaah.", "Segala puji bagi Allah.", R.raw.doabersin),
    )
    val DoaList : MutableLiveData<List<DataDoa>> = MutableLiveData()

    fun getDoa(){
        var Doa = list
        DoaList.value = Doa
    }
}