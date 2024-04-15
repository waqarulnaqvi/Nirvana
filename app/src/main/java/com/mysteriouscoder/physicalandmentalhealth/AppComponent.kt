package com.mysteriouscoder.physicalandmentalhealth

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsRun
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mysteriouscoder.physicalandmentalhealth.dataclass.challengeslist
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreenStart
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.OrangeStart
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.WhiteGray
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems

@Composable
fun App_icon_component() {

    Image(
        painter = painterResource(id = R.drawable.appicon), contentDescription = "",
        modifier = Modifier
            .size(130.dp)
            .clip(CircleShape)

            .border(2.dp, Color.Yellow, shape = CircleShape),

        )

}


@Composable
fun UserInputField(
    label: String = "Email",
    icon: ImageVector = Icons.Default.Email,
    value: String = "",
    onValueChange: (String) -> Unit = {},
    isfocused: Boolean = false,
    modifier: Modifier = Modifier,
) {


    OutlinedTextField(

        singleLine = true,
        keyboardOptions =
        if (Icons.Default.PhoneAndroid == icon) {
            KeyboardOptions(keyboardType = KeyboardType.Number)

        } else {
            KeyboardOptions(keyboardType = KeyboardType.Text)
        },

        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = label,
                color = if (isfocused) Color.Blue else Color.Black
            )
        },
        leadingIcon = {
            Icon(
                icon,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 24.dp)
                    .padding(end = 8.dp),
//                tint = if (isfocused) Color.Blue else Color.Gray
            )
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(25.dp, 10.dp),


        )
}

@Composable
fun PasswordInput(
    label: String = "Email",
    icon: ImageVector = Icons.Default.Email,
    value: String = "",
    onValueChange: (String) -> Unit = {},
    isfocused: Boolean = false,
    modifier: Modifier = Modifier,
) {


    val passwordVisible = remember {
        mutableStateOf(false)
    }


    OutlinedTextField(

        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),


        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = label,
                color = if (isfocused) Color.Blue else Color.Black
            )
        },
        leadingIcon = {
            Icon(
                icon,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 24.dp)
                    .padding(end = 8.dp),
//                tint = if (isfocused) Color.Blue else Color.Gray
            )
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(25.dp, 10.dp),


        trailingIcon = {


            val iconImage = if (passwordVisible.value) {
                Icons.Filled.Visibility
            } else {
                Icons.Filled.VisibilityOff
            }

            var description = if (passwordVisible.value) {
                stringResource(id = R.string.hidepassword)
            } else {
                stringResource(id = R.string.showpassword)
            }

            IconButton(onClick = {
                passwordVisible.value = !passwordVisible.value
            }) {

                Icon(
                    imageVector = iconImage,
                    contentDescription = description
                )
            }

        },
        visualTransformation =


        if (passwordVisible.value) VisualTransformation.None
        else
            PasswordVisualTransformation()
    )
}


@Composable
fun RoundedButton(
//    navController: NavHostController,
    modifier: Modifier = Modifier,
    text: String = "Log in",

    onclick: () -> Unit = { }
) {

    var buttonClicked by remember { mutableStateOf(false) }
    Button(
        onClick = {

        },
        modifier = modifier
            .width(200.dp)
            .padding(20.dp),
        colors = ButtonDefaults
            .buttonColors(
                containerColor =
                if (isSystemInDarkTheme()) Purple40 else Purple80,
                contentColor = Color.White


            )

    ) {

        Text(text = text.uppercase())

    }
}


@Composable
fun Daily_Excercise(
    icon: ImageVector = Icons.Default.DirectionsRun,
    title: String = "Outdoor run",
    backgroundColor: Color = Purple80
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
                    backgroundColor,
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
    color: Color = Purple80,
    title: String = "3km Running",
    subtitle: String = "The basic of running",
    image: Painter = painterResource(id = R.drawable.undraw_mobile_content_xvgr),
    modifier: Modifier = Modifier
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
                modifier = modifier,
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


@Composable
fun onImageCard(

    title: String = "3km Running",
    subtitle: String = "The basic of running",
    image: Int = R.drawable.gym1,
    modifier: Modifier = Modifier
) {


    Card(
        modifier = modifier
            .fillMaxWidth()
            .width(260.dp)
            .height(150.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)


    )
    {

        val context = LocalContext.current
        Box(modifier = Modifier
            .height(200.dp)
            .clickable {


                val mp: MediaPlayer? = MediaPlayer.create(context, R.raw.bg_music)
                mp?.start()
                // Ensure to release the MediaPlayer when it's no longer needed
                mp?.setOnCompletionListener { mp.release() }

            }
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                modifier = modifier.size(400.dp),
                contentScale = ContentScale.Crop,
            )



            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp)
                    .padding(bottom = 10.dp)
                    .width(220.dp),


                ) {
                Spacer(modifier = Modifier.weight(1f))




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

}

@Composable
fun ImageCard(
    title: String = "3km Running",
    subtitle: String = "The basic of running",
    image: Int = R.drawable.gym1,
    modifier: Modifier = Modifier
) {


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .width(260.dp)
            .height(220.dp)
            .padding(10.dp)
//                    .border(2.dp, Color.Gray, RoundedCornerShape(18.dp))
//            .background(
//
//                shape = MaterialTheme.shapes.large,
//                color = color,
//
//                ),
        ,
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)


    )
    {

        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                modifier = modifier.size(400.dp),
                contentScale = ContentScale.Crop,
            )



            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .width(220.dp),

                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.weight(1f))




                Text(
                    text = title.uppercase(),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.White
                )
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Text(
//                text = subtitle,
//                fontSize = 12.sp,
//                color = Color.White,
//
//                )

                Spacer(modifier = Modifier.height(16.dp))


            }
        }
    }

}


