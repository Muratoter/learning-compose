package com.moter.composedesigncomponents.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TestColumnLayout() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier
                .background(Color.Red)
                .width(100.dp)
                .height(50.dp)
        ) {}
        Row(
            modifier = Modifier
                .background(Color.Blue)
                .width(100.dp)
                .height(50.dp)
        ) {}
        Row(
            modifier = Modifier
                .background(Color.Green)
                .width(100.dp)
                .height(50.dp)
        ) {}
    }
}

@Composable
fun TextBoxLayout() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize().background(Color.Green)
    ) {
        Text(text = "A bunch of text\non multiple lines\n data loading")
        CircularProgressIndicator()
    }
}

@Preview(showBackground = true)
@Composable
fun TestLayoutPreview() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        TestColumnLayout()
    }
}

@Preview(showBackground = true)
@Composable
fun TestBoxLayoutPreview() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        TextBoxLayout()
    }
}