package com.mysteriouscoder.physicalandmentalhealth.ui.theme.Screens

import androidx.compose.foundation.background
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FamilyRestroom
import androidx.compose.material.icons.filled.Nature
import androidx.compose.material.icons.filled.NaturePeople
import androidx.compose.material.icons.filled.QueueMusic
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
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80

@Composable
fun Mind() {
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
                    text = "Mental Peace",
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


                Column(
                ) {


                    Text(
                        text = "Meditation",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
//                        fontStyle = FontStyle.Italic,
                        color = Color.Gray
                    )
                    Row {


                        Text(
                            text = "00:00:00",
                            style = MaterialTheme.typography.displayMedium,
//                        fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
//                            fontStyle = FontStyle.Italic
                        )

                    }

                    Text(
                        text = "Meditate for peace",
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


            Box(
                modifier = Modifier
//                    .weight(1f)
                    .fillMaxWidth()
                    .padding(20.dp)
//                    .border(2.dp, Color.Gray, RoundedCornerShape(18.dp))
                    .background(

                        shape = MaterialTheme.shapes.large,
                        color = Color.White,

                        )
            )
            {

                Row(
                    modifier=Modifier.padding(20.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        Icon(
                            imageVector = Icons.Default.FamilyRestroom,
                            contentDescription = "",


//                            tint = Color.White,
                            modifier = Modifier
//                                .background(
//                                    Purple80,
//                                    shape = CircleShape
//                                )
//                                .padding(8.dp)
                                .size(38.dp)
                        )

                        Text(text = "My family ",
                            fontSize = 8.sp)


                    }

                    Spacer(modifier = Modifier.width(30.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        Icon(
                            imageVector = Icons.Default.QueueMusic,
                            contentDescription = "",


//                            tint = Color.White,
                            modifier = Modifier
//                                .background(
//                                    Purple80,
//                                    shape = CircleShape
//                                )
//                                .padding(8.dp)
                                .size(38.dp)
                        )

                        Text(text = "Sleep music",
                            fontSize = 8.sp)


                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        Icon(
                            imageVector = Icons.Default.NaturePeople,
                            contentDescription = "",


//                            tint = Color.White,
                            modifier = Modifier
//                                .background(
//                                    Purple80,
//                                    shape = CircleShape
//                                )
//                                .padding(8.dp)
                                .size(38.dp)
                        )

                        Text(text = "Sleep in relief",
                            fontSize = 8.sp)


                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        Icon(
                            imageVector = Icons.Default.Nature,
                            contentDescription = "",


//                            tint = Color.White,
                            modifier = Modifier
//                                .background(
//                                    Purple80,
//                                    shape = CircleShape
//                                )
//                                .padding(8.dp)
                                .size(38.dp)
                        )

                        Text(text = "Stress relief",
                            fontSize = 8.sp)


                    }



                }



            }
            Spacer(modifier = Modifier.height(20.dp))



            Text(text = "Types of Meditation",
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

                    ChallengesCard(color = Purple80,
                        title = "Mindfulness Meditation (Vipassana",
                        subtitle = "Focuses on observing thoughts and sensations without attachment or judgment.",
                        image= painterResource(id = R.drawable.meditation),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp)
//                            .clip(MaterialTheme.shapes.extraLarge)
                    )
////
                    ChallengesCard(color = Purple80,
                        title = "Transcendental Meditation (TM)",
                        subtitle = " Involves silently repeating a mantra to achieve a state of relaxed awareness.",
                        image= painterResource(id = R.drawable.meditation2),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp)
//                            .clip(MaterialTheme.shapes.medium)
                    )
//
                    ChallengesCard(color = Purple80,
                        title = "Loving-Kindness Meditation (Metta)",
                        subtitle = " Focuses on cultivating feelings of love and compassion towards oneself and others.",
                        image= painterResource(id = R.drawable.meditation3),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp)
//                            .clip(MaterialTheme.shapes.medium)
                    )


                    ChallengesCard(color = Purple80,
                        title = "Zen Meditation (Zazen)",
                        subtitle = "Emphasizes sitting in a specific posture and observing thoughts to reach a state of insight and enlightenment.",
                        image= painterResource(id = R.drawable.meditation4),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp)
//                            .clip(MaterialTheme.shapes.medium)
                    )


                    ChallengesCard(color = Purple80,
                        title = "Guided Meditation",
                        subtitle = "Involves a guide leading the practitioner through a visualization or a series of mental images to achieve a specific outcome.",
                        image= painterResource(id = R.drawable.meditation5),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp)
//                            .clip(MaterialTheme.shapes.medium)
                    )

                    ChallengesCard(color = Purple80,
                        title = "Chakra Meditation",
                        subtitle = "Focuses on aligning and balancing the body's energy centers (chakras) through visualization and breath control.",
                        image= painterResource(id = R.drawable.meditation6),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp)
//                            .clip(MaterialTheme.shapes.medium)
                    )

                    ChallengesCard(color = Purple80,
                        title = "Yoga Nidra",
                        subtitle = "A form of guided relaxation that leads to a state of conscious relaxation between wakefulness and sleep.",
                        image= painterResource(id = R.drawable.meditation7),
                        modifier = Modifier
                            .height(200.dp)
                            .size(1000.dp)
//                            .clip(MaterialTheme.shapes.medium)
                    )


                }
                }
            }
        }
    }

@Preview(showSystemUi = true)
@Composable
fun MindPreview() {
    PhysicalAndMentalHealthTheme {
        Mind()
    }

}

//1 43 to 3 14