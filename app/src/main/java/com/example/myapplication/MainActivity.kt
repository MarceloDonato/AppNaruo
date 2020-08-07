package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    companion object {
        fun getStartIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register_button.setOnClickListener {
            performRegister()

        }
        already_has_a_count.setOnClickListener {
            startActivity(LoginActivity.getStartIntent(this))
            finish()
        }

    }

    private fun performRegister() {
        val email = edit_text_email.text.toString()
        val password = editTextTextPassword.text.toString()

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "please enter text in email/password", Toast.LENGTH_SHORT).show()
            return
        }
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(
            edit_text_email.text.toString(),
            editTextTextPassword.text.toString()
        )
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show()
                    startActivity(HomeActivity.getStartIntent(this))
                    finish()

                } else {
                    Toast.makeText(this, "Failed to created user with uid:", Toast.LENGTH_SHORT)
                        .show()
                }

            }
            .addOnFailureListener {
                Toast.makeText(this, "Failed to created user with uid:", Toast.LENGTH_SHORT).show()
            }

    }

}

