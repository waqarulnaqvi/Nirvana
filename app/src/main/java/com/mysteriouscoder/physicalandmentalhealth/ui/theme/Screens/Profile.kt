package com.mysteriouscoder.physicalandmentalhealth.ui.theme.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Cabin
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.CurrencyBitcoin
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems

@Composable
fun Profile() {
    LazyColumn(
//        verticalArrangement = Arrangement.Center,
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
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxSize()
            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Setting",
                    modifier = Modifier.size(32.dp),

//                tint = Color.White

                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)

            )
            {

                Image(
                    painter = painterResource(id = R.drawable.profile_selected),
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

//                val navHostController:NavHostController
//                var navController = rememberNavController()
                        Button(
                    onClick = {
//                        navController.navigate(Navigationitems.LoginScreen.route)
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
            Spacer(modifier = Modifier.height(30.dp))

            Column(
                Modifier.fillMaxWidth()
            ) {

                Text(
                    text = "My services",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )

                Spacer(modifier = Modifier.height(8.dp))


                Box(
                    modifier = Modifier
//                    .weight(1f)
                        .fillMaxWidth()
                        .padding(10.dp)

                        .border(2.dp, Color.White, RoundedCornerShape(18.dp))
                        .background(

                            shape = MaterialTheme.shapes.large,
                            color = Color.White,

                            )
                )
                {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .width(220.dp),

                        ) {


                        Spacer(modifier = Modifier.height(4.dp))

                        Myservicescardvalue()
                        Spacer(modifier = Modifier.height(14.dp))


                        // Divider
                        Divider(
                            modifier = Modifier
                                .height(1.dp)
                                .background(color = Color.LightGray) // Set the color of the divider
                                .padding(vertical = 8.dp)
                                .width(290.dp)
                                .align(Alignment.End)
                        )
                        Spacer(modifier = Modifier.height(10.dp))

                        Myservicescardvalue(
                            icon = Icons.Default.Cabin,
                            title = "My courses"
                        )
                        Spacer(modifier = Modifier.height(14.dp))


                        // Divider
                        Divider(
                            modifier = Modifier
                                .height(1.dp)
                                .background(color = Color.LightGray) // Set the color of the divider
                                .padding(vertical = 8.dp)
                                .width(290.dp)
                                .align(Alignment.End)
                        )
                        Spacer(modifier = Modifier.height(10.dp))

                        Myservicescardvalue(
                            icon = Icons.Default.CalendarMonth,
                            title = "My plan"
                        )
                        Spacer(modifier = Modifier.height(14.dp))


                        // Divider
                        Divider(
                            modifier = Modifier
                                .height(1.dp)
                                .background(color = Color.LightGray) // Set the color of the divider
                                .padding(vertical = 8.dp)
                                .width(290.dp)
                                .align(Alignment.End)
                        )
                        Spacer(modifier = Modifier.height(10.dp))


                        Myservicescardvalue(
                            icon = Icons.Default.CurrencyBitcoin,
                            title = "All data"
                        )
                        Spacer(modifier = Modifier.height(14.dp))


                        // Divider
                        Divider(
                            modifier = Modifier
                                .height(1.dp)
                                .background(color = Color.LightGray) // Set the color of the divider
                                .padding(vertical = 8.dp)
                                .width(290.dp)
                                .align(Alignment.End)
                        )
                        Spacer(modifier = Modifier.height(10.dp))

                        Myservicescardvalue(
                            icon = Icons.Default.AccountCircle,
                            title = "My Profile"
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                    }
                }


                Box(
                    modifier = Modifier
//                    .weight(1f)
                        .fillMaxWidth()
                        .padding(10.dp)

                        .border(2.dp, Color.White, RoundedCornerShape(18.dp))
                        .background(

                            shape = MaterialTheme.shapes.large,
                            color = Color.White,

                            )
                )
                {

                    Spacer(modifier = Modifier.height(4.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .width(220.dp),

                        ) {
                        Myservicescardvalue(
                            icon = Icons.Default.Security,
                            title = "Privacy management"
                        )

                        Spacer(modifier = Modifier.height(14.dp))


                        // Divider
                        Divider(
                            modifier = Modifier
                                .height(1.dp)
                                .background(color = Color.LightGray) // Set the color of the divider
                                .padding(vertical = 8.dp)
                                .width(290.dp)
                                .align(Alignment.End)
                        )
                        Spacer(modifier = Modifier.height(10.dp))


                        Myservicescardvalue(
                            icon = Icons.Default.QuestionMark,
                            title = "Help and customer service"
                        )

                        Spacer(modifier = Modifier.height(4.dp))


                    }

                }
            }


        }


    }

}


@Preview(showSystemUi = true)
@Composable
fun ProfilePreview() {
    PhysicalAndMentalHealthTheme {
        Profile()
    }

}

@Composable
fun Myservicescardvalue(
    icon: ImageVector = Icons.Default.Home,
    title: String = "My family and friends"
) {

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {

        Spacer(modifier = Modifier.width(6.dp))

        Icon(
            imageVector = icon,
            contentDescription = "Setting",
            modifier = Modifier.size(24.dp),

//                tint = Color.White

        )
        Spacer(modifier = Modifier.width(18.dp))

        Text(text = title)


    }


}
