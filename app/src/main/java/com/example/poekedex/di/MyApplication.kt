package com.example.poekedex.di

import android.app.Application
import com.example.features.di.featureModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Inicialize o Koin com os módulos
        startKoin {
            androidContext(this@MyApplication)
            modules(
                featureModules
            )
        }
    }
}
