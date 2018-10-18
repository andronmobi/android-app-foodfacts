package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class X1(
    @SerializedName("sizes") val sizes: SizesX?,
    @SerializedName("uploaded_t") val uploadedT: String?,
    @SerializedName("uploader") val uploader: String?
)