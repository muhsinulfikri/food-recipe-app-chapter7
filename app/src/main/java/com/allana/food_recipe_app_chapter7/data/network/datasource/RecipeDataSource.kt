package com.allana.food_recipe_app_chapter7.data.network.datasource

import com.allana.food_recipe_app_chapter7.data.model.Recipe

interface RecipeDataSource {
    suspend fun getAllRecipes(): List<Recipe>
}