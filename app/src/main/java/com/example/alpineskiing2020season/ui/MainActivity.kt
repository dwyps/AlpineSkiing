package com.example.alpineskiing2020season.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.alpineskiing2020season.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity(R.layout.activity_main) {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    override fun onStart() {
        super.onStart()

        setupNavigation()
    }

    private fun setupNavigation() {

        navController = findNavController(R.id.nav_host_fragment_container)
        bottom_nav.setupWithNavController(navController)
    }
}
