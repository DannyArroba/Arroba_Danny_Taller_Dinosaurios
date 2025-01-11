package dev.danny.arroba_danny_taller.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreens(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta
                ),
                title = { Text("MAS DINOSAURIOS", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Go Back",
                            tint = Color.White
                        )
                    }
                }
            )
        }
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier.padding(paddingValues)
        ) {
            item { ItemContact("Tyrannosaurus Rex", "Carnivoro") }
            item { ItemContact("Triceratops", "Herbivoro") }
            item { ItemContact("Velociraptor", "Carnivoro") }
            item { ItemContact("Brachiosaurus", "Herbivoro") }
            item { ItemContact("Stegosaurus", "Herbivoro") }
            item { ItemContact("Ankylosaurus", "Herbivoro") }
            item { ItemContact("Spinosaurus", "Carnivoro") }
            item { ItemContact("Iguanodon", "Herbivoro") }
            item { ItemContact("Allosaurus", "Carnivoro") }
            item { ItemContact("Diplodocus", "Herbivoro") }
        }
    }
}