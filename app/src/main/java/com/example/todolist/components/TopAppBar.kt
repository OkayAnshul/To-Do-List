package com.example.todolist.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.todolist.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(title: String) {
    val navigationIcon: (@Composable (() -> Unit))? =
        if (!title.contains("T0D0 List", ignoreCase = true)) {
            {
                IconButton(onClick = { /* TODO: Add navigation action */ }) {
                    Icon(
                        imageVector = Icons.Sharp.ArrowBack,
                        contentDescription = null
                    )
                }
            }
        } else {
            null
        }

    TopAppBar(
        navigationIcon = {
            navigationIcon?.invoke()
        },
        title = {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = title,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .heightIn(max = 24.dp)
                    ,
                    color = Color.White
                )
            }
        },
        colors = TopAppBarDefaults.
        topAppBarColors(containerColor =
        colorResource(id = R.color.app_bar_color))
    )
}
