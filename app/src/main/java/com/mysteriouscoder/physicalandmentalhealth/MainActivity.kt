package com.mysteriouscoder.physicalandmentalhealth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.ui.navigation.Navigation
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.onboarding.OnBoardingScreen
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.onboarding.OnBoardingViewModel


class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        installSplashScreen()
        setContent {
            PhysicalAndMentalHealthTheme {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background))
                {
                    val viewModel: OnBoardingViewModel = hiltViewModel()
                    OnBoardingScreen(
                        event = viewModel::onEvent
                    )
                }
//                MyApp()
//                Bottom_Navigation()
//
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        it
        var navHostController = rememberNavController()
        Navigation(navHostController = navHostController)
    }


}

//11 36