package com.mysteriouscoder.physicalandmentalhealth.ui.screens.Profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.Challenges
import com.mysteriouscoder.physicalandmentalhealth.ImageCardForAllExercises
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.WeeklyGoals
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Profile(navHostController:NavHostController,
            navigationitems: Navigationitems=Navigationitems.LoginScreen) {
    var isVisible by remember {
        mutableStateOf(false)
    }

    var iconState by remember {
        mutableStateOf(Icons.Filled.ArrowDropUp)
    }

    var isVisible2 by remember {
        mutableStateOf(false)
    }

    var iconState2 by remember {
        mutableStateOf(Icons.Filled.ArrowDropUp)
    }


    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(GreyBg)
            .fillMaxSize()
            .padding(10.dp)
            .padding(bottom = 10.dp)

    )
    {

        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxSize().padding( 10.dp)
            ) {

                BadgedBox(
                    badge = {
                        Badge(
//                    contentColor = Color.White,
//                    containerColor = Orange, // Corrected to Color.Orange
                            modifier = Modifier.offset(y = 2.dp, x = -7.dp)
//                        .size(10.dp)
                        ) {
                            Text(
                                text = "22", // Corrected to provide text content
                            )
                        }



                    },

                    )

                {
                    Icon(modifier=Modifier.size(30.dp),
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notification")

                }

                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Setting",
                    modifier = Modifier.size(32.dp),

//                tint = Color.White

                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)

            )
            {

                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Setting",
                    modifier = Modifier.size(56.dp),

//                tint = Color.White

                )

                Column {
                    Text(
                        text = "Log in to App",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
//                        fontStyle = FontStyle.Italic
                    )
                    Text(
                        text = "Start your fulfillment journey",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
//                        fontStyle = FontStyle.Italic,
                        color = Color.Gray
                    )
                }

                Button(
                    onClick = {
                        navHostController.navigate(navigationitems.route)
                    },

                    modifier = Modifier
//                        .width(50.dp)
//                        .padding(20.dp)
                    ,
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor =
                            if (isSystemInDarkTheme()) Purple40 else Purple80,
                            contentColor = Color.White


                        )
                ) {
                    Text(
                        text = "log in".uppercase(),
                        fontSize = 8.sp,
                    )
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            WeeklyGoals()

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        10.dp
                    )

            )
            {



                Text(text = "History",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )


                OutlinedButton(onClick = {
                    if (isVisible) {
                        iconState = Icons.Filled.ArrowDropUp
                    } else {
                        iconState = Icons.Rounded.ArrowDropDown
                    }
                    isVisible = !isVisible

                },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.Transparent

                    )) {
                    Text(text = "Past week")
                    Icon(imageVector = iconState, contentDescription = "This week")
                }

                }
            if (isVisible) {
                Challenges()


            }
            Spacer(modifier = Modifier.height(5.dp))
            Divider(modifier=Modifier.fillMaxWidth().
            background(Color.LightGray)
                .padding(start=15.dp,end=15.dp))
            Spacer(modifier = Modifier.height(5.dp))



            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        10.dp
                    )

            )
            {

                Text(text = "My Activity",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )


                OutlinedButton(onClick = {
                    if (isVisible2) {
                        iconState2 = Icons.Filled.ArrowDropUp
                    } else {
                        iconState2 = Icons.Rounded.ArrowDropDown
                    }
                    isVisible2 = !isVisible2

                },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.Transparent

                    )) {
                    Text(text = "This week")
                    Icon(imageVector = iconState2, contentDescription = "This week")
                }





            }
            if (isVisible2) {
                ImageCardForAllExercises(
                    title = "Soothing Music",
                    image = painterResource(id = R.drawable.soothingmusic),
                    navHostController = navHostController



                )
            }

            Spacer(modifier = Modifier.height(5.dp))
            Divider(modifier=Modifier.fillMaxWidth().
            background(Color.LightGray)
                .padding(start=15.dp,end=15.dp))

        }


    }

}


@Preview(showSystemUi = true)
@Composable
fun ProfilePreview() {
    PhysicalAndMentalHealthTheme {
        Profile(rememberNavController())
    }

}
