package com.brunovieira.finco.presentation.presenter

import com.brunovieira.finco.presentation.presenter.interfaces.RegisterPresenter
import com.brunovieira.finco.presentation.ui.interfaces.RegisterView

/**
 * Created by bruno.vieira on 19/10/2016.
 */

class RegisterPresenterImpl : RegisterPresenter {
    var registerView: RegisterView? = null

    override fun attachView(registerView: RegisterView) {
        this.registerView = registerView
        this.registerView?.setupActionBar()
    }
}
