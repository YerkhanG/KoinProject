package com.example.koinapplication.data.useCases

import com.example.koinapplication.data.api.WeatherResponse
import com.example.koinapplication.data.repository.WeatherRepository

interface GetCurrentWeatherUseCase {
    suspend fun execute(city: String): WeatherResponse?
}

class WeatherUseCase(
    private val repo: WeatherRepository
) : GetCurrentWeatherUseCase {
    override suspend fun execute(city: String): WeatherResponse? {
        return repo.getCurrentWeather(city)
    }
}

fun provideGetCurrentWeatherUseCase(repo: WeatherRepository): GetCurrentWeatherUseCase =
    WeatherUseCase(repo)

interface SearchWeatherUseCase {
    suspend fun execute(text: String): WeatherResponse?
}

class SearchWeatherInteraction(
    private val repo: WeatherRepository
) : SearchWeatherUseCase {
    override suspend fun execute(text: String): WeatherResponse? {
        return repo.searchWeather(text)
    }
}

fun provideSearchWeatherUseCase(repo: WeatherRepository): SearchWeatherUseCase =
    SearchWeatherInteraction(repo)