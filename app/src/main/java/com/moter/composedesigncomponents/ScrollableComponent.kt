package com.moter.composedesigncomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TestScrollable() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Text(text = "Terms and Conditios", fontWeight = FontWeight.Bold, fontSize = 32.sp)
        Text(text = stringResource(id = R.string.lorem), fontSize = 22.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = stringResource(id = R.string.lorem), fontSize = 22.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = stringResource(id = R.string.lorem), fontSize = 22.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun TestScrollablePreview() {
    TestScrollable()
}