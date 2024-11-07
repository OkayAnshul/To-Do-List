package com.example.todolist.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


class TodoViewModel:ViewModel() {

    val title= mutableStateOf("")
    val currentRoute by
        mutableStateOf(Screen.HomeScreen.route)

}