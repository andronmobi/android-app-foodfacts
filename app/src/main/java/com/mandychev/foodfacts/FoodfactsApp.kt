package com.mandychev.foodfacts

import android.app.Activity
import android.app.Application
import com.mandychev.foodfacts.di.AppComponent
import com.mandychev.foodfacts.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject

class FoodfactsApp : Application(), HasActivityInjector {

    lateinit var component: AppComponent

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        AppInjector.init(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

}