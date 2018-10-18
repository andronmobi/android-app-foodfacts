package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class Full(
    @SerializedName("h") val h: Int?,
    @SerializedName("w") val w: Int?
)