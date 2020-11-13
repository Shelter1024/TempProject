package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.Executor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startActivity1(view: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun startActivity2(view: View?) {

    }


}