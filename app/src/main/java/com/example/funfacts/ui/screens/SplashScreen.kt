package com.example.funfacts.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.funfacts.R

@Composable
fun SampleSplashScreen(){
    Surface(modifier = Modifier.fillMaxSize(),
    ) {
        Image(painter = painterResource(id = R.drawable.bird),
            contentDescription = "Bird Image",
            modifier = Modifier.size(18.dp),
        )
    }


}

@Preview(showBackground = true)
@Composable
fun SampleSplashScreenPreview(){
    SampleSplashScreen()
}