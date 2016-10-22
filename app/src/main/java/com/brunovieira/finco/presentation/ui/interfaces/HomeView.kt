package com.brunovieira.finco.presentation.ui.interfaces

import android.support.design.widget.NavigationView

/**
 * Created by bruno.vieira on 21/10/2016.
 */
interface HomeView : NavigationView.OnNavigationItemSelectedListener {
    fun setupToolbar()
    open fun setupDrawerToggle()
}