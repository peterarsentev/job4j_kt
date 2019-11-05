package ru.job4j.oop

class User(var name: String = "",
           var surname: String = "",
           var email: String = "",
           var password: String = "",
           var address: String = "") {

    fun show() {
        println("$name $email")
    }

    private fun calcHash() {
        println("some code")
    }
}

fun main() {
    val user = User(email = "parsentev@yandex.ru", password = "secret")
}