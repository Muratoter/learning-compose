package com.moter.composedesigncomponents.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.moter.composedesigncomponents.R


@Composable
fun ProfileLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFC7C4C4))
            .padding(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .height(100.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "120", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(text = "Posts", fontSize = 13.sp)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "120", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(text = "Followers", fontSize = 13.sp)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "120", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(text = "Following", fontSize = 13.sp)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column {
            Text(text = "Catalin", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }

    }
}

@Preview
@Composable
fun ProfileLayoutPreview() {
    ProfileLayout()
}