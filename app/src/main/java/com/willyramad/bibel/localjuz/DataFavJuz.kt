package com.willyramad.bibel.localjuz

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class DataFavJuz(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "indo")
    var indo: String
):Parcelable
