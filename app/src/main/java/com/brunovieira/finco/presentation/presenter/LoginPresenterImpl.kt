package com.brunovieira.finco.presentation.presenter

import com.brunovieira.finco.presentation.presenter.interfaces.LoginPresenter
import com.brunovieira.finco.presentation.ui.interfaces.LoginView

/**
 * Created by bruno.vieira on 19/10/2016.
 */

class LoginPresenterImpl : LoginPresenter {
    var loginView: LoginView? = null

    override fun attachView(loginView: LoginView) {
        this.loginView = loginView
        this.loginView?.setupActionBar()
        this.loginView?.setupLoginButtonListener()
        this.loginView?.setupRegisterButtonListener()
    }

}