@Composable
fun ChallengesImageCard(
    title: String = "3km Running",
    subtitle: String = "The basic of running",
    image: Int = R.drawable.gym1,
    modifier: Modifier = Modifier
) {


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .width(260.dp)
            .height(220.dp)
            .padding(10.dp)
//                    .border(2.dp, Color.Gray, RoundedCornerShape(18.dp))
//            .background(
//
//                shape = MaterialTheme.shapes.large,
//                color = color,
//
//                ),
        ,
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)


    )
    {

        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                modifier = modifier.size(400.dp),
                contentScale = ContentScale.Crop,
            )



            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .width(220.dp),

                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.weight(1f))




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

}


@Composable
fun ImageCardForAllExercises(
    title: String = "3km Running",

    image: Painter = painterResource(id = R.drawable.gym1),
    modifier: Modifier = Modifier,

//    screen:String="LoginScreen"
    navHostController: NavHostController,
    navigationitems: Navigationitems = Navigationitems.SoothingMusic
) {


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .width(260.dp)
            .height(120.dp)
            .then(modifier)
            .padding(10.dp)
            .clickable {
                navHostController.navigate(navigationitems.route)

            },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)


    )
    {

        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = image,
                contentDescription = "",
                modifier = modifier.size(400.dp),
                contentScale = ContentScale.Crop,
            )



            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .width(220.dp),

                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.weight(1f))




                Text(
                    text = title.uppercase(),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))


            }
        }
    }

}

//@Composable
//fun Myservicescardvalue(
//    icon: ImageVector = Icons.Default.Home,
//    title: String = "My family and friends"
//) {
//
//    Row(
//        modifier = Modifier.fillMaxWidth()
//    ) {
//
//        Spacer(modifier = Modifier.width(6.dp))
//
//        Icon(
//            imageVector = icon,
//            contentDescription = "Setting",
//            modifier = Modifier.size(24.dp),
//
////                tint = Color.White
//
//        )
//        Spacer(modifier = Modifier.width(18.dp))
//
//        Text(text = title)
//
//
//    }
//
//
//}

//Music Controller:
//@Composable
//fun PlayAudio(music: Int): MediaPlayer {
//    val context = LocalContext.current
//    val mp: MediaPlayer = MediaPlayer.create(context, music)
//    mp.start()
//    return mp
//}


//@Composable
//fun PlayAudio(music: Int)
//: MediaPlayer
//{
//    val context = LocalContext.current
//    val mp = remember { MediaPlayer.create(context, music) }
//    mp.start()
//
//    // Function to stop the MediaPlayer
//    val stopMediaPlayer: () -> Unit = {
//        if (mp.isPlaying) {
//            mp.stop()
//            mp.release()
//        }
//    }

// Remembering the function so it persists across recompositions
//    remember { stopMediaPlayer }

// Returning the MediaPlayer instance
//    return mp
//}

//@Composable
//fun StopAudio(mediaPlayerState: MediaPlayer?) {
//    Button(onClick = {
//        mediaPlayerState?.stop()
//    }) {
//        Text("Stop Audio")
//    }
//}

@Composable
fun Heading(
    title: String = "Men Workout",
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        style = MaterialTheme.typography.headlineMedium,
//                    fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp)
    )
}

@Composable
fun Workout_Kcal_minute_Display() {

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
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = "0".uppercase(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Workout".uppercase(),
                    fontSize = 12.sp
                )


            }

//                    Spacer(modifier = Modifier.width(30.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = "0".uppercase(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "kcal".uppercase(),
                    fontSize = 12.sp
                )


            }
//                    Spacer(modifier = Modifier.width(30.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = "0".uppercase(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Minute".uppercase(),
                    fontSize = 12.sp
                )


            }
        }
    }

}

