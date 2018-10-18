package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class NutritionFr(
    @SerializedName("angle") val angle: String?,
    @SerializedName("geometry") val geometry: String?,
    @SerializedName("imgid") val imgid: String?,
    @SerializedName("normalize") val normalize: String?,
    @SerializedName("rev") val rev: String?,
    @SerializedName("sizes") val sizes: SizesX?,
    @SerializedName("white_magic") val whiteMagic: String?,
    @SerializedName("x1") val x1: String?,
    @SerializedName("x2") val x2: String?,
    @SerializedName("y1") val y1: String?,
    @SerializedName("y2") val y2: String?
)