package com.example.helloworld

import android.util.Log
import java.net.URL

/**
 * @author: Shelter
 * Create time: 2020/12/9, 23:50.
 */
class ForecastRequest(val url: String) {
    public fun run() {
        val result = URL(url).readText()
        Log.d(javaClass.simpleName, result)
    }
}