package com.example.wazitoecommerce.ui.theme.screens.report

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

@Composable
fun ReportScreen(navController: NavController){
    val mContext = LocalContext.current
   Column  (modifier = Modifier
       .fillMaxSize()
       .background(color = Color.Magenta),

    horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center
      ) {

       Text(text = "Track Your Monthly Report",
           fontSize = 30.sp,
           modifier = Modifier.fillMaxWidth(),
           textAlign = TextAlign.Center)
       Spacer(modifier = Modifier.height(100.dp))


       Spacer(modifier = Modifier.height(30.dp))


       Column {
           Row {
               Box(
                   modifier = Modifier
                       .height(200.dp)
                       .width(150.dp)
                       .background(color = Color.DarkGray),
                   contentAlignment = Alignment.Center
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.img_22),
                       contentDescription = "",
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(100.dp)
                           .width(100.dp)
                   )

                   Text(text = "Producers", color = Color.White)

               }



               Spacer(modifier = Modifier.width(2.dp))
               Box(
                   modifier = Modifier
                       .height(200.dp)
                       .width(150.dp)
                       .background(color = Color.DarkGray),
                   contentAlignment = Alignment.Center
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.img_21),
                       contentDescription = "",
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(100.dp)
                           .width(100.dp)
                   )
                   Text(text = "Products", color = Color.White)
               }
           }



       }

       Spacer(modifier = Modifier.height(2.dp))

       Row {
           Box(
               modifier = Modifier
                   .height(200.dp)
                   .width(150.dp)
                   .background(color = Color.DarkGray),
               contentAlignment = Alignment.Center
           ) {
               Image(
                   painter = painterResource(id = R.drawable.img_19),
                   contentDescription = "",
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(100.dp)
                       .width(100.dp)
               )
               Text(text = "Clients", color = Color.White)
           }

           Spacer(modifier = Modifier.width(2.dp))
           Box(
               modifier = Modifier
                   .height(200.dp)
                   .width(150.dp)
                   .background(color = Color.DarkGray),
               contentAlignment = Alignment.Center
           ) {
               Image(
                   painter = painterResource(id = R.drawable.img_20),
                   contentDescription = "",
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(100.dp)
                       .width(100.dp)
               )
               Text(text = "Revenue", color = Color.White)
           }
       }
       }


       }









@Preview(showBackground = true)
@Composable
fun ReportScreenPreview(){
    ReportScreen(navController = rememberNavController())
}