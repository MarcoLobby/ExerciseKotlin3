package it.DevelHope.ExerciseKotlin3

// Compare values of 2 variables of different type (e.g. float and integer or string and float) and print the result using string templates

fun main (){
    val number1 = 420
    val number2 = 4.20f

    println(" Number 1 is smaller than number 2 ? ${number1.toFloat() < number2}")
}