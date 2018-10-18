package com.mandychev.foodfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mandychev.foodfacts.api.FoodfactsApi
import com.mandychev.foodfacts.vo.ProductContainer
import dagger.android.AndroidInjection
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var api: FoodfactsApi

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread {
            val p = api.getProduct("3329770057258")
            p.enqueue(object: Callback<ProductContainer>{
                override fun onResponse(call: Call<ProductContainer>, response: Response<ProductContainer>) {
                    android.util.Log.d("MainActivity", "response: ${response.body()}")
                }
                override fun onFailure(call: Call<ProductContainer>, t: Throwable) {
                    android.util.Log.w("MainActivity", "onFailure: $t")
                }
            } )
        }.start()
    }
}
