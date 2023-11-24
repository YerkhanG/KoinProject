package com.example.koinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koinapplication.data.MyViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel : MyViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.getCurrentWeather("asdf")
        viewModel.currentWeather.observe(this) {

        }
    }
}