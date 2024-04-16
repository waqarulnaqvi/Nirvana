package com.mysteriouscoder.physicalandmentalhealth.ui.screens.music.soothingmusic

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mysteriouscoder.physicalandmentalhealth.Heading
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.WeeklyGoals
import com.mysteriouscoder.physicalandmentalhealth.onImageCard
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80

@Composable
fun SoothingMusicForMind() {

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

            Heading(title = "Soothing Music")

            //            Spacer(modifier = Modifier.height(10.dp))

        }
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .padding(end = 10.dp)

            )
            {

                Text(
                    text = "00:00:00",

                    style = MaterialTheme.typography.displayMedium,
//                        fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
//                            fontStyle = FontStyle.Italic
                )

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

//            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            WeeklyGoals()
        }
        item{
            onImageCard(
                title = "Classical Music",
                subtitle = "10 min",
                image = R.drawable.meditation6,
            )

            onImageCard(
                title = "Meditative and healing music",
                subtitle = "10 min",
                image =  R.drawable.meditation,
            )



            onImageCard(
                title = "Nature Sounds",
                subtitle = "10 min",
                image =  R.drawable.soothingmusic,
            )





            onImageCard(
                title = "World Music",
                subtitle = "10 min",
                image =  R.drawable.b4,
            )

            onImageCard(
                title = "Soundtracks and Film Scores",
                subtitle = "10 min",
                image = R.drawable.b2,
            )



            onImageCard(
                title = "Ambient Music",
                subtitle = "10 min",
                image =  R.drawable.meditation3,
            )


            onImageCard(
                title = "New Age Music",
                subtitle = "10 min",
                image =  R.drawable.meditation7,
            )

            onImageCard(
                title = "Instrumental Music",
                subtitle = "10 min",
                image = R.drawable.meditation4,
            )



        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SWPreview() {
    SoothingMusicForMind()


}