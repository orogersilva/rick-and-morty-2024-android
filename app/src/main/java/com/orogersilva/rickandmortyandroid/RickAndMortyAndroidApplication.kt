package com.orogersilva.rickandmortyandroid

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class RickAndMortyAndroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.IS_DEBUG_BUILD) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
