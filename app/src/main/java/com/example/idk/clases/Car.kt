package com.example.idk.clases

class Car {

    var color: String = ""
    var model: String = ""
    var doors: Int = 0
    var seating: Int = 0
    var wheels: Int = 0


    fun specifications() {

        println("The car")
        println("is $color")
        println("is a$model")
        println("has $doors doors")
        println("has $seating seating")
        println("and has $wheels wheels")
    }

    fun openDoors() {
        println("open the doors")
    }

    fun closeDoors() {
        println("close the doors")
    }

    fun turnOn() {
        println("turn on the light")
    }

    fun turnOff() {
        println("turn off the light")
    }

    fun lock() {
        println("lock the doors")
    }

    fun unlock() {
        println("unlock the doors")
    }

}



