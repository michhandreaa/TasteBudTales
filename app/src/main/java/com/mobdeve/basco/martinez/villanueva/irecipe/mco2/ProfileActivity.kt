package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.profile_personal_page)

        // settings intent
        var settingsButton = findViewById<ImageButton>(R.id.profileSettings)
        settingsButton.setOnClickListener {
            startActivity(Intent(this, R.layout.profile_settings_view::class.java))
        }

        //edit button intent

        var editButton = findViewById<Button>(R.id.editButton)
        editButton.setOnClickListener{
            val intent2 = Intent(this, R.layout.profile_edit_personal::class.java)
            startActivity(intent2)

        }

        // 1st recipe intent
        var recipeImgIntent = findViewById<ImageView>(R.id.food_recipe1)
        recipeImgIntent.setOnClickListener{
            val intent3 = Intent(this, R.layout.recipe_view::class.java)
            startActivity(intent3)
        }

        /* Navigation Bar Intents */
        val homepageButton : ImageView = findViewById(R.id.homePageBtn)
        val searchButton : ImageView = findViewById(R.id.searchPageBtn)
        homepageButton.setOnClickListener{
            startActivity(Intent(this, HomepageActivity::class.java))
            finish()
        }

        searchButton.setOnClickListener {
            startActivity(Intent(this, SearchPageActivity::class.java))
        }

    }

}
