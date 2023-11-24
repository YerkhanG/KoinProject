package com.example.koinapplication.data.modules

import com.example.koinapplication.data.repository.provideWeatherRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { provideWeatherRepository(api = get()) }
}