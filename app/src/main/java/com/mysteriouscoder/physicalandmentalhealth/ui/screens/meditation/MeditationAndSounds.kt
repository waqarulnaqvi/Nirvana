package com.mysteriouscoder.physicalandmentalhealth.ui.screens.meditation

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.Heading
import com.mysteriouscoder.physicalandmentalhealth.ImageCard
import com.mysteriouscoder.physicalandmentalhealth.ImageCardForAllExercises
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.dataclass.meditationList
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems

@Composable
fun MeditationAndSounds(navHostController: NavHostController) {
//fun Mind(): MediaPlayer?  {
//    var player: MediaPlayer? = null
    var hours by remember { mutableStateOf("00") }
    var minutes by remember { mutableStateOf("00") }
    var seconds  by remember { mutableStateOf("00") }
    LazyColumn(
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(GreyBg)
            .fillMaxSize()
            .padding(top = 10.dp)
            .padding(bottom = 20.dp)
//            .padding(start = 10.dp)

    )
    {

        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxSize()
            ) {
//                player = PlayAudio(music = R.raw.bg_music)

//                Text(
//                    text = "Mental Peace",
//                    style = MaterialTheme.typography.headlineMedium,
////                    fontWeight = FontWeight.Bold,
//                    fontFamily = FontFamily.SansSerif,
//                    fontStyle = FontStyle.Italic,
//                    modifier = Modifier
//                        .padding(start = 10.dp)
//                )
                Heading(title = "Meditation",
            modifier=Modifier.padding(start = 10.dp)
                    )

            }
            Spacer(modifier = Modifier.height(20.dp))

        }
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .padding(end = 10.dp)
                    .padding(start = 10.dp)

            )
            {


                Column {


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
                            text = "${hours}:${minutes}:${seconds}",

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
                    Icon(
                        imageVector = Icons.Default.Done, contentDescription = "Done",
                        modifier = Modifier.size(42.dp)
                    )
                }
            }




            Spacer(modifier = Modifier.height(20.dp))

        }
        item {

            Text(
                text = "Types of Meditation",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            LazyRow()
            {
                items(meditationList.size)
                {index->

                    if(index== 0)
                    {
                        Spacer(modifier = Modifier.width(10.dp))
                    }

                    ImageCard(
                        title = meditationList[index].title,
                        subtitle = meditationList[index].subtitle,
                        image = meditationList[index].image
                    )

                    if(index== meditationList.size-1)
                    {
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }


            }

            Spacer(modifier = Modifier.height(20.dp))

        }
        item {
            Text(
                text = "Soothing Music & Binaural Beats",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))
        }
        item(
        ){
            Column(
                modifier=Modifier.padding(start=10.dp)
            ) {

                ImageCardForAllExercises(
                    title = "BINAURAL BEATS",
                    image = painterResource(id = R.drawable.b5),
                    navHostController = navHostController,
                    navigationitems = Navigationitems.BinauralBeats,

                    )
                Spacer(modifier = Modifier.height(10.dp))

//            Spacer(modifier = Modifier.height(20.dp))
//            Text(
//                text = "Soothing music",
//                style = MaterialTheme.typography.bodyLarge,
//                fontWeight = FontWeight.Bold,
//                fontFamily = FontFamily.SansSerif,
//                fontStyle = FontStyle.Italic,
//                modifier = Modifier
//                    .padding(start = 10.dp)
//                    .fillMaxWidth()
//            )
//            Spacer(modifier = Modifier.height(10.dp))

                ImageCardForAllExercises(
                    title = "Soothing Music",
                    image = painterResource(id = R.drawable.soothingmusic),
                    navHostController = navHostController


                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }


    }
}

@Preview(showSystemUi = true)
@Composable
fun MindPreview() {
    PhysicalAndMentalHealthTheme {
        MeditationAndSounds(rememberNavController())
    }

}

//20 34