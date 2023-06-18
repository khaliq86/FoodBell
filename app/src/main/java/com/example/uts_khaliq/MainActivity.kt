package com.example.uts_khaliq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.uts_khaliq.fragment.FragmentHome
import com.example.uts_khaliq.fragment.FragmentProfil
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(FragmentHome.newInstance())

        val bottomNavigation = findViewById<View>(R.id.bottom_navigation) as BottomNavigationView
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Respon terhadap klik item "Home"
                    addFragment(FragmentHome.newInstance())
                    true
                }
                R.id.nav_profil -> {
                    // Respon terhadap klik item "Account"
                    val actionBar: androidx.appcompat.app.ActionBar? = supportActionBar
                    actionBar?.title = "Profil Mahasiswa"
                    addFragment(FragmentProfil.newInstance())
                    true
                }
                else -> false
            }
        }
    }

    fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_container, fragment)
            .commit()
    }
}