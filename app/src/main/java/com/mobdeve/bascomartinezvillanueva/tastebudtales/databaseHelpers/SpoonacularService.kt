package com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers

import com.mobdeve.bascomartinezvillanueva.tastebudtales.SpoonacularService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SpoonacularServiceSingleton {
    private var instance: SpoonacularService? = null

    fun getService(): SpoonacularService {
        if (instance == null) {
            instance = Retrofit.Builder()
                .baseUrl("https://api.spoonacular.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(SpoonacularService::class.java)
        }
        return instance!!
    }
}
