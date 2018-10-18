package com.mandychev.foodfacts

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mandychev.foodfacts.api.*
import com.mandychev.foodfacts.vo.ProductContainer
import dagger.android.AndroidInjection
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var api: FoodfactsApi

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = api.getProduct("3329770057258")
        data.observe(this, Observer<ApiResponse<ProductContainer>> { response ->
            when (response) {
                is ApiSuccessResponse -> {
                    val product = response.body
                    Timber.d("product: $product")
                }
                is ApiEmptyResponse -> {
                    Timber.w("empty response")
                }
                is ApiErrorResponse -> {
                    Timber.w("${response.errorMessage}")
                }
            }
        })

        }
}
