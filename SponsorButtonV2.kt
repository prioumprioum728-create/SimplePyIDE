package com.example.simplepyide

import android.widget.Button
import android.widget.FrameLayout
import android.view.Gravity
import android.content.Intent
import android.net.Uri
import java.io.InputStreamReader
import org.yaml.snakeyaml.Yaml

class SponsorButtonV2 {

    var buttonText = "Sponsor"
    var buttonColor = 0xFFFF9800.toInt() // orange
    var buttonPosition = "bottom_right"
    var buttonUrl = "https://www.new-sponsor-link.com"

    // Load settings from YAML file
    fun loadFromYml(ymlContent: String) {
        val yaml = Yaml()
        val data: Map<String, Any> = yaml.load(InputStreamReader(ymlContent.byteInputStream()))
        val btn = data["button"] as Map<*, *>
        buttonText = btn["text"].toString()
        buttonColor = android.graphics.Color.parseColor(btn["color"].toString())
        buttonPosition = btn["position"].toString()
        buttonUrl = btn["url"].toString()
    }

    fun addButton(rootLayout: FrameLayout) {
        val btn = Button(rootLayout.context)
        btn.text = buttonText
        btn.setBackgroundColor(buttonColor)

        val params = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )

        params.gravity = if (buttonPosition == "bottom_right")
            Gravity.BOTTOM or Gravity.END
        else
            Gravity.BOTTOM or Gravity.START

        params.setMargins(30, 0, 30, 30)
        btn.layoutParams = params

        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION
