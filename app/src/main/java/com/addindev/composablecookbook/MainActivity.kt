package com.addindev.composablecookbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.addindev.composablecookbook.ui.theme.ComposableCookBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

data class Recipe(
    @DrawableRes val imageResource: Int,
    val title: String,
    val ingredients: List<String>
)

val defaultRecipes = listOf(
    Recipe(R.drawable.noodles, "Ramen", listOf("Noodles", "Eggs", "Mushrooms", "Carrots", "Soy Sauce")),
    Recipe(R.drawable.croissant, "Croissant", listOf("Butter", "More Butter", "A touch of Butter", "Flour")),
    Recipe(R.drawable.pizza, "Pizza", listOf("Pizza Dough", "Tomatoes", "Cheese", "Spinach", "Love")),
    Recipe(R.drawable.produce, "Vegetable Medley", listOf("Vegetables")),
    Recipe(R.drawable.salad_egg, "Egg Salad", listOf("Eggs", "Mayonnaise", "Paprika", "Mustard")),
    Recipe(R.drawable.smoothie, "Fruit Smoothie", listOf("Banana", "Kiwi", "Milk", "Cream", "Ice", "Flax seed"))
)

@Composable
fun Content() {
    Column {
        for (recipe in defaultRecipes) {
            RecipeCard(recipe = recipe)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Content()
}