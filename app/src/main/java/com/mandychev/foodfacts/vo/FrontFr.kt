package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class FrontFr(
    @SerializedName("angle") val angle: Any?,
    @SerializedName("geometry") val geometry: String?,
    @SerializedName("imgid") val imgid: String?,
    @SerializedName("normalize") val normalize: String?,
    @SerializedName("rev") val rev: String?,
    @SerializedName("sizes") val sizes: Sizes?,
    @SerializedName("white_magic") val whiteMagic: String?,
    @SerializedName("x1") val x1: Any?,
    @SerializedName("x2") val x2: Any?,
    @SerializedName("y1") val y1: Any?,
    @SerializedName("y2") val y2: Any?
)