package com.example.helloworld.ui

/**
 * @author: Shelter
 * Create time: 2021/3/5, 11:28.
 */
class AnimalWithWings : CanFly{
    val wings = Wings()
    override fun fly() {
        wings.move()
    }
}