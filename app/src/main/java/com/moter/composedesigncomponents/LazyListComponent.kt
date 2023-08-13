package com.moter.composedesigncomponents

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnList() {
    val names = listOf("Anna", "Bob", "Carol", "David")
    LazyColumn {
        item { Text(text = "Header of the list") }
        items(names) {
            Text(text = "User: $it", modifier = Modifier.height(100.dp))
            Divider(thickness = 1.dp)
        }
        items(10) { Text(text = "User number ${it + 1}", modifier = Modifier.height(100.dp)) }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyColumnListPreview() {
    LazyColumnList()
}
@Composable
fun LazyRowList() {
    val names = listOf("Anna", "Bob", "Carol", "David")
    LazyRow {
        item { Text(text = "Header of the list") }
        items(names) {
            Text(text = "User: $it", modifier = Modifier.height(100.dp))
            Divider(thickness = 1.dp)
        }
        items(10) { Text(text = "User number ${it + 1}", modifier = Modifier.height(100.dp)) }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyRowListPreview() {
    LazyRowList()
}