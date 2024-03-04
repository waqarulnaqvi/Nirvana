package com.syedwaqarul.tipcalculator.Navigation

sealed class Navigationitems(var route:String) {

    object splashScreen: Navigationitems("SplashScreen")
    object Mind: Navigationitems("Mind")
    object Body: Navigationitems("Body")
    object Spirituality: Navigationitems("Spirituality")
    object AI_friend: Navigationitems("AI friend")
    object Profile: Navigationitems("Profile")
    object BottomNavigation: Navigationitems("BottomNavigation")

    object acountCreateScreen: Navigationitems("AccountCreate")
    object LoginScreen: Navigationitems("LoginScreen")
}

//3 36