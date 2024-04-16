package com.syedwaqarul.tipcalculator.Navigation

sealed class Navigationitems(var route:String) {

    object splashScreen: Navigationitems("SplashScreen")
    object BinauralBeats: Navigationitems("BinauralBeats")
    object Meditation: Navigationitems("Meditation")
    object Exercises: Navigationitems("Exercises")
    object Yoga: Navigationitems("Yoga")
    object AI_friend: Navigationitems("AI friend")
    object Profile: Navigationitems("Profile")
    object BottomNavigation: Navigationitems("BottomNavigation")

    object acountCreateScreen: Navigationitems("AccountCreate")
    object LoginScreen: Navigationitems("LoginScreen")
    object MenWorkout: Navigationitems("MenWorkout")
    object WomenWorkout: Navigationitems("WomenWorkout")
    object SoothingMusic: Navigationitems("SoothingMusic")

}

//3 36