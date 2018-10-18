package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class Ingredients(
        @SerializedName("display") val display: Display?,
        @SerializedName("small") val small: Small?,
        @SerializedName("thumb") val thumb: Thumb?
)