package com.mobdeve.bascomartinezvillanueva.tastebudtales

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.text.Editable
import android.text.TextWatcher
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.RecipeAdapter
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.SpoonacularServiceSingleton
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.UserDBHelper
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.SearchMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchPageActivity : AppCompatActivity() {

    private lateinit var viewBinding: SearchMainBinding
    private lateinit var recipeAdapter: RecipeAdapter // Add this line
    private lateinit var userDBHelper: UserDBHelper // Add this line
    private lateinit var searchBar: AutoCompleteTextView

    private val service: SpoonacularService by lazy {
        SpoonacularServiceSingleton.getService()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = SearchMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        searchBar = findViewById(R.id.input_search_bar)

        recipeAdapter = RecipeAdapter(ArrayList()) // Add this line
        viewBinding.recipesRecyclerView.layoutManager = LinearLayoutManager(this)
        viewBinding.recipesRecyclerView.adapter = recipeAdapter

        userDBHelper = UserDBHelper(this)

        searchBar.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // implementation

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // implementation
            }

            override fun afterTextChanged(s: Editable?) {
                // implementation
                val userInput = s.toString()
                if (userInput.isNotEmpty()) {
                    // Call your function with the user's input
                    searchRecipes(userInput)
                }
            }
        })


        viewBinding.homeBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        viewBinding.searchBtn.setOnClickListener {
            startActivity(Intent(this, SearchPageActivity::class.java))
        }

        viewBinding.profileBtn.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    private fun searchRecipes(userInput: String) {
        CoroutineScope(Dispatchers.Main).launch {
            try {
                val response = service.getRecipesByIngredients(
                    ingredients = userInput, 10, "ea3591ae88e543be9dca08f87a360caa"
                )

                if (response.isSuccessful) {
                    val recipes = response.body() ?: emptyList()
                    if (recipes.isNotEmpty()) {
                        Log.d("API_RESPONSE", "Recipes: $recipes")
                        recipeAdapter.updateRecipes(recipes)
                    } else {
                        Log.d("API_RESPONSE", "No recipes found")
                        recipeAdapter.updateRecipes(emptyList())
                    }
                } else {
                    val errorBody = response.errorBody()?.string()
                    Log.e("API_ERROR", "Search Response not successful. Error body: $errorBody")
                }
            } catch (e: Exception) {
                Log.e("API_ERROR", "Search Error: ${e.message}", e)
            }
        }
    }





}
