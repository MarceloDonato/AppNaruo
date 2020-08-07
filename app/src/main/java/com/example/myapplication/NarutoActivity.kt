package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NarutoActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context) = Intent(context, NarutoActivity::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naruto)
    }
}