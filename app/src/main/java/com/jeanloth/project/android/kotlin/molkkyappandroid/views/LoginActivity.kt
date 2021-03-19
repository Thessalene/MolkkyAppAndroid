package com.jeanloth.project.android.kotlin.molkkyappandroid.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jeanloth.project.android.kotlin.molkkyappandroid.R
import com.jeanloth.project.android.kotlin.molkkyappandroid.fragments.LoginViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val loginVM : LoginViewModel by viewModel()

    private val TAG = "Login Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }


}