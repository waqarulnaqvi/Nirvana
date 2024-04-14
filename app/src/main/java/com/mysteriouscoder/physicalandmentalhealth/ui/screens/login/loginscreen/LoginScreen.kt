package com.mysteriouscoder.physicalandmentalhealth.ui.screens.login.loginscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.App_icon_component
import com.mysteriouscoder.physicalandmentalhealth.PasswordInput
import com.mysteriouscoder.physicalandmentalhealth.UserInputField
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems

@Composable
fun Login(navHostController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(GreyBg)
//                Brush.verticalGradient(
//                    colors = listOf(
//                        MaterialTheme.colorScheme.primary.copy(alpha = .9f),
//                        MaterialTheme.colorScheme.primary.copy(alpha = .1f)
//
//                    )
//                )
//            )
    ) {
        Spacer(modifier = Modifier.height(120.dp))

         App_icon_component()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Nirvana",
            style = MaterialTheme.typography.headlineMedium,
            fontFamily = FontFamily.Serif,
//            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(30.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        UserInputField(
            onValueChange = {email=it},
            value = email
        )
        PasswordInput(
            label = "Password",
            icon = Icons.Default.Lock,
            isfocused = false,
            onValueChange = {password=it},
            value = password
        )

        Button(
            onClick = {


                      },
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp, 0.dp)
                .padding(top = 22.dp)
                .height(56.dp),
            colors = ButtonDefaults
                .buttonColors(
                    containerColor =
                    if (isSystemInDarkTheme()) Purple40 else Purple80,
                    contentColor = Color.White
                )

                ) {
            Text(
                text = "Sign In",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

        }

        Spacer(modifier =Modifier.weight(1f) )
        Row {
            Text(
                text = "Don't have an account?",
                fontWeight = FontWeight.Medium,
                color=MaterialTheme.colorScheme.onSurface.copy(alpha=.8f))


            Text(
                text = "Sign Up",
                modifier = Modifier
                    .padding(start = 3.dp)
                    .clickable {
                        navHostController.navigate(Navigationitems.acountCreateScreen.route)

                    },
                fontWeight = FontWeight.Bold,
                color =  if (isSystemInDarkTheme()) Purple40 else Purple80

            )


        }
        Spacer(modifier = Modifier.height(60.dp))

    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenprev() {

        Login(rememberNavController())



}
