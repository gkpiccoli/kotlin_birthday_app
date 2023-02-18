package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    BirthdayGreetingWithImage(message = getString(R.string.happy_birthday_text), from = getString(
                        R.string.signature_text))
                }
            }
        }
    }
}
@Composable
fun BirthDayGreetingWithText(message: String, from: String){
    Column{
        Text(text = message, fontSize = 32.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 26.dp, top = 26.dp, end = 24.dp)

                )

        Text(text = from, fontSize = 24.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(start = 26.dp, top = 5.dp, end = 26.dp)
        )

    }
}
@Composable
fun BirthdayGreetingWithImage(message: String, from: String){
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )
        BirthDayGreetingWithText(message = message, from = from)
    }
}
@Preview(showBackground = false)
@Composable
fun BirthDayGreetingWithTextPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Gustavo!", from = "- from Android.")

    }
}