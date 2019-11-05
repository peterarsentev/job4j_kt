package ru.job4j.condition

class DummyBot {
    fun answer(question : String) = when(question) {
        "Привет, Бот." -> "Привет, умник."
        "Пока." -> "До скорой встречи."
        else -> "Это ставит меня в тупик. Задайте другой вопрос."
    }
}