package com.example.idk.clases

import com.example.idk.clases.Car

fun main() {

    val SPM: Car = Car()
        SPM.color = "red"
        SPM.model = " Lamborghini"
        SPM.doors = 2
        SPM.seating = 2
        SPM.wheels = 4

        SPM.specifications()
        SPM.openDoors()
        SPM.closeDoors()
        SPM.turnOn()
        SPM.turnOff()
        SPM.lock()
        SPM.unlock()

        println()

    val SKZ: Car = Car()
        SKZ.color = "black"
        SKZ.model = "n Audi"
        SKZ.doors = 4
        SKZ.seating = 4
        SKZ.wheels = 4

        SKZ.specifications()
        SKZ.openDoors()
        SKZ.closeDoors()
        SKZ.turnOn()
        SKZ.turnOff()
        SKZ.lock()
        SKZ.unlock()

        println()
    }




