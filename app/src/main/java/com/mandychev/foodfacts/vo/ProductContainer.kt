package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class ProductContainer(
    @SerializedName("code") val code: String?,
    @SerializedName("product") val product: Product?,
    @SerializedName("status") val status: Int?,
    @SerializedName("status_verbose") val statusVerbose: String?
)