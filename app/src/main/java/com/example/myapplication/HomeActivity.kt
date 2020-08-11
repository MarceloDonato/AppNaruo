package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    companion object {
        fun getStartIntent(context: Context) = Intent(context, HomeActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        button_logout.setOnClickListener {
            logoutUser()
        }

        pain_image_view.setOnClickListener {
            startActivity(PainActivity.getStartIntent(this))

        }

        naruto_image_view.setOnClickListener {
            startActivity(NarutoActivity.getStartIntent(this))

        }

        sasuke_image_view.setOnClickListener {
            startActivity(SasukeActivity.getStartIntent(this))

        }

        itachi_image_view.setOnClickListener {
            startActivity(ItachiActivity.getStartIntent(this))

        }

        deidara_image_view.setOnClickListener {
            startActivity(DeidaraActivity.getStartIntent(this))

        }

        sakura_image_view.setOnClickListener {
            startActivity(SakuraActivity.getStartIntent(this))

        }

        hinata_image_view.setOnClickListener {
            startActivity(HinataActivity.getStartIntent(this))

        }

        obito_image_view.setOnClickListener {
            startActivity(ObitoActivity.getStartIntent(this))

        }

        madara_image_view.setOnClickListener {
            startActivity(MadaraActivity.getStartIntent(this))

        }

        hashirama_image_view.setOnClickListener {
            startActivity(HashiramaActivity.getStartIntent(this))

        }

        tobirama_image_view.setOnClickListener {
            startActivity(TobiramaActivity.getStartIntent(this))

        }

        minato_image_view.setOnClickListener {
            startActivity(MinatoActivity.getStartIntent(this))

        }


    }
    private fun logoutUser() {
        Intent(applicationContext, LoginActivity::class.java).let {
            FirebaseAuth.getInstance().signOut()
            it.flags =
                Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(it)
        }
    }
}