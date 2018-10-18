package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class Nutrition(
        @SerializedName("display") val display: Display?,
        @SerializedName("small") val small: Small?,
        @SerializedName("thumb") val thumb: Thumb?
)