package com.brunovieira.finco.presentation.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.brunovieira.finco.R
import com.brunovieira.finco.presentation.presenter.LoginPresenterImpl
import com.brunovieira.finco.presentation.presenter.interfaces.LoginPresenter
import com.brunovieira.finco.presentation.ui.interfaces.LoginView
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.view_toolbar.*

class LoginActivity : AppCompatActivity(), LoginView {

    var loginPresenter: LoginPresenter? = null

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginPresenter = LoginPresenterImpl()
        loginPresenter?.attachView(this)
    }

    override
    fun setupActionBar() = setSupportActionBar(toolbar)

    override
    fun setupRegisterButtonListener() = activity_login_register_button.setOnClickListener { onRegisterNow() }

    private fun onRegisterNow() {
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
}
