package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding.*


class OnboardingActivity : AppCompatActivity() {

    companion object {
        fun getStartIntent(context: Context) = Intent(context, OnboardingActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        register_button_onboarding.setOnClickListener {
            startActivity(MainActivity.getStartIntent(this))
            finish()
        }

        login_button_onboarding.setOnClickListener {
            startActivity(LoginActivity.getStartIntent(this))
            finish()
        }
    }
}