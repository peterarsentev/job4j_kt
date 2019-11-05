package ru.job4j.oop

import ru.job4j.tracker.Item

class Tracker {
    private val items = arrayListOf<Item>()
    fun add(item: Item) {
        items.add(item)
    }
}