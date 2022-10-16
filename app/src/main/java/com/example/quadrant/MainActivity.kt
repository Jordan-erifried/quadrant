package com.example.quadrant

import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun QuadrantWithContainer() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = stringResource(R.string.first_text),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp),
                )
                Text(
                    text = stringResource(R.string.subfirst_text),
                    fontSize = 15.sp,
                    //textAlign = TextAlign.Justify,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Yellow)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = stringResource(R.string.second_text),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp),
                )
                Text(
                    text = stringResource(R.string.subsecond_text),
                    fontSize = 15.sp,
                    //textAlign = TextAlign.Justify,
                )
            }
        }

        Row(Modifier.weight(1f)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Cyan)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = stringResource(R.string.third_text),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp),
                )
                Text(
                    text = stringResource(R.string.subthird_text),
                    fontSize = 15.sp,
                    //textAlign = TextAlign.Justify,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = stringResource(R.string.fourth_text),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp),
                )
                Text(
                    text = stringResource(R.string.subfouth_text),
                    fontSize = 15.sp,
                    //textAlign = TextAlign.Justify,
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        QuadrantWithContainer()
    }
}