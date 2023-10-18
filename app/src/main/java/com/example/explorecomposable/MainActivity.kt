package com.example.explorecomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.explorecomposable.ui.theme.ExploreComposableTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploreComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Layar()
                }
            }
        }
    }
}

@Composable
fun Header() {
    Text(
        text = "WEATHER APP",
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
}

@Composable
fun FlexBox() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.LightGray)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight(Alignment.CenterVertically)
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            ) {
                Box (
                    modifier = Modifier
                        .size(120.dp)
                        .padding(16.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.DarkGray),
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentHeight(Alignment.CenterVertically)
                    ) {
                        Text(
                            text = "Humidity",
                            color = Color.White
                        )
                        Text(
                            text = "98%",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            color = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.padding(16.dp))

                Box (
                    modifier = Modifier
                        .size(120.dp)
                        .padding(16.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.DarkGray),
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentHeight(Alignment.CenterVertically)
                    ) {
                        Text(
                            text = "UV Index",
                            color = Color.White
                        )
                        Text(
                            text = "9 / 10",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            color = Color.White
                        )
                    }
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            ) {
                Box (
                    modifier = Modifier
                        .size(120.dp)
                        .padding(16.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.DarkGray),
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentHeight(Alignment.CenterVertically)
                    ) {
                        Text(
                            text = "Sunrise",
                            color = Color.White
                        )
                        Text(
                            text = "05.00 AM",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.padding(16.dp))

                Box (
                    modifier = Modifier
                        .size(120.dp)
                        .padding(16.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.DarkGray),
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentHeight(Alignment.CenterVertically)
                    ) {
                        Text(
                            text = "Sunset",
                            color = Color.White
                        )
                        Text(
                            text = "05.40 PM",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }

    }
}

@Composable
fun ImageSection () {
    Box(
        modifier = Modifier
            .size(300.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.LightGray)

    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .padding(16.dp)
            )

            Text(
                fontSize = 20.sp,
                text = "Rainy",
            )
        }
    }
}

@Composable
fun DescriptionSection () {
    Text(
        fontSize = 64.sp,
        text = "21C",
        fontWeight = FontWeight.Bold
    )

    Row {
        Image(
            painter = painterResource(id = R.drawable.baseline_room_24),
            contentDescription = null
        )

        Spacer(modifier = Modifier.padding(3.dp))

        Text(
            text = "Yogyakarta",
            fontSize = 30.sp
        )
    }

    Spacer(modifier = Modifier.padding(13.dp))

    Text(
        text = "Kasihan, Bantul, Daerah Istimewa Yogyakarta",
        fontSize = 20.sp,
        color = Color.Gray,
        textAlign = TextAlign.Center
    )
}

@Composable
fun Layar(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Header()

            Spacer(modifier = Modifier.padding(6.dp))

            ImageSection()

            Spacer(modifier = Modifier.padding(1.dp))

            DescriptionSection()

            Spacer(modifier = Modifier.padding(6.dp))

            FlexBox()
        }
    }
}


@Preview()
@Composable
fun GreetingPreview() {
    ExploreComposableTheme {
        Layar()
    }
}