package ru.job4j.oop

import java.util.NoSuchElementException

class SimpleLinkedList<T> : Iterable<T> {
    private var head : Node<T>? = null

    fun add(value: T) {
        if (head != null) {
            head = Node<T>(value)
        }
    }

    override fun iterator(): Iterator<T> {
        return LinkedIt()
    }

    inner class LinkedIt : Iterator<T> {
        override fun hasNext(): Boolean {
            return head != null
        }

        override fun next(): T {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            return head!!.value
        }

    }

    class Node<K>(val value: K, var next: Node<K>? = null)
}

fun main() {
    val node = SimpleLinkedList.Node<String>("Kotlin")
    val list = SimpleLinkedList<String>()
    for (value in list) {
        println(value)
    }
}