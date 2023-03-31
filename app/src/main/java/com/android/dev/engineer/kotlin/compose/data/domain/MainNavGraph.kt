package com.android.dev.engineer.kotlin.compose.data.domain

sealed class MainNavGraph(val route: String) {
    object Intro : MainNavGraph(route = "intro")
    object SignIn : MainNavGraph(route = "sign_in")
}