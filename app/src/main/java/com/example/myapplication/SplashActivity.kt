package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            startLoginActivity()
        }, 3000)

    }

    private fun startLoginActivity() {
        startActivity(LoginActivity.getStartIntent(this))
        finish()
     }

}