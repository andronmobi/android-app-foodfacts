package com.mandychev.foodfacts.di

import com.mandychev.foodfacts.api.FoodfactsApi
import dagger.Module
import dagger.Provides
import fr.lequipe.networking.utils.LiveDataCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideFoodfactsApi(): FoodfactsApi {
        return Retrofit.Builder()
                .baseUrl("https://world.openfoodfacts.org/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(LiveDataCallAdapterFactory())
                .build()
                .create(FoodfactsApi::class.java)
    }
}