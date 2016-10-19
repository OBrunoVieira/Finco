package com.brunovieira.finco.presentation.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.brunovieira.finco.R
import com.brunovieira.finco.presentation.presenter.RegisterPresenterImpl
import com.brunovieira.finco.presentation.presenter.interfaces.RegisterPresenter
import com.brunovieira.finco.presentation.ui.interfaces.RegisterView
import kotlinx.android.synthetic.main.view_toolbar.*

class RegisterActivity : AppCompatActivity(), RegisterView {

    var registerPresenter: RegisterPresenter? = null

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerPresenter = RegisterPresenterImpl()
        registerPresenter?.attachView(this)
    }

    override
    fun setupActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            android.R.id.home -> onBackPressed()
        }

        return super.onOptionsItemSelected(item)
    }
}
