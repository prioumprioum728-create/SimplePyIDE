package com.example.simplepyide

import android.widget.Button
import android.widget.FrameLayout
import android.view.Gravity
import android.content.Intent
import android.net.Uri

class SponsorButtonNew {

    fun addButton(rootLayout: FrameLayout) {
        val btn = Button(rootLayout.context)
        btn.text = "Support Me"
        btn.setBackgroundColor(0xFF4CAF50.toInt()) // fresh green color

        val params = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        params.gravity = Gravity.BOTTOM or Gravity.START
        params.setMargins(30, 0, 0, 30)
        btn.layoutParams = params

        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.new-sponsor-link.com"))
            rootLayout.context.startActivity(intent)
        }

        rootLayout.addView(btn)
    }
}
