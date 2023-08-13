package com.moter.composedesigncomponents

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.moter.composedesigncomponents.ui.theme.ComposeDesignComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDesignComponentsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    TextBoxLayout()
//                    AbsoluteSize()
//                    TextComponent()
//                    TestImage()
//                    TestButton()
//                    ProfileLayout()
//                    LazyColumnList()
                    TestScrollable()
                    /* Toast Message Example*/
                    val context = LocalContext.current
                    Toast.makeText(context, "Toast Message Test", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
