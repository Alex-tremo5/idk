package com.example.idk.examples


fun name(name: String) {
    println("Your name is $name")
}

fun names(firstName: String, secondName: String) {
    println("Your names are $firstName $secondName")
}

fun fullName(first: String, second: String, third: String, fourth: String) {
    println("Your full name is $first $second $third $fourth")
}

fun personal(sex: String, age: Int, country: String, hoobie: String, phone: Int) {
    println(
        "Your sex is: $sex, your age is: $age, your country is: $country, your hoobie is: $hoobie and your phone is: $phone"
    )
}

fun day(day: String) {

    when (day) {
        "M" -> {
            println("Monday")
        }
        "T" -> {
            println("Tuesday")
        }
        "w" -> {
            println("Wednesday")
        }
        "TT" -> {
            println("Thursday")
        }
        "F" -> {
            println("Friday")
        }
        "S" -> {
            println("Saturday")
        }
        "SS" -> {
            println("Sunday")
        }
    }
}

fun numberr (number: Int) {
    for (i in 1..10) {
        println("$number * $i = ${number * i} ")
    }



    }

fun translate(word: String) {

    when (word) {
        "Computer" -> {
            println("$word means: Computador")
        }
        "Mouse" -> {
            println("$word means: Mouse :V")
        }
        "Keyboard" -> {
            println("$word means: Teclado")
        }
        "Tablet" -> {
            println("$word means: Tablet :V")
        }
        "Phone" -> {
            println("$word means: Teléfono")
        }
    }
}

    fun main() {
        name("Alex")
        names("Diana", "Marcela")
        fullName("Andrés", "David", "Quintero", "Angulo")
        personal("Male", 21, "Thailand", "Sleep", 304552546)
        day("T")
        day("M")
        numberr(20)
        translate("Keyboard")

    }




