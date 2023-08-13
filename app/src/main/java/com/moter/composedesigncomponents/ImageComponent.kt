package com.moter.composedesigncomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest


/*
* Bundled Images: Stored inside our application
* Vector Images: Created in Android Studio, they also bundled images
* Online Image Resources: Stored on a URL that we can download
* */
@Composable
fun TestImage() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            val imgResource = painterResource(id = R.drawable.yumos)
            Image(
                painter = imgResource,
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
        }

        val iconRes = painterResource(id = R.drawable.ic_smile)
        Image(
            painter = iconRes,
            contentDescription = null,
            colorFilter = ColorFilter.tint(Color.Cyan)
        )

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://tr.wikipedia.org/wiki/Katmandu#/media/Dosya:Kathmandu_Durbar_Square,_Maju_Dega_2,_Nepal.jpg")
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.ic_smile),
            contentDescription = null,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TestImagePreview() {
    TestImage()
}