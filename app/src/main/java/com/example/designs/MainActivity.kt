package com.example.designs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle         //This is basically for that hamburger sign that opens our drawer
    lateinit var drawerLayout: DrawerLayout            //To access the drawerLayout outside the onCreate method

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        toggle = ActionBarDrawerToggle(this, drawerLayout,R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                 R.id.nav_notification -> Toast.makeText(applicationContext,"clicked notification", Toast.LENGTH_SHORT).show()
                R.id.nav_leaveJob -> Toast.makeText(applicationContext,"clicked leave job", Toast.LENGTH_SHORT).show()
                R.id.nav_ArchiveJob -> Toast.makeText(applicationContext,"clicked archive job", Toast.LENGTH_SHORT).show()
                R.id.nav_DeleteJob -> Toast.makeText(applicationContext,"clicked delete job", Toast.LENGTH_SHORT).show()
                R.id.nav_TimeZone -> Toast.makeText(applicationContext,"clicked time zone", Toast.LENGTH_SHORT).show()
                R.id.nav_AccountInfo -> Toast.makeText(applicationContext,"clicked account info", Toast.LENGTH_SHORT).show()
            }
            true
        }



















    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)

    }

    }
