package com.example.rickandmorty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rickandmorty.screens.CharacterDetails
import com.example.rickandmorty.screens.ListAllCharacters
import com.example.rickandmorty.ui.theme.RickAndMortyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            RickAndMortyTheme {
                val controleDeNavegacao = rememberNavController()
                NavHost(
                    navController = controleDeNavegacao,
                    startDestination = ""
                ){
                    composable("listAllCharacters"){
                        ListAllCharacters(controleDeNavegacao)
                    }
                    composable("characterDetails"){
                        backStackEntry ->
                        val id = backStackEntry.arguments?.getString("id")
                        CharacterDetails(controleDeNavegacao, id)
                    }
                }
            }
        }
    }
}

