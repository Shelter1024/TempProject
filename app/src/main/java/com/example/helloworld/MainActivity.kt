package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = listOf("a", "b", "c")
        println("Shelter: " + list.indices)

        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits.filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase(Locale.CHINA) }
                .forEach { println(it) }

        findViewById<TextView>(R.id.text).text = "close an issue"
    }

    fun startActivity1(view: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        //在近期任务列表显示单个app的多个activity
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
//        intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        startActivity(intent)
    }

    fun startActivity2(view: View?) {

    }


}