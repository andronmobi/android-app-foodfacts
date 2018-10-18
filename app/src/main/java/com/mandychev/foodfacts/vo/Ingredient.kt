package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class Ingredient(
        @SerializedName("id") val id: String?,
        @SerializedName("rank") val rank: Int?,
        @SerializedName("text") val text: String?
)