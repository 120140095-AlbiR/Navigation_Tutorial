package com.example.navigationtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(androidx.navigation.fragment.R.id.nav_host_fragment_container)
        navController.navigate(R.id.action_fragment1_to_fragment2)
    }
}