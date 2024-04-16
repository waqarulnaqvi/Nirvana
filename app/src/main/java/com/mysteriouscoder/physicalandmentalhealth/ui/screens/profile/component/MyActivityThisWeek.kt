package com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mysteriouscoder.physicalandmentalhealth.CardForProfileReport
import com.mysteriouscoder.physicalandmentalhealth.TotalSteps
import com.mysteriouscoder.physicalandmentalhealth.WorkoutReport
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component.custombargraph.BarGraph
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component.custombargraph.BarType
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.OrangeStart
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80

@Composable
fun MyActivityThisWeek() {
    var isVisible2 by remember {
        mutableStateOf(false)
    }

    var iconState2 by remember {
        mutableStateOf(Icons.Filled.ArrowDropUp)
    }
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(end = 10.dp)
                .padding(vertical = 10.dp)

        )
        {

            Text(
                text = "My Activity",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )


            OutlinedButton(
                onClick = {
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

                )
            ) {
                Text(text = "This week")
                Icon(imageVector = iconState2, contentDescription = "This week")
            }


        }
        if (isVisible2) {
            TotalSteps("15,054")

            Spacer(modifier = Modifier.height(10.dp))

            Column(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                val dataList = mutableListOf(3000, 5000, 7000, 9000, 15053)
                val floatValue = mutableListOf<Float>()
                val datesList = mutableListOf(4000, 5000, 1000,1500 ,1500, 1000,1054)

                dataList.forEachIndexed { index, value ->

                    floatValue.add(
                        index = index,
                        element = value.toFloat() / dataList.max().toFloat()
                    )

                }

                BarGraph(
                    graphBarData = floatValue,
                    xAxisScaleData = datesList,
                    barData_ = dataList,
                    height = 300.dp,
                    roundType = BarType.TOP_CURVED,
                    barWidth = 20.dp,
                    barColor = Purple80,
                    barArrangement = Arrangement.SpaceEvenly
                )
            }

            Row {

                CardForProfileReport(
                    title = "Distance",
                    unit = "km",
                    value = "4.5",
                    emoji = "🏃",
                    color = Purple80
                )

                CardForProfileReport(
                    title = "Time",
                    unit = "hours",
                    value = "6.5",
                    emoji = "⏰",
                    color = Purple80
                )
            }
            Row {
                WorkoutReport()

                WorkoutReport(
                    backgroundColor = OrangeStart,
                    emoji = "⚡",
                    title = "Protein",
                    value = "28.7 gm"
                )
            }
        }

    }
}