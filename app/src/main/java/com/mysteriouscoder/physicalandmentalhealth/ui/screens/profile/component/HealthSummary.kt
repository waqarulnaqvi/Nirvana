package com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mysteriouscoder.physicalandmentalhealth.CardForProfileReport
import com.mysteriouscoder.physicalandmentalhealth.Daily_Excercise
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.OrangeStart
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80

@Preview(showSystemUi = true)
@Composable
fun HealthSummary() {

    Column{
        Text(
            text = "Health Summary",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))



        Row {
            Column {

                Card(
                    modifier = Modifier
                        .width(180.dp)
                        .height(220.dp)
                        .padding(10.dp),
                    shape = RoundedCornerShape(15.dp),
                    elevation = CardDefaults.cardElevation(5.dp)


                )
                {

                    Box(
                        modifier = Modifier
                            .height(200.dp)
                            .background(Purple80)
                    ) {


                        Column(
                            modifier = Modifier
                                .padding(10.dp)
                                .width(220.dp),

                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Spacer(modifier = Modifier.weight(1f))

                            Daily_Excercise(
                                backgroundColor = OrangeStart,
                                title = ""
                            )

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {

                                Text(
                                        text= buildAnnotatedString {
                                        withStyle(
                                        style = SpanStyle(
                                            fontSize = 50.sp,
                                        )

                                            )
                                        {
                                            append("3k ")
                                        }
                                        append("Steps")
                                    },
                                    style = MaterialTheme.typography.bodyLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "Out of 4000",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(16.dp))


                        }
                    }
                }
                CardForProfileReport(
                    title = "Calories",
                    unit = "cal",
                    value = "2.2k",
                    emoji = "🔥"

                )
            }
            Column {

                CardForProfileReport()

                Card(
                    modifier = Modifier
                        .width(180.dp)
                        .height(220.dp)
                        .padding(10.dp),
                    shape = RoundedCornerShape(15.dp),
                    elevation = CardDefaults.cardElevation(5.dp)


                )
                {

                    Box(
                        modifier = Modifier
                            .height(200.dp)
                            .background(Color.White)
                            .padding(10.dp),
                    ) {


                        Column(
                            modifier = Modifier
                                .padding(10.dp)
                                .width(220.dp),

                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Spacer(modifier = Modifier.weight(1f))



                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()


                            ) {

                                Text(
                                    text = "Heart",
                                    style = MaterialTheme.typography.headlineSmall,
                                    fontWeight = FontWeight.Bold,


                                    )

                                Text(
                                    text = "❤️",
                                    style = MaterialTheme.typography.bodyLarge,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Icon(
                                painter = painterResource(id = R.drawable.heartrateicon),
                                contentDescription = "heart rate",
                                modifier = Modifier.size(80.dp),
                                tint = Purple80
//

                            )



                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {

                                        Text(
                                            text= buildAnnotatedString {
                                                withStyle(
                                                    style = SpanStyle(
                                                        fontSize = 40.sp,
                                                        color = Purple80
                                                    )

                                                )
                                                {
                                                    append("120 ")
                                                }
                                                append("bpm")
                                            },
                                            style = MaterialTheme.typography.bodyLarge,
                                            fontWeight = FontWeight.Bold,

                                        )
                            }



                            Spacer(modifier = Modifier.height(16.dp))


                        }
                    }
                }
            }
        }

    }
    
}