package com.github.ecolban.functiondecorators.utils

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MakeNumberTreeKtTest {

    @Test
    fun testParseTree() {
        val actual = parseTree("Tree_200.txt")
        assertEquals(200, actual.size)
        for (row in 0 until actual.size) {
            assertEquals(row + 1, actual[row].size)
        }
    }
}