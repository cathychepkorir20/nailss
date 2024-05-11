package com.example.wazitoecommerce.ui.theme.screens.test



import android.annotation.SuppressLint
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },



            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .paint(
                            painterResource(id = R.drawable.img_3),
                            contentScale = ContentScale.FillBounds
                        ) ,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
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
                            .height(340.dp)
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
                            .height(340.dp)
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

        )

    }
}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Report",
        route="report",
        selectedIcon=Icons.Filled.CheckCircle,
        unselectedIcon=Icons.Outlined.CheckCircle,
        hasNews = true,
        badges=5
    ),




    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun TestScreenPreview(){
    WazitoECommerceTheme {
        TestScreen(navController = rememberNavController())
    }
}