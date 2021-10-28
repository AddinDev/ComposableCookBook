package com.addindev.composablecookbook

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun RecipeCard(recipe: Recipe) {
    Text(recipe.title, style = TextStyle(color = Color.Red))
    for (ingredient in recipe.ingredients) {
        Text(ingredient)
    }
}