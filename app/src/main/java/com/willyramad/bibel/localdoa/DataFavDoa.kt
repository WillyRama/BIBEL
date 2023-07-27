package com.willyramad.bibel.localdoa

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Entity
@Parcelize
data class DataFavDoa(
    @PrimaryKey
    val id : Int?,
    @ColumnInfo (name = "juduldoa")
    var juduldoa : String
):Parcelable
