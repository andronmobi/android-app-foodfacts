package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class X5(
        @SerializedName("sizes") val sizes: Sizes?,
        @SerializedName("uploaded_t") val uploadedT: String?,
        @SerializedName("uploader") val uploader: String?
)