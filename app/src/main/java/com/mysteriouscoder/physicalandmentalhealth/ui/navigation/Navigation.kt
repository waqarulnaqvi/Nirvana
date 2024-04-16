package com.mysteriouscoder.physicalandmentalhealth.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.login.accountcreatescreen.AccountCreate
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.login.loginscreen.Login
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.screens.SplashScreen
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems


@Composable
fun Navigation(navHostController: NavHostController) {//navHostController is a jetpack compose type controller

    NavHost(
        navController = navHostController,
        startDestination = Navigationitems.splashScreen.route
    )
    {

        composable(Navigationitems.splashScreen.route)
        {

            SplashScreen(navHostController)
        }

        composable(Navigationitems.BottomNavigation.route) {
           Bottom_Navigation()
        }

        composable(Navigationitems.acountCreateScreen.route) {
            AccountCreate(navHostController)
        }
        composable(Navigationitems.LoginScreen.route) {

            Login(navHostController = navHostController)
//            LoginScreen()
        }

    }


}

