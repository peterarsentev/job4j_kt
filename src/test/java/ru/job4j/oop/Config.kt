package ru.job4j.oop

import java.io.File
import java.io.InputStream

class Config private constructor() {
    companion object {
        fun loadByFile(file: File): Config {
            println("load from $file")
            return Config()
        }

        fun loadByInputStream(input: InputStream): Config {
            println("load from $input")
            return Config()
        }

        fun loadByPlainText(text: String): Config {
            println("load from $text")
            return Config()
        }
    }

    operator fun get(key: String): String {
        return "$key load value"
    }
}

fun main() {
    val config = Config.loadByFile(File("./app.properties"))
    println(config["load"])
}