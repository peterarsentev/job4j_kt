package ru.job4j.oop

import ru.job4j.tracker.Item

interface Input {
    fun ask(question: String) : String
}

interface Action {
    fun execute(tracker: Tracker, input: Input): Boolean
}

class AddAction : Action {
    override fun execute(tracker: Tracker, input: Input): Boolean {
        tracker.add(Item(input.ask("Enter name")))
        return true;
    }
}