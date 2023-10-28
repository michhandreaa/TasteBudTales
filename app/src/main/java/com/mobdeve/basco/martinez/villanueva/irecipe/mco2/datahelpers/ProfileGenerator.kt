package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.datahelpers

import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.R
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.ProfileModel

class ProfileGenerator {
    companion object {
        fun loadProfile(): ArrayList<ProfileModel> {
            val profile = ArrayList<ProfileModel>()
            profile.add(ProfileModel(R.drawable.placeholder_juandelacruz, "Juan Dela Cruz"))
            profile.add(ProfileModel(R.drawable.placeholder_janedoe, "Jane Doe"))
            profile.add(ProfileModel(R.drawable.placeholder_mariadelacruz, "Maria Dela Cruz"))
            profile.add(ProfileModel(R.drawable.placeholder_johndoe, "John Doe"))
            return profile
        }
    }
}