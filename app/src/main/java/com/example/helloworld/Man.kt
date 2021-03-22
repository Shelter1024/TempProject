package com.example.helloworld

/**
 * @author: Shelter
 * Create time: 2021/3/9, 10:28.
 */
class Man() : Person() {

    override fun eat(food: String) {
        super.eat("hamburger")
    }

    fun ml() {
        println("ml")
    }
}