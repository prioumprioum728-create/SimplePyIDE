package com.example.simplepyide

import android.content.Context
import android.widget.Toast

// This is a helper class for your app
object AppHelpers {

    // Show a simple toast message
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    // Example: add two numbers
    fun addNumbers(a: Int, b: Int): Int {
        return a + b
    }

    // Example: check if a string is empty
    fun isEmpty(str: String?): Boolean {
        return str == null || str.trim().isEmpty()
    }
}