@Composable
fun Challenges(Text: String = "Challenges") {
    Column(
        Modifier.padding(start = 10.dp)
    ) {

        Text(
            text = Text,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxWidth()
        )
    }
    Spacer(modifier = Modifier.height(10.dp))

    LazyRow()
    {
        items(challengeslist.size)
        { index ->

            if (index == 0) {
                Spacer(modifier = Modifier.width(10.dp))
            }

            ChallengesImageCard(
                title = challengeslist[index].title,
                subtitle = challengeslist[index].subtitle,
                image = challengeslist[index].image
            )

            if (index == challengeslist.size - 1) {
                Spacer(modifier = Modifier.width(10.dp))
            }
        }


    }
}

@Composable
fun heading_beg_adv_int(
    heading: String = "Beginner"
) {
    Text(
        text = heading.uppercase(),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 8.dp),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    )

}


@Composable
fun Dates(
    date: String = "10",
    datecolor: Color = Color.White,
    datebg: Color = Color.Gray
) {
    Text(
        text = date,
        fontWeight = FontWeight.Bold,
        modifier = Modifier

            .background(
                datebg,
                shape = CircleShape
            )
            .padding(8.dp), color = datecolor
    )

}


@Composable
fun WeeklyGoals() {
    heading_beg_adv_int("Week goal")


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
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {


            Dates()
            Dates(
                date = "11"
            )
            Dates(
                date = "12"
            )
            Dates(
                date = "13",
                datebg = Purple80
            )
            Dates(
                date = "14"
            )
            Dates(
                date = "15"

            )

        }
    }
}

@Composable
fun NewsButton(
    text: String = "Hello",
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Purple80,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(size = 6.dp)
    )
    {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
        )
    }

}

@Composable
fun NewsTextButton(
    text: String = "Hello",
    onClick: () -> Unit
) {
    TextButton(onClick = onClick)
    {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
            color = WhiteGray
        )
    }

}


@Composable
fun CardForProfileReport(
    backgroundColor: Color = Color.White,
    title: String = "Water",
    unit: String = "Liters",
    value: String = "3.5",
    emoji: String = "💧",
    color: Color = OrangeStart
) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(140.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    )
    {

        Box(
            modifier = Modifier
                .height(200.dp)
                .background(backgroundColor)
                .padding(10.dp)
        ) {


            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .width(220.dp),

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween

            ) {
                Spacer(modifier = Modifier.weight(1f))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()


                ) {

                    Text(
                        text = title,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,


                        )

                    Text(
                        text = emoji,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {



                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 40.sp,
                                    color = color
                                )
                            )
                            {
                                append("${value} ")
                            }
                            append(unit)

                        },

                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold,

                        )


                }

            }
        }
    }

}

@Composable
fun TotalSteps(
    steps: String = "12,326"
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column {
            Text(
                text = "Total Steps",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = steps,
                    style = MaterialTheme.typography.displayLarge,
                    fontWeight = FontWeight.Bold,
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Box(
                        modifier = Modifier
                            .size(14.dp)
                            .clip(CircleShape)
                            .background(Purple80)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = "Steps",
                        style = MaterialTheme.typography.headlineSmall,
                    )
                }
            }

        }
        Column {

//            Row(
//                verticalAlignment = Alignment.CenterVertically
//
//            ) {
//                Box(modifier = Modifier
//                    .size(14.dp)
//                    .clip(CircleShape)
//                    .background(OrangeStart))
//                Spacer(modifier =Modifier.width(5.dp))
//                Text(
//                    text = "Run",
//                    style = MaterialTheme.typography.headlineSmall,
//                )
//            }
//            Row (
//                verticalAlignment = Alignment.CenterVertically
//            ){
//                Box(modifier = Modifier
//                    .size(14.dp)
//                    .clip(CircleShape)
//                    .background(Purple80))
//                Spacer(modifier =Modifier.width(5.dp))
//                Text(
//                    text = "Steps",
//                    style = MaterialTheme.typography.headlineSmall,
//                )
//            }
        }
    }
}

@Composable
fun WorkoutReport(
    backgroundColor: Color = Purple80,
    emoji: String = "🔥",
    title: String = "Calories Burn",
    value: String = "166"
) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(140.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    )
    {

        Box(
            modifier = Modifier
                .height(200.dp)
                .background(backgroundColor)
                .padding(10.dp)

        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp),
            ) {
                Spacer(modifier = Modifier.weight(1f))

                Row(
                    modifier = Modifier
                        .width(200.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Text(
                        text = emoji,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier
                            .background(
                                Color.White,
                                shape = CircleShape
                            )
                            .padding(8.dp)
                    )
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {

                        Text(
                            text = title,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = value,
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun GoalCompletedORPending(
    status: Color = GreenStart,
    icon: ImageVector = Icons.Default.DirectionsRun,
    goal: String = "Running goal completed",
    time: String = "3h 30 min | 3h 30 min"

) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    )
    {

        Box(
            modifier = Modifier
                .height(200.dp)
                .background(status)
                .padding(10.dp)
        ) {


            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

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
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()


                ) {

                    Text(
                        text = goal,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp,
                        color = Color.White


                    )

                    Text(
                        text = time,
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp,
                        color = Color.White

                    )
                }


            }
        }
    }

}