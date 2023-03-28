package com.example.games.screens

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.games.components.uiForms


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun formPopCat(navController: NavController, record: String) {
    uiForms(navController = navController, record = record, nomBd = "games2", Pf = false)
}