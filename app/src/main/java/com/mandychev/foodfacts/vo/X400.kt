package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class X400(
    @SerializedName("h") val h: Int?,
    @SerializedName("w") val w: Int?
)