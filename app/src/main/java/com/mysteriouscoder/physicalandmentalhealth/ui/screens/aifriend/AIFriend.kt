package com.mysteriouscoder.physicalandmentalhealth.ui.screens.aifriend

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mysteriouscoder.physicalandmentalhealth.R
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.PhysicalAndMentalHealthTheme

@Composable
fun AiFriend() {
   Column(
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(GreyBg)
            .padding(10.dp)
//            .padding(bottom = 14.dp)
    )
    {
//        var userinput by remember { mutableStateOf("") }


            Spacer(modifier = Modifier.height(280.dp))

            Image(
                painter = painterResource(id = R.drawable.ai_friend_icon_selected),
                contentDescription = "AI friend",
                modifier = Modifier.size(64.dp),
//                                    tint =  if (selectedItemIndex==index) Color.Black else Color.White

            )
            Spacer(modifier = Modifier.height(310.dp))


            Row(
                modifier = Modifier.fillMaxWidth()
                ,
//                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                var usermessage by remember { mutableStateOf("") }


                OutlinedTextField(
                    value = usermessage,
                    onValueChange = { usermessage = it },
                    singleLine = true,
                    modifier = Modifier
                        .weight(1f)
//                        .background(color = GreyBg)
//                .border(2.dp, Color.Transparent, RoundedCornerShape(8.dp))
                ,

//                    .fillMaxWidth()
//                .border(2.dp, Color.Yellow, RoundedCornerShape(18.dp)),
                    shape = MaterialTheme.shapes.extraLarge,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Text
                    ),
                    placeholder = { /* Hint text displayed when the text field is empty */
                        Text("Message",
                            fontSize = 14.sp)

                    },
                    trailingIcon = {

                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Enter",

                            tint = Color.White,
                            modifier = Modifier
                                .background(
                                    Color.Black,
                                    shape = CircleShape
                                )
                                .rotate(90F)
                                .padding(4.dp)

                        )
                    },

//                    colors = OutlinedTextFieldDefaults.outlinedTextFieldColors(
//                        textColor = Color.Black,
//                        placeholderColor = MaterialTheme.colorScheme.primary,
//                        cursorColor = MaterialTheme.colorScheme.primary
//                    )
                )
//                placeholder = { Text("Enter your text here") },

                Spacer(modifier = Modifier.width(6.dp))

                Icon(
                    painter = painterResource(id = R.drawable.baseline_headphones_24),
                    contentDescription = "AI friend",
                    tint = Color.White,
                    modifier = Modifier
                        .background(
                            Color.Black,
                            shape = CircleShape
                        )
                        .padding(4.dp)



                )


        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun AI_friendPreview() {
    PhysicalAndMentalHealthTheme {
       AiFriend()
    }

}

//10 4