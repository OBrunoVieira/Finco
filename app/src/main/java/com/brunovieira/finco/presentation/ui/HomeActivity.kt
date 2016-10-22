package com.brunovieira.finco.presentation.ui

import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.brunovieira.finco.R
import com.brunovieira.finco.presentation.presenter.HomePresenterImpl
import com.brunovieira.finco.presentation.presenter.interfaces.HomePresenter
import com.brunovieira.finco.presentation.ui.interfaces.HomeView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.view_toolbar.*

class HomeActivity : AppCompatActivity(), HomeView {
    var homePresenter: HomePresenter? = null

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        homePresenter = HomePresenterImpl()
        homePresenter?.attachView(this)
    }

    override
    fun setupToolbar() {
        setSupportActionBar(toolbar)
    }

    override
    fun setupDrawerToggle() {
        val drawerToggle: ActionBarDrawerToggle =
                ActionBarDrawerToggle(this, activity_home_drawer_content_main, toolbar, R.string.app_name, R.string.app_name)

        activity_home_navigation_view.setNavigationItemSelectedListener(this)
        activity_home_drawer_content_main.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
    }

    override fun onBackPressed() {
        val drawer = activity_home_drawer_content_main

        if (drawer.isDrawerOpen(GravityCompat.START)) drawer.closeDrawer(GravityCompat.START)
        else super.onBackPressed()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logout_item -> finish()
            else -> return true
        }

        return false
    }

}
