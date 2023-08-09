package com.moter.composedesigncomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TestModifiers() {
    /* Order is important */
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .clickable { }
            .padding(20.dp)
    ) {
        Text(text = "Test Modifiers", color = Color.Red)
    }
}

@Preview
@Composable
fun TestModifierPreview() {
    TestModifiers()
}