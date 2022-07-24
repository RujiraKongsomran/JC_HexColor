package com.rujirakongsomran.jc_hexcolor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.rujirakongsomran.jc_hexcolor.ui.theme.JC_HexColorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_HexColorTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}

@Composable
fun HexColorCode() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Biwberry",
            style = TextStyle(
                fontSize = MaterialTheme.typography.h4.fontSize,
                color = Color.White
            )
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    JC_HexColorTheme {
        HexColorCode()
    }
}