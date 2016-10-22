package com.brunovieira.finco.presentation.presenter

import com.brunovieira.finco.presentation.presenter.interfaces.HomePresenter
import com.brunovieira.finco.presentation.ui.interfaces.HomeView

/**
 * Created by bruno.vieira on 21/10/2016.
 */
class HomePresenterImpl : HomePresenter {
    var homeView: HomeView? = null

    override
    fun attachView(homeView: HomeView) {
        this.homeView = homeView
        this.homeView?.setupToolbar()
        this.homeView?.setupDrawerToggle()
    }
}