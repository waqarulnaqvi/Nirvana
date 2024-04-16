package com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.DirectionsWalk
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Water
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
import com.mysteriouscoder.physicalandmentalhealth.GoalCompletedORPending
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.DarkRed

@Composable
fun Goals() {

    var isVisibleGoal by remember {
        mutableStateOf(false)
    }

    var iconStateGoal by remember {
        mutableStateOf(Icons.Filled.ArrowDropUp)
    }
    Column{
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
                text = "Goals",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )


            OutlinedButton(
                onClick = {
                    if (isVisibleGoal) {
                        iconStateGoal = Icons.Filled.ArrowDropUp
                    } else {
                        iconStateGoal = Icons.Rounded.ArrowDropDown
                    }
                    isVisibleGoal = !isVisibleGoal

                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.Transparent

                )
            ) {
                Text(text = "🎯")
                Icon(imageVector = iconStateGoal, contentDescription = "Goals")
            }


        }
        if (isVisibleGoal) {
            GoalCompletedORPending()
            GoalCompletedORPending(
                icon = Icons.Filled.DirectionsWalk,
            )

            GoalCompletedORPending(
                status = DarkRed,
                goal = "Swimming goal pending",
                icon = Icons.Filled.Water,
                time = "2h 2min | 2h 30 min"
            )

            GoalCompletedORPending(
                status = DarkRed,
                goal = "Gym goal pending",
                icon = Icons.Filled.FitnessCenter,
                time = "4h 32min | 7h 30 min"

            )
        }

    }
    
}