package com.willyramad.bibel.localjuz

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.willyramad.bibel.localdoa.DataFavDoa

@Dao
interface FavoritJuzDao {

    @Insert
    fun addToFavorit(dataFavJuz: DataFavJuz):Long

    @Query("SELECT * FROM DataFavJuz")
    fun getFavoritJuz() : List<DataFavJuz>

    //
    @Query("SELECT count(*) FROM DataFavJuz WHERE DataFavJuz.id = :id")
    fun checkJuz(id: Int) : Int
}