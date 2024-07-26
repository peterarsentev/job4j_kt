package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class CalcTest {
    @Test
    fun when1Plus1() {
        assertThat(add(1, 1)).isEqualTo(2)
    }
}