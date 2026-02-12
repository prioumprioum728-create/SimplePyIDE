package com.example.simplepyide

import android.content.Context
import android.net.Uri
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

object FileHelper {

    // Load text from a Uri (Python file)
    fun loadTextFromUri(context: Context, uri: Uri): String {
        val content = StringBuilder()
        context.contentResolver.openInputStream(uri)?.use { inputStream ->
            BufferedReader(InputStreamReader(inputStream)).use { reader ->
                var line = reader.readLine()
                while (line != null) {
                    content.append(line).append("\n")
                    line = reader.readLine()
                }
            }
        }
        return content.toString()
    }

    // Save text to a Uri (Python file)
    fun saveTextToUri(context: Context, uri: Uri, text: String) {
        context.contentResolver.openOutputStream(uri)?.use { outputStream ->
            OutputStreamWriter(outputStream).use { writer ->
                writer.write(text)
                writer.flush()
            }
        }
    }
}
