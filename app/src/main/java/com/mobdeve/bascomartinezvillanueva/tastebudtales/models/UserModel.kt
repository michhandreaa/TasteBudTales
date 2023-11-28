package com.mobdeve.bascomartinezvillanueva.tastebudtales.models

// Definition of the UserModel class
// This class represents a user with various properties
class UserModel {
    // Properties of the UserModel class
    var bio: String? = null // User's biography or description
    var _id: String? = null // Identifier for the user
    var fullName: String? = null // User's full name
    var email: String? = null // User's email address
    var username: String? = null // User's username
    private var password: String? = "" // User's password (consider using more secure methods for real applications)
    var imageURI: String? = null // File path or URI to the user's image
    var likedRecipes: MutableList<String> = mutableListOf() // List of recipeIds that the user has liked

    // Constructor for creating instances of the class with full details
    constructor(
        fullName: String?,
        email: String?,
        username: String?,
        password: String?,
        _id: String?,
        imageURI: String?,
        bio: String?
    ) {
        this._id = _id
        this.fullName = fullName
        this.email = email
        this.username = username
        this.password = password
        this.imageURI = imageURI
        this.bio = bio
    }

    // Constructor for creating instances of the class with basic details (no password or image)
    constructor(fullName: String?, email: String?, username: String?, bio: String?) {
        this.fullName = fullName
        this.email = email
        this.username = username
        this.bio = bio
    }
}
