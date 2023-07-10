package com.example.moviesapp.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Test",
            modifier = Modifier.padding(10.dp)
        )
    }
}