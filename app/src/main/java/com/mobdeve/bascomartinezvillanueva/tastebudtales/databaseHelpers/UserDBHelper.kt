package com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.net.Uri
import android.util.Log
import com.mobdeve.bascomartinezvillanueva.tastebudtales.models.UserModel

class UserDBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "taste_bud_tales.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_USERS = "users"
        private const val COLUMN_ID = "_id"
        private const val COLUMN_FULLNAME = "fullname"
        private const val COLUMN_EMAIL = "email"
        private const val COLUMN_USERNAME = "username"
        private const val COLUMN_PASSWORD = "password"
        private const val COLUMN_BIO = "bio"
        private const val COLUMN_IMAGE_ID = "imageID"
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Create the user table
        val createUserTableQuery = "CREATE TABLE $TABLE_USERS (" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_FULLNAME TEXT, " +
                "$COLUMN_EMAIL TEXT, " +
                "$COLUMN_USERNAME TEXT, " +
                "$COLUMN_PASSWORD TEXT, " +
                "$COLUMN_BIO TEXT, " +
                "$COLUMN_IMAGE_ID TEXT)"

        db.execSQL(createUserTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Handle database upgrade here if needed
        // For simplicity, drop and recreate the table; in a real application, you would handle migrations
        db.execSQL("DROP TABLE IF EXISTS $TABLE_USERS")
        onCreate(db)
    }

    fun doesUserExist(username: String): Boolean {
        val db = readableDatabase
        val query = "SELECT * FROM $TABLE_USERS WHERE $COLUMN_USERNAME = ?"
        val cursor: Cursor = db.rawQuery(query, arrayOf(username))
        val exists = cursor.count > 0
        cursor.close()
        return exists
    }

    fun addUser(fullName: String, email: String, username: String, password: String?) {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_FULLNAME, fullName)
            put(COLUMN_EMAIL, email)
            put(COLUMN_USERNAME, username)
            put(COLUMN_PASSWORD, password)
        }

        val userId = db.insert(TABLE_USERS, null, values)

        if (userId != -1L) {
            Log.d("TAG", "User added successfully with ID: $userId")
        } else {
            Log.w("TAG", "Error adding user")
        }
    }

    fun isValidUser(username: String, password: String): Boolean {
        val db = readableDatabase
        val query = "SELECT * FROM $TABLE_USERS WHERE $COLUMN_USERNAME = ? AND $COLUMN_PASSWORD = ?"
        val cursor: Cursor = db.rawQuery(query, arrayOf(username, password))
        val isValid = cursor.count > 0
        cursor.close()
        return isValid
    }

    fun getUser(username: String?): UserModel? {
        val db = readableDatabase
        val query = "SELECT * FROM $TABLE_USERS WHERE $COLUMN_USERNAME = ?"
        val cursor: Cursor = db.rawQuery(query, arrayOf(username))

        if (cursor.moveToFirst()) {
            val fullNameIndex = cursor.getColumnIndex(COLUMN_FULLNAME)
            val usernameIndex = cursor.getColumnIndex(COLUMN_USERNAME)
            val emailIndex = cursor.getColumnIndex(COLUMN_EMAIL)
            val bioIndex = cursor.getColumnIndex(COLUMN_BIO)
            val imageIdIndex = cursor.getColumnIndex(COLUMN_IMAGE_ID)

            // Check if each column index is valid before retrieving values
            if (fullNameIndex >= 0 && usernameIndex >= 0 && emailIndex >= 0
                && bioIndex >= 0 && imageIdIndex >= 0) {

                // Use the cursor.getString(columnIndex) function to retrieve values
                val fullName = cursor.getString(fullNameIndex)
                val email = cursor.getString(emailIndex)
                val userUsername = cursor.getString(usernameIndex)
                val bio = cursor.getString(bioIndex)
                val imageId = cursor.getString(imageIdIndex)

                // Create a UserModel instance with retrieved values
                val user = UserModel(fullName, email, userUsername, null, null, imageId, bio)

                cursor.close()
                return user
            }
        }

        cursor.close()
        return null
    }

    fun updateUser(data: Map<String, String>, username: String?, imageUri: Uri?) {
        val db = writableDatabase
        val values = ContentValues().apply {
            for ((key, value) in data) {
                put(key, value)
            }
        }

        if (imageUri != null) {
            // Handle image upload here if needed
        }

        db.update(TABLE_USERS, values, "$COLUMN_USERNAME = ?", arrayOf(username))
    }

    fun searchUsers(query: String): List<UserModel> {
        val db = readableDatabase
        val searchQuery =
            "SELECT * FROM $TABLE_USERS WHERE $COLUMN_FULLNAME LIKE ? OR $COLUMN_USERNAME LIKE ?"
        val cursor: Cursor =
            db.rawQuery(searchQuery, arrayOf("%$query%", "%$query%"))

        val userList = mutableListOf<UserModel>()

        while (cursor.moveToNext()) {
            val fullNameIndex = cursor.getColumnIndex(COLUMN_FULLNAME)
            val usernameIndex = cursor.getColumnIndex(COLUMN_USERNAME)
            val emailIndex = cursor.getColumnIndex(COLUMN_EMAIL)
            val bioIndex = cursor.getColumnIndex(COLUMN_BIO)
            val imageIdIndex = cursor.getColumnIndex(COLUMN_IMAGE_ID)

            if (fullNameIndex >= 0 && usernameIndex >= 0 && emailIndex >= 0
                && bioIndex >= 0 && imageIdIndex >= 0
            ) {
                val fullName = cursor.getString(fullNameIndex)
                val email = cursor.getString(emailIndex)
                val userUsername = cursor.getString(usernameIndex)
                val bio = cursor.getString(bioIndex)
                val imageId = cursor.getString(imageIdIndex)

                val user = UserModel(fullName, email, userUsername, null, null, imageId, bio)
                userList.add(user)
            }
        }

        cursor.close()
        return userList
    }
}
