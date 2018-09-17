package com.example.armandoedge.a23receptordeintencionesimplicitas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        val uri = intent.data
        if (uri != null) {
            val textView = findViewById<View>(R.id.text_uri_message) as TextView
            textView.text = "URI: " + uri.toString()
        }
    }
}
