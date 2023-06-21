package ru.job4j.base

fun fitness(ivan: Int, nik: Int): Int {
    var month = 0;
    var powerIvan = ivan
    var powerNik = nik
    while (powerIvan < powerNik) {
        powerIvan *= 3;
        powerNik *= 2
        month++
    }
    return month
}

fun main() {
    val rsl = fitness(50, 90)
    println("Month : $rsl")
}