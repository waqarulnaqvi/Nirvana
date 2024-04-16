package com.mysteriouscoder.physicalandmentalhealth.ui.screens.yoga

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mysteriouscoder.physicalandmentalhealth.Challenges
import com.mysteriouscoder.physicalandmentalhealth.Heading
import com.mysteriouscoder.physicalandmentalhealth.WeeklyGoals
import com.mysteriouscoder.physicalandmentalhealth.Workout_Kcal_minute_Display
import com.mysteriouscoder.physicalandmentalhealth.dataclass.yogaList
import com.mysteriouscoder.physicalandmentalhealth.heading_beg_adv_int
import com.mysteriouscoder.physicalandmentalhealth.onImageCard
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg

@Composable
fun Yoga() {
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

                Heading(title = "Yoga")



                Workout_Kcal_minute_Display()


                WeeklyGoals()
            }
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))

            Challenges()

            Spacer(modifier = Modifier.height(20.dp))
        }

        item {
            Column(
                Modifier.padding(start = 10.dp)
            ) {
                heading_beg_adv_int("All types of yoga")
            }
        }
        items(yogaList)
        { task ->
            Row {
                Spacer(modifier = Modifier.width(10.dp))


                onImageCard(
                    title = task.title,
                    subtitle = task.subtitle,
                    image = task.image
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
        }


    }
}

@Preview(showSystemUi = true)
@Composable
fun YWPreview() {
    Yoga()


}

