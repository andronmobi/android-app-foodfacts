package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class Sizes(
    @SerializedName("100") val x100: X100?,
    @SerializedName("400") val x400: X400?,
    @SerializedName("full") val full: Full?
)