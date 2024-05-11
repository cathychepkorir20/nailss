package com.example.wazitoecommerce.ui.theme.screens.pay

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.Zpurple

@Composable
fun PayScreen(navController: NavController){
    val mContext = LocalContext.current
   Row (modifier = Modifier.background(Zpurple)){
       Button(onClick = {  val simToolKitLaunchIntent =
           mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
           simToolKitLaunchIntent?.let { mContext.startActivity(it) }}) {
           Text(text = "Mpesa")
       }
       Spacer(modifier = Modifier.width(2.dp))

       Button(onClick = { /*TODO*/ }) {
           Text(text = "Credit card")
       }
   }
}

@Composable
@Preview(showBackground = true)
fun PayScreenPreview() {
    com.example.wazitoecommerce.ui.theme.screens.pay.PayScreen(navController = rememberNavController()  )

}