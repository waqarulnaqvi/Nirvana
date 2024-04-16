package com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.WeeklyGoals
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component.Goals
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component.HealthSummary
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component.MyActivityPreviousWeek
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component.MyActivityThisWeek
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component.NotificationAndSettings
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Profile(
    navHostController: NavHostController,
    navigationitems: Navigationitems = Navigationitems.LoginScreen
) {

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(GreyBg)
            .fillMaxSize()
            .padding(10.dp)
            .padding(bottom = 10.dp)
            .padding(start = 10.dp)

    )
    {

        item {

            NotificationAndSettings()
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp)
                    .padding(vertical = 10.dp)

            )
            {

                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile",
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


            Spacer(modifier = Modifier.height(10.dp))

            HealthSummary()



            Spacer(modifier = Modifier.height(10.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(start = 15.dp, end = 15.dp)
            )


            Spacer(modifier = Modifier.height(10.dp))


            MyActivityThisWeek()


            Spacer(modifier = Modifier.height(10.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(start = 15.dp, end = 15.dp)
            )

           MyActivityPreviousWeek()


            Spacer(modifier = Modifier.height(10.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(start = 15.dp, end = 15.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            Goals()

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
