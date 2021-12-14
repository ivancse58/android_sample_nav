package com.ivan.samplenavproject

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var navGraph: NavGraph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavGraph()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                navController.popBackStack()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun updateToolBar(actionBarTitle: String, enableBack: Boolean = false) {
        supportActionBar?.apply {
            title = actionBarTitle
            elevation = 0f
            setDisplayHomeAsUpEnabled(enableBack)
        }
        invalidateOptionsMenu()
    }

    private fun initNavGraph() {
        navController = findNavController(R.id.fragmentContainer)
        navGraph = navController.navInflater.inflate(R.navigation.nav_home)
    }
}