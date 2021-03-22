package com.example.helloworld.ui

import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.antonioleiva.weatherapp.domain.commands.RequestForecastCommand
import com.antonioleiva.weatherapp.domain.model.Forecast
import com.antonioleiva.weatherapp.ui.adapters.ForecastListAdapter
import com.example.helloworld.*
import com.example.helloworld.ui.utils.NullTest
import com.example.helloworld.util.method
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jetbrains.anko.*
import java.net.HttpURLConnection
import java.net.URI
import java.net.URL
import java.util.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.coroutineContext
import kotlin.properties.Delegates
import kotlin.reflect.KProperty
import com.example.helloworld.method as method2

class MainActivity : AppCompatActivity() {
    private var items = listOf("Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7")

    private var name: String by Delegates.observable("") { kProperty: KProperty<*>, s: String, s1: String ->

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList: RecyclerView = find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)

        val views = (0 until forecastList.childCount).map { forecastList.getChildAt(it) }

        doAsync {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                ForecastListAdapter(result, object : ForecastListAdapter.OnItemClickListener {
                    override fun invoke(forecast: Forecast) {
                        toast(forecast.date)
                    }
                }).also { forecastList.adapter = it }
            }
        }

        Test().test()
        val a: (String, Int) -> String = String::method

        "Shelter".method(1)

        val b = ::getClassName
        parseString(::getClassName)

        val c = fun(param: Int): String {
            return param.toString()
        }

        c(1)
        var view: View = View(this)

        val person: Person = Man()
        (person as Man).ml()
        (person as? Man)?.ml()
        (person as Man)?.ml()

        method()
        method2()
        val instance = Instance


        val array = Array(100000) {
            it + 1
        }

        val job = CoroutineScope(Dispatchers.IO).launch {
            Log.d("Shelter", "Thread Name: ${Thread.currentThread().name}")
            val bytes = URL("http://p2.itc.cn/images01/20200831/60b301c438744957ab74bc020cbc4d48.jpeg").readBytes()
            val bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            withContext(Dispatchers.Main) {
                Log.d("Shelter", "Thread Name: ${Thread.currentThread().name}")
                image.setImageBitmap(bitmap)
            }
        }

        CoroutineScope(Dispatchers.Main).launch {

            val bytes = withContext(Dispatchers.IO) {
                URL("http://p2.itc.cn/images01/20200831/60b301c438744957ab74bc020cbc4d48.jpeg").readBytes()
            }
            val bitmap1 = divideImage(bytes, 4)
            val bitmap2 = divideImage(bytes, 9, getFirst = false)
            image1.setImageBitmap(bitmap1)
            image2.setImageBitmap(bitmap2)
        }

    }

    suspend fun divideImage(bytes: ByteArray, parts: Int, getFirst: Boolean = true) = withContext(Dispatchers.Default) {
        val average = bytes.size / parts
        if (getFirst) BitmapFactory.decodeByteArray(bytes, 0, 0 + average)
        else BitmapFactory.decodeByteArray(bytes, bytes.size - average - 1, average)
    }


    fun parseString(method: () -> Unit) {

    }

    fun getClassName() = javaClass::class.simpleName


    operator fun ViewGroup.get(position: Int): View = getChildAt(position)
    operator fun ViewGroup.set(position: Int, view: View): Unit {
        view.visibility = GONE
    }
}