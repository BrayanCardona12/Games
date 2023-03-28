package com.example.games.models

import androidx.annotation.StringRes

data class LoginState(
    val nombre:String = "",
    val urlPhoto:String = "",

    @StringRes val errorMessages: Int? = null

)