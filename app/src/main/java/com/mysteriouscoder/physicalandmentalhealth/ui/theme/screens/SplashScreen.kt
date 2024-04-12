package com.mysteriouscoder.physicalandmentalhealth.ui.theme.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.App_icon_component
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        var scale: Animatable<Float, AnimationVector1D> = remember {
            Animatable(0.0f)
        }

        LaunchedEffect(key1 = true)
        {
            scale.animateTo(
                targetValue = 0.0f,
                animationSpec = tween(800,
                    easing = {
                        OvershootInterpolator(4f).getInterpolation(it)
                    })
            )
            delay(800)
            navHostController.navigate(Navigationitems.Meditation.route)
            {
                popUpTo(Navigationitems.splashScreen.route)
                {
                    inclusive = true
                }
            }
        }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.onSecondaryContainer else MaterialTheme.colorScheme.onPrimary)
//            .background(Color.Cyan)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
            App_icon_component()

            }

        }
    }

//you should start all event handling function using "on" keyword

@Preview(showSystemUi = true)
@Composable
fun SplashScreenprev() {
SplashScreen(rememberNavController())

}

