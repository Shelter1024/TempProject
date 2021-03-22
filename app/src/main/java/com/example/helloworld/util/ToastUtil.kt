package com.example.helloworld.util

import android.content.Context
import android.widget.Toast

/**
 * @author: Shelter
 * Create time: 2020/12/8, 20:19.
 */
object ToastUtil {
    fun Context.toast() {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show()
    }
}

fun Context.makeText(length : Int) : String {
    return "I am a text from fun"
}

fun String.method(number: Int) = number.toString()