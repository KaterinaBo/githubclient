package com.example.githubclient

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = View(this)
        view.setBackgroundColor(Color.GRAY)

        setContentView(view)
    }


}