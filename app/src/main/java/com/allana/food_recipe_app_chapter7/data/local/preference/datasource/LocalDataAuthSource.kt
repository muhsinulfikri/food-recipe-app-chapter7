package com.allana.food_recipe_app_chapter7.data.local.preference.datasource

import com.allana.food_recipe_app_chapter7.data.network.model.response.auth.User

interface LocalDataAuthSource {
    fun getAuthToken(): String?
    fun setAuthToken(authToken: String?)
    fun isUserLoggedIn(): Boolean
    fun saveUserData(user: User)
    fun getUserData(): User?
    fun clearSession()
}