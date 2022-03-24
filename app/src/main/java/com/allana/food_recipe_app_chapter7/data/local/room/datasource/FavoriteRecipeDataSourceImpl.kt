package com.allana.food_recipe_app_chapter7.data.local.room.datasource

import com.allana.food_recipe_app_chapter7.data.local.room.dao.FavoriteRecipeDao
import com.allana.food_recipe_app_chapter7.data.local.room.entity.FavoriteRecipe

class FavoriteRecipeDataSourceImpl(private val dao: FavoriteRecipeDao) : FavoriteRecipeDataSource {
    override suspend fun insertFavoriteRecipe(favRecipe: FavoriteRecipe): Int {
        return dao.insertFavoriteRecipe(favRecipe)
    }

    override suspend fun deleteFavoriteRecipe(favRecipe: FavoriteRecipe): Int {
        return dao.deleteFavoriteRecipe(favRecipe)
    }

}