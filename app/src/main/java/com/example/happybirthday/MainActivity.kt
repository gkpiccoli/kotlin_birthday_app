package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                BirthDayGreetingWithText(message = "Happy Birthday Gustavo!", from = "-from Paminha")
                }
            }
        }
    }
}


@Composable
fun BirthDayGreetingWithText(message: String, from: String){
Text(text = message, fontSize = 26.sp)
    Text(text = from, fontSize = 14.sp)
}


@Preview(showBackground = true)
@Composable
fun BirthDayGreetingWithTextPreview() {
    HappyBirthdayTheme {
        BirthDayGreetingWithText(message = "Happy Birthday Gustavo!", from = "-from Paminha")
    }
}