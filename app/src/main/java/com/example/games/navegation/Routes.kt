package com.example.games.navegation

import java.net.URLEncoder
import java.nio.charset.StandardCharsets

sealed class Routes(val route:String) {
    object Login:Routes("Login")
    object Home:Routes("Home")
    object pf:Routes("PicasYFijas")
    object popcat:Routes("PopCat")

    object formInsertpf:Routes("formInsertpf/{record}") {
        fun createRoute(record:String):String {
            return "formInsertpf/$record"
        }
    }

    object formInsertpopcat:Routes("formInsertpopcat/{record}") {
        fun createRoute(record:String):String {
            return "formInsertpopcat/$record"
        }
    }




    object podioPF:Routes("podioPF")
    object podioPopCat:Routes("podioPopCat")

}
