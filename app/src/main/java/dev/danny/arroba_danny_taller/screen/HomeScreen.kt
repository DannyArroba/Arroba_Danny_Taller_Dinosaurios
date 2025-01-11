package dev.danny.arroba_danny_taller.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreens(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Green,
                onClick = { navController.navigate("add") }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Go to Add Screen",
                    tint = Color.White
                )
            }
        },
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Green
                ),
                title = { Text("HOME", color = Color.White) }
            )
        }
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier.padding(paddingValues)
        ) {
            item { ItemContact("Carnotaurus", "Carnivoro") }
            item { ItemContact("Parasaurolophus", "Herbivoro") }
            item { ItemContact("Pachycephalosaurus", "Herbivoro") }
            item { ItemContact("Gigantosaurus", "Carnivoro") }
            item { ItemContact("Corythosaurus", "Herbivoro") }
            item { ItemContact("Therizinosaurus", "Herbivoro") }
            item { ItemContact("Compsognathus", "Carnivoro") }
            item { ItemContact("Edmontosaurus", "Herbivoro") }
            item { ItemContact("Kentrosaurus", "Herbivoro") }
            item { ItemContact("Deinonychus", "Carnivoro") }
        }
    }
}