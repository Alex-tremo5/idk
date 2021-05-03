package com.example.idk.examples

import com.example.idk.clases.Animal

fun main () {

    val axolotl: Animal = Animal()
    axolotl.name = "axolotl"
    axolotl.color = "pink"
    axolotl.habitat = "lakes"
    axolotl.size = "30cm"
    axolotl.legs = 4

    axolotl.specifications()
    axolotl.sleep()
    axolotl.eat()
    axolotl.relation()
    axolotl.breed()
    println()



    val  northernWhitecheekedGibbon: Animal = Animal ()
    northernWhitecheekedGibbon.name = "northern White-cheeked Gibbon"
    northernWhitecheekedGibbon.color = "white, black, reddish"
    northernWhitecheekedGibbon.habitat = "the subtropical forest"
    northernWhitecheekedGibbon.size = "90cm"
    northernWhitecheekedGibbon.legs = 4

    northernWhitecheekedGibbon.specifications()
    northernWhitecheekedGibbon.sleep()
    northernWhitecheekedGibbon.eat()
    northernWhitecheekedGibbon.relation()
    northernWhitecheekedGibbon.breed()
    println()



    val kalugaSturgeon: Animal = Animal()
    kalugaSturgeon.name = "Kaluga Sturgeon"
    kalugaSturgeon.color = "grey"
    kalugaSturgeon.habitat = "rivers, sea"
    kalugaSturgeon.size = "5.6m"
    kalugaSturgeon.legs = 0

    kalugaSturgeon.specifications()
    kalugaSturgeon.sleep()
    kalugaSturgeon.eat()
    kalugaSturgeon.relation()
    kalugaSturgeon.breed()
    println()



}