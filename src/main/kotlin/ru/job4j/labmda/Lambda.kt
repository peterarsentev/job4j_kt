package ru.job4j.labmda

fun main() {

    val max = { x: Int, y: Int -> if (x > y) x else y }
    val rsl = max(1, 2)

    val inc = { x: Int -> x + 1}
    println(inc(1))

    val predicate = { e: Int -> e % 2 == 0 }

    val list = listOf(1, 2, 3, 4)
    val square = list.map { el -> el * el }
    println(square)
}