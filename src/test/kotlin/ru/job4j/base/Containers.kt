package ru.job4j.base

fun createArray() {
    val names =  arrayOfNulls<String>(10)
    names[0] = "Petr Arsentev"
    for ((index, name) in names.withIndex()) {
        println("$index " + name?.length)
    }
}


fun createArrayList() {
    val names = ArrayList<String>()
    names.add("Petr Arsentev")
    for (name in names) {
        println(name)
    }
}

data class User(val name: String)

fun createArrayWithUsers() {
    val users = arrayOfNulls<User>(4)
    users[0] = User("Petr Arsentev")
    for (user in users) {
        println(user?.name)
    }
}

fun main() {
    createArray()
    createArrayList()
}