package com.example.myapp

sealed class screens(val route: String){
    object Login: screens(route = "Login_screen")
}

