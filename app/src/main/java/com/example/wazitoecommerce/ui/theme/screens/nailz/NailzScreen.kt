package com.example.wazitoecommerce.ui.theme.screens.nailz

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL

@Composable
fun NailzScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.img_3),
            contentScale = ContentScale.FillBounds
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    )  {
        Text(text = "Nail Nailz", fontSize = 40.sp, fontWeight = FontWeight.Black,fontFamily = FontFamily.Serif)
        Text(text = "A free online platform for Producers and Nail stylists",
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(100.dp))
        Text(text = " Are You?", fontWeight = FontWeight.Bold, fontSize = 35.sp)

        Spacer(modifier = Modifier.height(35.dp))

            Row {

                    //card 1
                    Card (modifier = Modifier
                        .height(350.dp)
                        .width(150.dp)){

                  Column {
                      Box(modifier = Modifier.fillMaxWidth().height(200.dp),
                          contentAlignment = Alignment.Center )
                      {
                          Image(painter = painterResource(id = R.drawable.img_16)
                              , contentDescription ="", modifier = Modifier
                                  .fillMaxSize()
                              , contentScale = ContentScale.FillBounds )
                      }

                      Text(text = "Producer",
                          fontWeight = FontWeight.Bold, fontSize = 25.sp,
                          textAlign = TextAlign.Center,
                          fontStyle = FontStyle.Italic, color = Color.Black ,
                          modifier = Modifier
                              .fillMaxWidth()
                              .clickable {  navController.navigate(LOGIN_URL ) } )
                      Spacer(modifier = Modifier.height(10.dp))
                      Text(text = "Needing nail Products", fontSize = 20.sp,
                          textAlign = TextAlign.Center, color = Color.Black ,
                          modifier = Modifier
                              .fillMaxWidth())
                  }

                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = " or" , fontSize = 25.sp , modifier = Modifier.padding(top = 150.dp), color = Color.White)
                    Spacer(modifier = Modifier.width(10.dp))

                //card 2
                Card (modifier = Modifier
                    .height(350.dp)
                    .width(150.dp)){

                    Column {
                        Box(modifier = Modifier.fillMaxWidth().height(200.dp),
                            contentAlignment = Alignment.Center )
                        {
                            Image(painter = painterResource(id = R.drawable.img_18)
                                , contentDescription ="", modifier = Modifier
                                    .fillMaxSize()
                                , contentScale = ContentScale.FillBounds )
                        }

                        Text(text = "Nail Stylists or Customers",
                            fontWeight = FontWeight.Bold, fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            fontStyle = FontStyle.Italic, color = Color.Black ,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {  navController.navigate(VIEW_PRODUCTS_URL ) } )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Nail Stylists", fontSize = 20.sp,
                            textAlign = TextAlign.Center, color = Color.Black ,
                            modifier = Modifier
                                .fillMaxWidth())
                    }

                }

            }

    }

}
@Preview(showBackground = true)
@Composable
fun NailzScreenPreview(){
    NailzScreen(navController = rememberNavController())
}