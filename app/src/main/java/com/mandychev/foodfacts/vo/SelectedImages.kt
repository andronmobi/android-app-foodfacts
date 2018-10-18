package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class SelectedImages(
        @SerializedName("front") val front: Front?,
        @SerializedName("ingredients") val ingredients: Ingredients?,
        @SerializedName("nutrition") val nutrition: Nutrition?
)