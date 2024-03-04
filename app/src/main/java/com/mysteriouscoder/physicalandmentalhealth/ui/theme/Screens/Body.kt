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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80

@Composable
fun Body() {
    LazyColumn(
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(GreyBg)
            .fillMaxSize()
            .padding(top = 10.dp)
            .padding(bottom = 20.dp)
            .padding(start = 10.dp)

    )
    {

        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxSize()
            ) {

                Text(
                    text = "Exercise",
                    style = MaterialTheme.typography.headlineMedium,
//                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
            }
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

            LazyRow()
            {
                item {

                    Daily_Excercise()
                    Spacer(modifier = Modifier.width(20.dp))

                    Daily_Excercise(icon = Icons.Default.TrendingDown,
                        title = "Indoor run")
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

            Text(text = "Challenges",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))

            LazyRow()
            {
                item {

                    ChallengesCard(
                        image= painterResource(id = R.drawable.gym2),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp))

                    ChallengesCard(
                        title = "14 Days full Body",
                        subtitle = "Easily shape your life",
                        image= painterResource(id = R.drawable.gym1),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp))
//
                    ChallengesCard(
                        title = "14 Days upper Body",
                        subtitle = "Shape a Strong upper body",
                        image= painterResource(id = R.drawable.gym3),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp))
//
                    ChallengesCard(
                        title = "7 Day shoulder",
                        subtitle = "Shape a Strong back",
                        image= painterResource(id = R.drawable.gym4),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp))

                    ChallengesCard(title = "21 Day full body",
                        subtitle = "Daily make yourself 1% better",
                        image= painterResource(id = R.drawable.gym5),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp))

                }
            }


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




            Spacer(modifier = Modifier.height(40.dp))


        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun BodyPreview() {
    PhysicalAndMentalHealthTheme {
        Body()
    }

}

@Composable
fun Daily_Excercise(
    icon: ImageVector = Icons.Default.DirectionsRun,
    title: String = "Outdoor run"
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            imageVector = icon,
            contentDescription = "",


            tint = Color.White,
            modifier = Modifier
                .background(
                    Purple80,
                    shape = CircleShape
                )
                .padding(8.dp)
                .size(38.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = title,
            fontSize = 12.sp,
//                            fontStyle = FontStyle.Italic
        )
    }

}

@Composable
fun ChallengesCard(
    color:Color= Purple80,
    title: String="3km Running",
    subtitle:String="The basic of running",
    image: Painter =painterResource(id = R.drawable.undraw_mobile_content_xvgr),
    modifier:Modifier=Modifier
) {


    Box(
        modifier = Modifier
//                    .weight(1f)
            .width(260.dp)
            .padding(10.dp)
//                    .border(2.dp, Color.Gray, RoundedCornerShape(18.dp))
            .background(

                shape = MaterialTheme.shapes.large,
                color = color,

                )
    )
    {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .width(220.dp),

            ) {


            Image(
                painter = image,
                contentDescription = "",
                modifier=modifier,
                contentScale = ContentScale.Fit,
            )

            Spacer(modifier = Modifier.height(14.dp))




            Text(
                text = title.uppercase(),
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = subtitle,
                fontSize = 12.sp,
                color = Color.White,

                )

            Spacer(modifier = Modifier.height(16.dp))



        }
    }
    
}