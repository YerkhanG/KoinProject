package com.example.koinapplication

import android.app.Application
import com.example.koinapplication.data.modules.apiModule
import com.example.koinapplication.data.modules.repositoryModule
import com.example.koinapplication.data.modules.useCaseModule
import com.example.koinapplication.data.modules.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@KoinApplication)
            modules(
                apiModule,
                useCaseModule,
                repositoryModule,
                viewModelModule
            )
        }
    }
}