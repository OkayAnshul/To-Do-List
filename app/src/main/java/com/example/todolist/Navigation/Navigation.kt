package com.example.todolist.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.todolist.Navigation.Screen
import com.example.todolist.Navigation.TodoViewModel
import com.example.todolist.components.TopAppBar
import com.example.todolist.screen.AddEditScreen
import com.example.todolist.screen.Homescreen

val FabColor = Color(0xFF64B5F6) // Medium blue for Floating Action Button

@Composable
fun Navigation(
    navController: NavHostController = rememberNavController(),
    viewModel: TodoViewModel= viewModel()
) {
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

// Update the ViewModel's state if needed


    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(title = currentRoute?:"T0D9 List",navController
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(Screen.Add_EditScreen.route) },
                containerColor = FabColor // Medium blue accent for the FAB
            ) {
                Icon(imageVector = Icons.Sharp.Add, contentDescription = null, tint = Color.White)
            }
        }
    ) { innerPadding ->
        NavHost(
            modifier = Modifier.padding(innerPadding),
            navController = navController,
            startDestination = Screen.HomeScreen.route
        ) {
            composable(Screen.HomeScreen.route) {
                Homescreen(navController)
            }
            composable(Screen.Add_EditScreen.route) {
                AddEditScreen(navController)
            }
        }
    }
}
