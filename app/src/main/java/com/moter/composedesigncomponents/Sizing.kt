package com.moter.composedesigncomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
* dp/dip -> Density independent pixels
* sp/sip -> Size independent pixels
* px -> physical screen pixels
* in -> inches
* mm -> millimeters
* */

/* Absolute size */
@Composable
fun AbsoluteSize() {
    Row(modifier = Modifier.background(Color(0xFF92CBF8))) {
        Column(
            modifier = Modifier
                .width(200.dp)
                .height(100.dp)
                .background(Color.Blue)
        ) {

        }
    }
}

@Preview
@Composable
fun AbsoluteSizingPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        AbsoluteSize()
    }
}

/* Relative to size of parent */
@Composable
fun RelativeSize() {
    Row(modifier = Modifier.background(Color(0xFFFFC107))) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .aspectRatio(1f)
                .background(Color(0xFFE91E63))
        )
        {
        }
    }
}


@Preview
@Composable
fun RelativeSizingPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        RelativeSize()
    }
}

/* Relative to siblings */
@Composable
fun RelativeSiblingsSize() {
    Row(modifier = Modifier.background(Color(0xFFAA7FF8))) {
        Column(
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
                .background(Color.Blue)
        ) {
        }

        Column(
            modifier = Modifier
                .weight(2f)
                .height(100.dp)
                .background(Color.Red)
        ) {
        }
    }

}

@Preview
@Composable
fun RelativeSiblingsSizePreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        RelativeSiblingsSize()
    }
}

/* Spacer */
@Composable
fun SpacerSizing() {
    Row(modifier = Modifier.background(Color(0xFF30F8E6))) {
        Column(
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(Color.Blue)
        ) {
        }
        Spacer(modifier = Modifier.width(50.dp))
        Column(
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(Color.Blue)
        ) {
        }
        Spacer(modifier = Modifier.width(50.dp))

        Text(text = "Sample Text", fontSize = 20.sp)
    }
}

@Preview
@Composable
fun SpacerSizingPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        SpacerSizing()
    }
}
