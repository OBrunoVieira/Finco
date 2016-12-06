package com.brunovieira.finco.presentation.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.brunovieira.finco.R

class RegisterExpenseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_in_top)
        setContentView(R.layout.activity_register_expense)
    }
}
