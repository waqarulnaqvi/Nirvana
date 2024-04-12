package com.mysteriouscoder.physicalandmentalhealth.ui.Navigation

import android.media.MediaPlayer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.AIFriend.AI_friend
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Exercises.Body
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Exercises.MenWorkout
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Exercises.WomenWorkout
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Login.AccountCreate
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Login.LoginScreen
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Meditation.Mind
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Music.BinauralBeats
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Music.SoothingMusic
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Profile.Profile
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.screens.SplashScreen
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.Yoga.YogaWorkout
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.White
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems


@Composable
fun Bottom_Navigation() {
    val navigationController = rememberNavController()
    val items = listOf(
        BottomNavigationItem(
            title = "Meditation",
            selectedIcon = painterResource(id = R.drawable.meditation_icon_selected),
            unselectedIcon = painterResource(id = R.drawable.meditation_icon_unselected),

            ),

        BottomNavigationItem(
            title = "Exercises",
            selectedIcon = painterResource(id = R.drawable.exercises_icon_selected),
            unselectedIcon = painterResource(id = R.drawable.exercises_icon_unselected),

            ),

        BottomNavigationItem(
            title = "Yoga",
            selectedIcon = painterResource(id = R.drawable.yoga_icon_selected),
            unselectedIcon = painterResource(id = R.drawable.yoga_icon_unselected),

            ),

        BottomNavigationItem(
            title = "AI friend",
            selectedIcon = painterResource(id = R.drawable.ai_friend_icon_selected),
            unselectedIcon = painterResource(id = R.drawable.ai_friend_icon_unselected),

            ),
        BottomNavigationItem(
            title = "Profile",
            selectedIcon = painterResource(id = R.drawable.profile_selected),
            unselectedIcon = painterResource(id = R.drawable.profile_unselected),

            )
    )
    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }

    Scaffold(


        bottomBar = {

            NavigationBar(
//                containerColor = Purple80,
                containerColor = White,

//                contentColor = Color.Yellow

            ) {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(selected = selectedItemIndex == index, onClick = {
                        selectedItemIndex = index
                        navigationController.navigate(item.title)

                    }, label = {
                        Text(
                            text = item.title,
                            fontFamily = FontFamily.Serif,
                            fontSize = if (selectedItemIndex == index) 10.sp else 8.sp,
//                                color =  if (selectedItemIndex==index) Color.Black else Color.White,
                            color = if (selectedItemIndex == index) Purple80 else Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }, icon = {

                        if (index == selectedItemIndex) {
//                            Image(
//                                painter = item.selectedIcon,
//                                contentDescription = item.title,
//                                modifier = Modifier.size(24.dp),
////                                    tint =  if (selectedItemIndex==index) Color.Black else Color.White
//
//                            )

                            Icon(
                                painter = item.selectedIcon,
                                contentDescription = item.title,
                                modifier = Modifier.size(24.dp),
                                tint = Purple80

                            )
                        } else {
                            Icon(
                                painter = item.unselectedIcon,
                                contentDescription = item.title,
                                modifier = Modifier.size(24.dp),
                                tint = Color.Black

                            )
                        }
                    })
                }
            }
        }) { paddingValues ->

//        var player: MediaPlayer? = null
        NavHost(
            navController = navigationController,
            startDestination = Navigationitems.Meditation.route,
            modifier = Modifier.padding(paddingValues)
        ) {

            composable(Navigationitems.Meditation.route) {
                Mind(
                    navigationController
                )
            }
                composable(Navigationitems.BinauralBeats.route) {
                  BinauralBeats()
//                StopAudio(mediaPlayerState = player)
//                player = PlayAudio(music = R.raw.bg_music)

            }
            composable(Navigationitems.Exercises.route) {
                Body(navigationController)
//                StopAudio(mediaPlayerState = player)
//                player = PlayAudio(music = R.raw.bg_music_body)

            }
            composable(Navigationitems.Profile.route) {
//                StopAudio(mediaPlayerState = player)
                Profile(navigationController)
            }
            composable(Navigationitems.Yoga.route) {
//                Spirituality()
                YogaWorkout()
            }
            composable(Navigationitems.AI_friend.route) {
                AI_friend()
            }

            composable(Navigationitems.splashScreen.route) {
                SplashScreen(navigationController)
            }

            composable(Navigationitems.acountCreateScreen.route) {
                AccountCreate(navigationController)
            }
            composable(Navigationitems.LoginScreen.route) {

                LoginScreen(navHostController = navigationController)
//            LoginScreen()
            }
            composable(Navigationitems.MenWorkout.route) {

                MenWorkout()
            }
            composable(Navigationitems.WomenWorkout.route) {

                WomenWorkout()
            }
            composable(Navigationitems.YogaWorkout.route) {
                YogaWorkout()
            }
            composable(Navigationitems.SoothingMusic.route) {
                SoothingMusic()
            }
        }


    }

}


data class BottomNavigationItem(
    val title: String,
    val selectedIcon: Painter,
    val unselectedIcon: Painter,
//    val hasNews: Boolean,
//    val badgeCount: Int? = null
)

@Preview(showSystemUi = true)
@Composable
fun BottomNavigationPrev() {

    Bottom_Navigation()

}

@Composable
fun PlayAudio(music: Int): MediaPlayer {
    val context = LocalContext.current
    val mp: MediaPlayer = MediaPlayer.create(context, music)
    mp.start()
    return mp
}

//21 41