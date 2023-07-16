package com.example.moviesapp.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.moviesapp.MainViewModel


@Composable
fun DetailsScreen(navController: NavHostController, viewModel: MainViewModel, itemId: String) {
    Text("Details screen: item id $itemId")
}