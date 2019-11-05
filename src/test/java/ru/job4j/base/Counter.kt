package ru.job4j.base

fun add(start: Int, finish: Int): Int {
    var rsl = 0;
    for (value in start .. finish) {
        rsl += value
    }
    return rsl
}

fun show(start: Int, finish: Int) {
    for (value in finish downTo start step 2) {
        println(value)
    }
}

fun main() {
    val rsl = add(0, 10)
    println("Sum from 0 to 10 is $rsl")
    show(0, 10)
}