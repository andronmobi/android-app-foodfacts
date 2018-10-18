package com.mandychev.foodfacts.di

import com.mandychev.foodfacts.FoodfactsApp

object AppInjector {

    fun init(foodfactsApp: FoodfactsApp) {
        DaggerAppComponent.builder().application(foodfactsApp)
                .build().inject(foodfactsApp)
    }
}