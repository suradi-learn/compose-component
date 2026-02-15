package com.suradi.composecomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Soal2View() {
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ){
        Row (
            Modifier.fillMaxHeight().weight(1f),
            verticalAlignment = Alignment.CenterVertically
            
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                    .fillMaxSize()
                    .background(
                        Color(0xFFEADDFF)
                    )
            ){
                Text("Text composable")
                Text("Displays text and follows the recommended Material Design guidelines.")
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                    .fillMaxSize()
                    .background(
                        Color(0xFFD0BCFF)
                    )
            ){
                Text("Image composable")
                Text("Creates a composable that lays out and draws a given Painter class object.")

            }
        }

        Row (
            Modifier.fillMaxHeight().weight(1f),
            verticalAlignment = Alignment.CenterVertically,

        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                    .fillMaxSize()
                    .background(
                        Color(0xFFB69DF8)
                    )

            ){
                Text("Row composable")
                Text("A layout composable that places its children in a horizontal sequence.")

            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                    .fillMaxSize()
                    .background(
                        Color(0xFFF6EDFF)
                    )
            ) {
                Text("Column composable")
                Text("A layout composable that places its children in a vertical sequence.")

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal2Preview() {
    Soal2View()
}