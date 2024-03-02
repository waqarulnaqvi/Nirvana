package com.mysteriouscoder.physicalandmentalhealth.ui.theme.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme

@Composable
fun Mind() {
    LazyColumn(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    )
    {
        item {
            Text(text = "Mental Health",
                color = Color.Green,
                style = MaterialTheme.typography.headlineLarge)
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