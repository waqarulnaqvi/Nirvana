package com.mysteriouscoder.physicalandmentalhealth.ui.screens.exercises

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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.DirectionsBike
import androidx.compose.material.icons.filled.DirectionsRun
import androidx.compose.material.icons.filled.DirectionsWalk
import androidx.compose.material.icons.filled.ElderlyWoman
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.HotTub
import androidx.compose.material.icons.filled.Man3
import androidx.compose.material.icons.filled.Mediation
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.Sledding
import androidx.compose.material.icons.filled.TrendingDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.Challenges
import com.mysteriouscoder.physicalandmentalhealth.Daily_Excercise
import com.mysteriouscoder.physicalandmentalhealth.Heading
import com.mysteriouscoder.physicalandmentalhealth.ImageCardForAllExercises
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems

@Composable
//fun Body(): MediaPlayer? {
fun UnisexExercises(navHostController: NavHostController) {
//    var player: MediaPlayer? = null

    LazyColumn(
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(GreyBg)
            .fillMaxSize()
            .padding(top = 10.dp)
            .padding(bottom = 20.dp)
    )
    {


        item {

            Column(
                Modifier.padding(start = 10.dp)
            ) {


                Heading(title = "Exercises")


                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                        .padding(end = 10.dp)

                )
                {


                    Column {
                        Text(
                            text = "Outdoor run",
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
//                        fontStyle = FontStyle.Italic,
                            color = Color.Gray
                        )
                        Row {


                            Text(
                                text = "0.00",
                                style = MaterialTheme.typography.displayMedium,
//                        fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.SansSerif,
//                            fontStyle = FontStyle.Italic
                            )

                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "km",
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .align(Alignment.Bottom)
                                    .padding(bottom = 8.dp),
//                        fontStyle = FontStyle.Italic,
                                color = Color.Gray,
                            )
                        }

                        Text(
                            text = "Running for a better self",
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
//                        fontStyle = FontStyle.Italic,
                            color = Color.Gray
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
//                    shape = MaterialTheme.shapes.extraLarge,

                        modifier = Modifier
                            .clip(CircleShape)
                            .height(80.dp)
                            .width(80.dp)
//                    .background(
//                        color = Color.White
//                        ,
//                shape = CircleShape
//                )
                        ,
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor =
                                if (isSystemInDarkTheme()) Purple40 else Purple80,
                                contentColor = Color.White


                            )
                    ) {
                        Text(
                            text = "Go".uppercase(),
                            fontSize = 18.sp,
                        )
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
            }
            LazyRow()
            {
                item {
                    Spacer(modifier = Modifier.width(20.dp))
                    Daily_Excercise()
                    Spacer(modifier = Modifier.width(20.dp))

                    Daily_Excercise(
                        icon = Icons.Default.TrendingDown,
                        title = "Indoor run"
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Daily_Excercise(
                        icon = Icons.Default.DirectionsWalk,
                        title = "Walking"
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Daily_Excercise(
                        icon = Icons.Default.DirectionsBike,
                        title = "Cycling"
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Daily_Excercise(
                        icon = Icons.Default.Man3,
                        title = "Indoor"
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Daily_Excercise(
                        icon = Icons.Default.Mediation,
                        title = "Yoga"
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Daily_Excercise(
                        icon = Icons.Default.ElderlyWoman,
                        title = "Jump rope"
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Daily_Excercise(
                        icon = Icons.Default.MoreHoriz,
                        title = "More"
                    )
                    Spacer(modifier = Modifier.width(20.dp))


                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Challenges()
            Spacer(modifier = Modifier.height(20.dp))


            Column(
                Modifier.padding(start = 10.dp)
            ) {


                Text(
                    text = "Exercises",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxWidth()
                )


                Spacer(modifier = Modifier.height(10.dp))
                ImageCardForAllExercises(
                    title = "Men Exercises",
                    image = painterResource(id = R.drawable.menexercisewallpaper),
                    navHostController = navHostController,
                    navigationitems = Navigationitems.MenWorkout
                )

                ImageCardForAllExercises(
                    title = "Women Exercises",
                    image = painterResource(id = R.drawable.womenexercisefullpaper),
                    navHostController = navHostController,
                    navigationitems = Navigationitems.WomenWorkout

                )



                Spacer(modifier = Modifier.height(10.dp))



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

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(10.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Default.Sledding,
                            contentDescription = "",


                            tint = Color.White,
                            modifier = Modifier
                                .background(
                                    Purple80,
                                    shape = CircleShape
                                )
                                .padding(8.dp)
                                .size(24.dp)

                        )
                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Calories")
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

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(10.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Default.DirectionsRun,
                            contentDescription = "",


                            tint = Color.White,
                            modifier = Modifier
                                .background(
                                    Purple80,
                                    shape = CircleShape
                                )
                                .padding(8.dp)
                                .size(24.dp)

                        )
                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Steps")
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

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(10.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Default.FitnessCenter,
                            contentDescription = "",


                            tint = Color.White,
                            modifier = Modifier
                                .background(
                                    Purple80,
                                    shape = CircleShape
                                )
                                .padding(8.dp)
                                .size(24.dp)

                        )
                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Activity")
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

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(10.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Default.Alarm,
                            contentDescription = "",


                            tint = Color.White,
                            modifier = Modifier
                                .background(
                                    Purple80,
                                    shape = CircleShape
                                )
                                .padding(8.dp)
                                .size(24.dp)

                        )
                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Hours Activity")
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

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(10.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Default.HotTub,
                            contentDescription = "",

                            tint = Color.White,
                            modifier = Modifier
                                .background(
                                    Purple80,
                                    shape = CircleShape
                                )
                                .padding(8.dp)
                                .size(24.dp)

                        )
                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Temperature")
                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun BodyPreview() {
    PhysicalAndMentalHealthTheme {
        UnisexExercises(rememberNavController())
    }

}