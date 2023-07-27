package com.willyramad.bibel.localdoa

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [DataFavDoa::class], version = 1)
abstract class DoaFavorit : RoomDatabase() {
    abstract fun DoaDao() : FavoritDoaDao

    companion object{
        private var INSTANCE : DoaFavorit? = null

        fun getInstance(context : Context):DoaFavorit? {
            if (INSTANCE == null){
                synchronized(DoaFavorit::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        DoaFavorit::class.java,"doafavorit.db").build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }
}