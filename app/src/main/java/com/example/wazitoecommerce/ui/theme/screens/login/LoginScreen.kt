package com.example.wazitoecommerce.ui.theme.screens.login

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.data.AuthViewModel
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.ui.theme.Pink40
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
import com.example.wazitoecommerce.ui.theme.Zpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController:NavHostController) {
    val mContext = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.img_3),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {


        Text(
            text = "Welcome to Nail Nailz",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center

        )
        Spacer(modifier = Modifier.height(15.dp))
        Spacer(modifier = Modifier.height(15.dp))





        Button(
            onClick = { mContext.startActivity(Intent(mContext
                , LOGIN_URL::class.java)) },
            colors = ButtonDefaults.buttonColors(Zpurple),
            modifier = Modifier.padding(top = 100.dp)
        ) {
            Text(
                text = "Login Here",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Cursive,

                )
        }

        Spacer(modifier = Modifier.height(30.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter email") },
            leadingIcon = {

                Icon(imageVector = Icons.Default.Email,
                    contentDescription = "email")
            }, keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            modifier = Modifier.fillMaxWidth().padding(10.dp,
                end = 10.dp),
            shape = RoundedCornerShape(20.dp)

        )

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Enter password") },

            leadingIcon = {

                Icon(imageVector = Icons.Default.Lock, contentDescription = "Password")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            modifier = Modifier.fillMaxWidth().padding(10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp)


        )

        Spacer(modifier = Modifier.height(35.dp))
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(
            onClick = { authViewModel.login(email, password) },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp)


        )
        {
            Text(text = "Login Here", fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { navController.navigate(SIGNUP_URL) },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp)
        )
        {
            Text(text = "Register NOW", fontWeight = FontWeight.Bold,)
        }
    }
}





@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    WazitoECommerceTheme {
        LoginScreen(navController = rememberNavController())
    }
}