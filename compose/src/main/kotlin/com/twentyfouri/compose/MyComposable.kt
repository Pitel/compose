package com.twentyfouri.compose

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.twentyfouri.compose.theme.AppTheme

@Composable
fun MyComposable(padding: PaddingValues) {
    LazyColumn(
        Modifier
            .padding(8.dp)
            .border(1.dp, Color.White)
            .padding(8.dp)
            .border(2.dp, Color.Cyan)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(List(1000) { "Item $it" }) {
           Text(it)
        }
//        Text("Hello Compose", Modifier.padding(padding), MaterialTheme.colorScheme.primary)
//        Text("Hello Compose", Modifier.padding(padding), MaterialTheme.colorScheme.primary)
//        Text("Hello Compose", Modifier.padding(padding), MaterialTheme.colorScheme.primary)
//        Text("Hello Compose", Modifier.padding(padding), MaterialTheme.colorScheme.primary)
//        Text("Hello Compose", Modifier.padding(padding), MaterialTheme.colorScheme.primary)
//        Text("Hello Compose", Modifier.padding(padding), MaterialTheme.colorScheme.primary)
//        Text("Hello Compose", Modifier.padding(padding), MaterialTheme.colorScheme.primary)
//        Text("Hello Compose", Modifier.padding(padding), MaterialTheme.colorScheme.primary)
    }
}

@Preview
@Composable
fun PreviewMyComposable() {
    AppTheme {
        MyComposable(PaddingValues(4.dp))
    }
}