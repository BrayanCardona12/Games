package com.example.games.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.navigation.NavController
import com.example.games.components.uiForms

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun formPF(navController: NavController, record: String) {
    uiForms(navController = navController, record = record, nomBd = "games1", Pf = true)
}