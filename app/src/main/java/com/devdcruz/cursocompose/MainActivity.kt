package com.devdcruz.cursocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devdcruz.cursocompose.ui.theme.CursoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CursoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyColumn()
                }
            }
        }
    }
}

@Composable
fun MyColumn() {
    Column(modifier = Modifier.fillMaxSize()) {
        MySpacerVertical(size = 5)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }
        MySpacerVertical(size = 5)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            MySpacerHorizontal(size = 5)
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Red), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }

            MySpacerHorizontal(size = 5)

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Green), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
            MySpacerHorizontal(size = 5)
        }

        MySpacerVertical(size = 5)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
        MySpacerVertical(size = 5)
    }

}

@Composable
fun MySpacerVertical(size : Int) {
    Spacer(modifier = Modifier
        .height(size.dp)
        .background(Color.Black))
}

@Composable
fun MySpacerHorizontal(size : Int) {
    Spacer(modifier = Modifier
        .width(size.dp)
        .background(color = Color.Black))
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoComposeTheme {
        MyColumn()
    }
}