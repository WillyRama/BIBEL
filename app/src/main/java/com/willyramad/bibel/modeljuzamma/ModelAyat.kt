package com.willyramad.bibel.modeljuzamma

import com.google.gson.annotations.SerializedName

class ModelAyat {
    @SerializedName("ar")
    lateinit var arab: String

    @SerializedName("id")
    lateinit var indo: String

    @SerializedName("nomor")
    lateinit var nomor: String
}