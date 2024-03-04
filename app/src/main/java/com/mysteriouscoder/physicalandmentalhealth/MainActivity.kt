package com.mysteriouscoder.physicalandmentalhealth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Navigation.Navigation
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhysicalAndMentalHealthTheme {

                MyApp()
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