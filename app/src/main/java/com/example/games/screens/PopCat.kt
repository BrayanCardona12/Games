package com.example.games.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.games.ui.theme.Pixel
import com.example.games.R
import com.example.games.navegation.Routes

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnrememberedMutableState")
@Composable
fun PopCat(navController: NavController) {
    var cambio by remember { mutableStateOf(true) }
    var num by remember { mutableStateOf(0) }
    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .padding(top = 15.dp, bottom = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "POPCAT",
                    fontFamily = Pixel,
                    fontWeight = FontWeight.Bold,
                    fontSize = 33.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier.clickable { navController.navigate(Routes.Home.route) },
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,

                        ) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = null)
                        Text(text = "Home")
                    }
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.clickable { navController.navigate(Routes.pf.route) }
                    ) {
                        Icon(imageVector = Icons.Default.Extension, contentDescription = null)
                        Text(text = "P & F")
                    }
                }
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.primaryVariant)
                .padding(23.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly

        ) {


            item {

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    item {
                        Text(
                            "Clicks: $num",
                            color = Color.Black,
                            fontSize = 45.sp,
                            fontFamily = Pixel,
                            fontWeight = FontWeight.Thin
                        )
                    }
                }

            }

            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Icon(
                        imageVector = Icons.Default.Save,
                        contentDescription = null,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(Routes.formInsertpopcat.createRoute(num.toString()))
                            }
                            .size(40.dp)
                            .background(Color.Black)
                            .padding(5.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.RestartAlt,
                        contentDescription = null,
                        modifier = Modifier
                            .clickable { num = 0 }
                            .size(40.dp)
                            .background(Color.Black)
                            .padding(5.dp)
                    )

                }
            }

            item {
                if (cambio) {
                    Image(
                        painter = painterResource(R.drawable.catnormal),
                        contentDescription = null,
                        modifier = Modifier
                            .size(500.dp)
                            .clickable {
                                cambio = !cambio
                                num += 1
                            })
                } else {
                    Image(
                        painter = painterResource(R.drawable.cateat),
                        contentDescription = null,
                        modifier = Modifier
                            .size(500.dp)
                            .clickable {
                                cambio = !cambio
                                num += 1
                            })
                }
            }
        }
    }
}