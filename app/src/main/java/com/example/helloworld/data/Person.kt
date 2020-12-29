package com.example.helloworld.data

/**
 * @author: Shelter
 * Create time: 2020/11/30, 17:03.
 */
class Person {
    var name : String = "Shelter"
    get() = field.toUpperCase()
    set(value) {
        field = "Name:$value"
    }
}