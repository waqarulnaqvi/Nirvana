package com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationAndSettings() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 10.dp)
            .padding(vertical = 10.dp)
    ) {

        BadgedBox(
            badge = {
                Badge(
//                    contentColor = Color.White,
//                    containerColor = Orange, // Corrected to Color.Orange
                    modifier = Modifier.offset(y = 2.dp, x = -7.dp)
//                        .size(10.dp)
                ) {
                    Text(
                        text = "22", // Corrected to provide text content
                    )
                }


            },

            )

        {
            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notification"
            )

        }

        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = "Setting",
            modifier = Modifier.size(32.dp),

//                tint = Color.White

        )
    }
    
}