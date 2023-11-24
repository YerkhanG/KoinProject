package com.example.koinapplication.data.modules

import com.example.koinapplication.data.MyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MyViewModel(
            getCurrentWeather = get(),
            searchWeather = get(),
            repository = get()
        )
    }
}