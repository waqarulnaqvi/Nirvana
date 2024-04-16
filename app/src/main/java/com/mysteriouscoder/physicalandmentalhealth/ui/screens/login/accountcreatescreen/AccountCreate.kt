package com.mysteriouscoder.physicalandmentalhealth.ui.screens.login.accountcreatescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.physicalandmentalhealth.PasswordInput
import com.mysteriouscoder.physicalandmentalhealth.RoundedButton
import com.mysteriouscoder.physicalandmentalhealth.UserInputField
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.GreyBg
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple40
import com.mysteriouscoder.physicalandmentalhealth.ui.theme.Purple80
import com.syedwaqarul.tipcalculator.Navigation.Navigationitems
import androidx.compose.material3.Icon as Icon1

//@Preview(showSystemUi = true)
@Composable
//fun AccountCreate() {
fun AccountCreate(navHostController: NavHostController) {


    LazyColumn (
        modifier = Modifier
            .background(GreyBg)
    ){

        item {
            Icon1(
                imageVector = Icons.Default.ArrowDownward,
                contentDescription = "Back Button",
                modifier = Modifier
                    .rotate(90f)
                    .padding(30.dp)
                    .clickable {
                        navHostController.navigate(Navigationitems.LoginScreen.route)

                    }
            )
        }

        item {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = "Let's Get Started!",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.SansSerif,
                    modifier = Modifier.run { padding(bottom = 5.dp) }
                )

                Text(
                    text = "Create an account on Nirvana",
                    fontWeight = FontWeight.Medium,
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 25.dp),
                    fontSize = 14.sp

                )

                var name by remember { mutableStateOf("") }
                var email by remember { mutableStateOf("") }
                var phoneNumber by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }
                var confirmpassword by remember { mutableStateOf("") }

                UserInputField(
                    label = "Name",
                    icon = Icons.Default.AccountCircle,
                    onValueChange = {name=it},
                    value = name
                )

                UserInputField(
                    onValueChange = {email=it},
                    value = email
                )

                UserInputField(
                    label = "Phone",
                    icon = Icons.Default.PhoneAndroid,
                    onValueChange = {phoneNumber=it},
                    value = phoneNumber

                )

                PasswordInput(
                    label = "Password",
                    icon = Icons.Default.Lock,
                    onValueChange = {password=it},
                    value = password
                )

                PasswordInput(
                    label = "Confirm Password",
                    icon = Icons.Default.Lock,
                    onValueChange = {confirmpassword=it},
                    value = confirmpassword
                )

                RoundedButton(text = "Create")

                Row(
                    modifier = Modifier.padding(top = 25.dp)
                ) {
                    Text(
                        text = "Already have an account?",
                        fontWeight = FontWeight.Medium,
                    )

                    Text(
                        modifier = Modifier
                            .padding(start = 3.dp)

                            .clickable {
                                navHostController.navigate(Navigationitems.LoginScreen.route)

                            },
                        text = "Login here",
                        fontWeight = FontWeight.Bold,
                        color =  if (isSystemInDarkTheme()) Purple40 else Purple80,

                        )
                }
                Spacer(modifier = Modifier.height(60.dp))
            }
        }
    }

}



@Preview(showSystemUi = true)
@Composable
fun AccountCreatePreview() {
    AccountCreate(rememberNavController())

}