package com.moter.composedesigncomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TextComponent() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "A Simple text component")
        Text(text = stringResource(id = R.string.greeting_text))
        Text(text = "Formatted Text", color = Color.Red, fontSize = 25.sp)

        val name = remember { mutableStateOf("") }
        TextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text(text = "Name Field") },
            placeholder = { Text(text = "Murat") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(50.dp))
        val surname = remember { mutableStateOf("") }
        OutlinedTextField(
            value = surname.value, onValueChange = { surname.value = it },
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextComponentPreview() {
    TextComponent()
}