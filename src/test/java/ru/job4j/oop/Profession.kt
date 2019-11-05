package ru.job4j.oop

open class Profession {
    open fun action() {
        println("execute some actions")
    }

}

class Doctor : Profession() {
    override fun action() {
        super.action();
        println("action from doctor")
    }
}

open class Person(val name : String)

class Student(name: String, group: String) : Person(name)

fun main() {
    val doctor = Doctor()
}