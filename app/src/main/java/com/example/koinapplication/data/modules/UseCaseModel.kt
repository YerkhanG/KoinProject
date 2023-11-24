package com.example.koinapplication.data.modules

import com.example.koinapplication.data.useCases.provideGetCurrentWeatherUseCase
import com.example.koinapplication.data.useCases.provideSearchWeatherUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory {
        provideGetCurrentWeatherUseCase(get())
    }
    factory {
        provideSearchWeatherUseCase(get())
    }
}