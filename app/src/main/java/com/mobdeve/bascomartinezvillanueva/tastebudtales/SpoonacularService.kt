package com.mobdeve.bascomartinezvillanueva.tastebudtales

import com.mobdeve.bascomartinezvillanueva.tastebudtales.models.Recipe
import com.mobdeve.bascomartinezvillanueva.tastebudtales.models.Root
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SpoonacularService {
    @GET("recipes/random")
    suspend fun getRandomRecipes(
        @Query("tags") tags: String,
        @Query("number") number: Int,
        @Query("apiKey") apiKey: String,
    ): Response<Root>

    @GET("recipes/complexSearch")
    suspend fun getRecipes(
        @Query("query") query: String?,
        @Query("type") type: String,
        @Query("offset") offset: Int,
        @Query("number") number: Int,
        @Query("apiKey") apiKey: String,
    ): Response<Root>

    @GET("recipes/findByIngredients")
    suspend fun getRecipesByIngredients(
        @Query("ingredients") ingredients: String,
        @Query("number") number: Int,
        @Query("apiKey") apiKey: String
    ): Response<List<Recipe>>

}
