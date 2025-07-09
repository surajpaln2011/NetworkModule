package com.example.networkmodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.home.ui.HomeScreen
import com.example.networkmodule.ui.theme.NetworkModuleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NetworkModuleTheme {
                HomeScreen()
            }
        }
    }
}