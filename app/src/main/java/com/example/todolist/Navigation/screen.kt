package com.example.todolist.Navigation

sealed class Screen(val route:String){
    object HomeScreen: Screen("home_screen")
    object Add_EditScreen: Screen("addEdit_screen")
}