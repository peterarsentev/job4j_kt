package ru.job4j.tracker

data class Item(var id : String = "", var name : String = "")

fun main() {
    val third = Item(name = "Solved bug")
    val fourth = Item()
    val first = Item("1", "Fix bug")
    val second = Item("1", "Solve task")
    val eq = first.equals(second)
    println("$first is eq $second = $eq")
}