package com.example.cicddemo

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.WHITE)
            setPadding(64, 64, 64, 64)
        }

        val title = TextView(this).apply {
            text = "CI/CD Demo"
            textSize = 30f
            setTextColor(Color.parseColor("#1F3A5F"))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Built by GitHub Actions\n\n" +
                "push to main  ->  debug APK\n" +
                "push v* tag   ->  signed release APK"
            textSize = 16f
            setTextColor(Color.parseColor("#5B6B7C"))
            gravity = Gravity.CENTER
            setPadding(0, 32, 0, 0)
        }

        layout.addView(title)
        layout.addView(subtitle)
        setContentView(layout)
    }
}
