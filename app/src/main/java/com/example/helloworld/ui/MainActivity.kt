package com.example.helloworld.ui

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.ForecastRequest
import com.example.helloworld.R
import com.example.helloworld.util.ToastUtil
import com.example.helloworld.util.ToastUtil.toast
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.async

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = listOf("a", "b", "c")
        println("Shelter: " + list.indices)

        forecast_list.layoutManager

//        val forecastList: RecyclerView = find(R.id.forecast_list)
//        forecastList.layoutManager = LinearLayoutManager(this)
//        forecastList.adapter = ForecastListAdapter(items)

        doAsync {
            ForecastRequest("http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7").run()
            uiThread {
                longToast("request finish")
            }
        }
    }

    operator fun ViewGroup.get(position: Int): View = getChildAt(position)

}