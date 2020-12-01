package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find
import org.jetbrains.anko.toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = listOf("a", "b", "c")
        println("Shelter: " + list.indices)

        forecast_list.layoutManager

//        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
//        fruits.filter { it.startsWith("a") }
//                .sortedBy { it }
//                .map { it.toUpperCase(Locale.CHINA) }
//                .forEach { println(it) }
        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        val recyclerView: RecyclerView = find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

        val person = Person()
        Log.i("TAG", "onCreate: person.name = " + person.name)
        person.name = "Panny"
        Log.i("TAG", "onCreate: person.name = " + person.name)
        val contentGroup = findViewById<ViewGroup>(android.R.id.content)
        contentGroup[2].visibility = View.GONE

        val fragment = Fragment();
        fragment.toast("")

        //调换参数顺序
        niceToast(tag = "Shelter", message = "调换参数顺序")

    }

    operator fun ViewGroup.get(position: Int): View = getChildAt(position)

    fun Fragment.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(getActivity(), message, duration).show()
    }

    override fun onResume() {
        super.onResume()
        niceToast(message = "onResume")
    }

    fun niceToast(message: String, tag: String = javaClass.simpleName, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[$tag]$message", length).show()
    }

    fun add(x: Int, y: Int) = x + y


}