package com.willyramad.bibel.localdoa

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface FavoritDoaDao {

    @Insert
    fun addToFavorit(dataFavDoa : DataFavDoa):Long

    @Query("SELECT * FROM DataFavDoa")
    fun getFavoritDoa() : List<DataFavDoa>

    //
    @Query("SELECT count(*) FROM DataFavDoa WHERE DataFavDoa.id = :id")
    fun checkDoa(id: Int) : Int
}