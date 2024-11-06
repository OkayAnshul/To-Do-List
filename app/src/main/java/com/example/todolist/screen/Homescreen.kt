package com.example.todolist.screen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.todolist.components.TopAppBar

@Composable
fun Homescreen() {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(title ="T0D0 List")
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription =null )
            }
        }
    ) { innerPadding ->
        // Apply the inner padding to your content container
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            // Your screen content goes here
            Text(text = "Hello, this is the main content.!")
        }
    }
}
