package ru.job4j.base

fun max(first: Int, second: Int) = if (first > second) first else second

fun main() {
    val rsl = max(1, 2)
    println("max from 1 and 2 is $rsl")
}