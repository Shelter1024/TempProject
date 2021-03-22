package com.example.helloworld.ui

/**
 * @author: Shelter
 * Create time: 2021/3/5, 11:26.
 */
class Bird : CanFly by AnimalWithWings() {
    fun <T, R> eat(food: T, method: () -> R) : R {
        return method()
    }
}

public class Outer {
    private val bar: Int = 1
    inner class Inner{
        fun foo() = this@Outer.bar
    }
}

