package com.mobdeve.bascomartinezvillanueva.tastebudtales
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.bascomartinezvillanueva.tastebudtales.HomeActivity
import com.mobdeve.bascomartinezvillanueva.tastebudtales.SearchPageActivity
import com.mobdeve.bascomartinezvillanueva.tastebudtales.SignInActivity
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.UserDBHelper
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.MainSigninBinding
import com.mobdeve.bascomartinezvillanueva.tastebudtales.models.UserModel
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.HomeHomepageBinding
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.ProfileUserPageBinding


class ProfileActivity : AppCompatActivity() {
    private lateinit var viewBinding: ProfileUserPageBinding
    private lateinit var userDBHelper: UserDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        userDBHelper = UserDBHelper(this)

        // Check if the user is logged in
        val loggedInUser: UserModel? = getUserFromDB()

        if (loggedInUser != null) {
            // User is logged in, inflate the profile_user_page layout
            viewBinding = ProfileUserPageBinding.inflate(layoutInflater)
            setContentView(viewBinding.root)
            viewBinding.profileUsername.text = loggedInUser.username
            viewBinding.profileName.text = loggedInUser.fullName
            viewBinding.profileEmail.text = loggedInUser.email
            viewBinding.profileBio.text = loggedInUser.bio


            viewBinding.homeBtn.setOnClickListener {
                startActivity(Intent(this, HomeActivity::class.java))
            }

            viewBinding.searchBtn.setOnClickListener {
                startActivity(Intent(this, SearchPageActivity::class.java))
            }

            viewBinding.profileBtn.setOnClickListener {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        } else {
            // User is not logged in redirects them back to login page
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }

    private fun getUserFromDB(): UserModel? {
        // Retrieve the currently logged-in user's username from SharedPreferences
        val sharedPreferences = getSharedPreferences("YourSharedPreferencesName", MODE_PRIVATE)
        val username = sharedPreferences.getString("username", null)

        // Check if the username is not null and then retrieve the user from the database
        if (!username.isNullOrEmpty()) {
            return userDBHelper.getUser(username)
        }

        return null
    }
}