package ru.job4j.base

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class CalcTest {
    @Test
    fun when1Plus1() {
        assertEquals(add(1, 1), 3)
    }
}