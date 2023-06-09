package com.pedro.singleactivity

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "first_screen"
    ) {

        composable(route = "first_screen") {
            FirstScreen(
                onClick = {
                    navController.navigate(route = "second_screen")
                }
            )
        }

        composable(route = "second_screen") {
            SecondScreen(
                onClick = {
                    navController.navigate(route = "first_screen")
                }
            )
        }
    }
}