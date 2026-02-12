package com.example.simplepyide

// Data model for Python scripts
data class ScriptFile(
    val id: Int,
    val fileName: String,
    val content: String,
    val lastModified: Long
)
