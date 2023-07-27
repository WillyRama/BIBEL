package com.willyramad.bibel.localjuz

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.willyramad.bibel.localdoa.DataFavDoa
import com.willyramad.bibel.localdoa.DoaFavorit
import com.willyramad.bibel.localdoa.FavoritDoaDao

@Database(entities = [DataFavJuz::class], version = 2)
abstract class JuzFavorit : RoomDatabase(){
    abstract fun JuzDao() : FavoritJuzDao

    companion object{
        private var INSTANCE : JuzFavorit? = null

        fun getInstance(context : Context): JuzFavorit? {
            if (INSTANCE == null){
                synchronized(DoaFavorit::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        JuzFavorit::class.java,"juzfavorit.db").build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }
}