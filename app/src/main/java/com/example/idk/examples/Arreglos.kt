package com.example.idk.examples

fun main(){

    var songs= arrayOf("bycicle","my turn", "mmmh", "criminal", "everybody gets high", "twisted", "you", "dope","make a wish")
    var ages= arrayOf(26, 19, 21, 15, 17, 32, 80, 75, 49)
    var thise= arrayOf(1 ,2 ,3 ,4 ,5)

   // for (i in 0..songs.size-1)
        //println("the song: ${songs[i]} has: ${ages[i]} seconds")
    

    for (i in 0..ages.size-1){
        if (ages[i] % 2 ==0){
            println("${ages[i]} es un número par")
        } else if(ages[i] % 2 == 1){
            println("${ages[i]} es un número impar")
        }
    }



}