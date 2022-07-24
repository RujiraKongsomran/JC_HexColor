package com.rujirakongsomran.jc_hexcolor

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
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
                HexColorCode()
            }
        }
    }
}

@Composable
fun HexColorCode() {
    Column(
        modifier = Modifier
            .background(color = "#2596be".color)
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

val String.color
    get() = Color(parseColor(this))

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    JC_HexColorTheme {
        HexColorCode()
    }
}