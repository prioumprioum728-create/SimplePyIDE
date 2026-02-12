package com.example.simplepyide

import android.widget.Button
import android.widget.FrameLayout
import android.view.Gravity
import android.content.Intent
import android.net.Uri

class SponsorAction {

    fun addSponsorButton(rootLayout: FrameLayout) {
        val sponsorBtn = Button(rootLayout.context)
        sponsorBtn.text = "Support Me"
        sponsorBtn.setBackgroundColor(0xFF4CAF50.toInt()) // new green color

        // Position button bottom-left (different from old)
        val params = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        params.gravity = Gravity.BOTTOM or Gravity.START
        params.setMargins(30,0,0,30)
        sponsorBtn.layoutParams = params

        sponsorBtn.setOnClickListener {
            // Open a new sponsor URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.new-sponsor-link.com"))
            rootLayout.context.startActivity(intent)
        }

        rootLayout.addView(sponsorBtn)
    }
}
