package com.mandychev.foodfacts.api

import android.arch.lifecycle.LiveData
import com.mandychev.foodfacts.vo.ProductContainer
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface FoodfactsApi {

    @GET("v0/product/{productId}.json")
    fun getProduct(@Path("productId") productId: String): LiveData<ApiResponse<ProductContainer>>
}