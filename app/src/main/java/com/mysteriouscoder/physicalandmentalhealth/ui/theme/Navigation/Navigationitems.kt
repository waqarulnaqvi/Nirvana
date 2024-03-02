package com.syedwaqarul.tipcalculator.Navigation

sealed class Navigationitems(var route:String) {

    object splashScreen: Navigationitems("SplashScreen")
    object Mind: Navigationitems("Mind")
    object Body: Navigationitems("Body")
    object Spirituality: Navigationitems("Spirituality")
    object AI_friend: Navigationitems("AI friend")
    object Profile: Navigationitems("Profile")
}