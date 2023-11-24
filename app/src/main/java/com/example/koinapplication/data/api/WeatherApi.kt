package com.example.koinapplication.data.api
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
interface WeatherApi {
    @GET("current.json")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
        @Query("lang") language: String
    ): Response<WeatherResponse>

    @GET("search.json")
    suspend fun searchWeather(
        @Query("q") city: String,
        @Query("lang") language: String
    ): Response<WeatherResponse>

    @GET("weekly.json")
    suspend fun getWeeklyWeather(
        @Query("q") city: String,
        @Query("lang") language: String
    ): Response<WeatherResponse>
}