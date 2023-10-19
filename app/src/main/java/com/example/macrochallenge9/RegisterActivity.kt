package com.example.macrochallenge9

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtName: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var edtConfirmPw: EditText

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edtName = findViewById(R.id.edt_name)
        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)
        edtConfirmPw = findViewById(R.id.edt_confirm_password)

        val btnLogin: TextView = findViewById(R.id.to_login2)
        btnLogin.setOnClickListener{
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        val btnSignUp: Button = findViewById(R.id.button)
        btnSignUp.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.button-> {
                val bundle = Bundle()
                bundle.putString("email", edtEmail.text.toString())
                bundle.putString("password", edtPassword.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}