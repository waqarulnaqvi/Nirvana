package com.mysteriouscoder.physicalandmentalhealth.ui.theme.Navigation

import androidx.compose.foundation.Image
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
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Screens.AI_friend
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Screens.Body
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Screens.Mind
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Screens.Profile
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Screens.Spirituality
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems

@Composable
fun Bottom_Navigation() {
    val navigationController= rememberNavController()
    val items = listOf(
        BottomNavigationItem(
            title = "Mind",
            selectedIcon =painterResource(id = R.drawable.mind_icon_selected),
            unselectedIcon = painterResource(id = R.drawable.mind_icon_unselected),


            ),
        BottomNavigationItem(
            title = "Body",
            selectedIcon = painterResource(id = R.drawable.body_icon_selected),
            unselectedIcon = painterResource(id = R.drawable.body_icon_unselected),

        ),
//        BottomNavigationItem(
//            title = "Spirituality",
//            selectedIcon = painterResource(id = R.drawable.spirituality_icon_selected),
//            unselectedIcon = painterResource(id = R.drawable.spirituality_icon_unselected),
//
//        ),
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
                containerColor = Purple80,
//                contentColor = Color.Yellow

            ) {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItemIndex == index,
                        onClick = {
                            selectedItemIndex = index
                            navigationController.navigate(item.title)

                        },
                        label = {
                            Text(text = item.title,
                                fontFamily = FontFamily.Serif,
                                fontSize =if (selectedItemIndex==index) 10.sp else 8.sp,
//                                color =  if (selectedItemIndex==index) Color.Black else Color.White,
                                color =  Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        },
                        icon = {

                            if (index == selectedItemIndex) {
                                Image(
                                    painter = item.selectedIcon,
                                    contentDescription = item.title,
                                    modifier = Modifier.size(24.dp),
//                                    tint =  if (selectedItemIndex==index) Color.Black else Color.White

                                )
                            }
                            else
                            {
                                Icon(
                                    painter = item.unselectedIcon,
                                    contentDescription = item.title,
                                    modifier = Modifier.size(24.dp),
                                    tint =  Color.White

                                )
                            }
                        }
                    )
                }
            }
        }
    )
    { paddingValues->
        NavHost(
            navController = navigationController,
            startDestination = Navigationitems.Mind.route
        )
        {

//            composable(Navigationitems.splashScreen.route)
//            {
//               SplashScreen()
//            }


            composable(Navigationitems.Mind.route) {

                Mind()
            }
            composable(Navigationitems.Body.route)
            {
                Body()
            }
            composable(Navigationitems.Profile.route)
            {
               Profile()
            }
            composable(Navigationitems.Spirituality.route)
            {
                Spirituality()
            }
            composable(Navigationitems.AI_friend.route)
            {
                AI_friend()
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
