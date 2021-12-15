package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

private val AppBarConfiguration.NavitgationUI: Unit
    get() {}

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Bottom navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
       val   navController = findNavController(R.id.fragmentC3)
        bottomNavigationView.setupWithNavController(navController)
        // navigate up
       val   appBarConfiguration = AppBarConfiguration(setOf(R.id.startFragment3,R.id.middleFragment3,R.id.endFragment3))
        setupActionBarWithNavController(navController,appBarConfiguration)

        //print("onCreate")
       Toast.makeText(applicationContext,"onCreate",Toast.LENGTH_SHORT).show()
    }


    override fun onStart(){
        super.onStart()
        print("onStart")
        Toast.makeText(applicationContext,"onCreate",Toast.LENGTH_SHORT).show()
    }
    override fun onResume(){
        super.onResume()
        print("onResume")
        Toast.makeText(applicationContext,"onResume",Toast.LENGTH_SHORT).show()
    }
    override fun onPause(){
        super.onPause()
        print("onPause")
        Toast.makeText(applicationContext,"onPause",Toast.LENGTH_SHORT).show()
    }
    override fun onStop(){
        super.onStop()
        print("onStop")
        Toast.makeText(applicationContext,"onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart")
        Toast.makeText(applicationContext,"onRestart",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy")
        Toast.makeText(applicationContext,"onDestory",Toast.LENGTH_SHORT).show()
    }
    fun print(msg:String){
        Log.d("Activity state",msg)
    }
}