package mx.edu.itson.pokecompose_miramontesdaniel.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.edu.itson.pokecompose_miramontesdaniel.ui.screens.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable(Routes.LOGIN_SCREEN) {
            LoginScreen( {
                navController.navigate(Routes.POKEMON_LIST_SCREEN)
            })
            composable(Routes.POKEMON_LIST_SCREEN) { "Pokedex" }
        }
    }
}

object Routes {
    const val LOGIN_SCREEN = "login"

    const val POKEMON_LIST_SCREEN = "list"

    const val POKEMON_DETAIL = "detail"
}