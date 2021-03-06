package baekjoon.priority_queue

import org.junit.Test
import util.SystemIOTest

class Solution1927Test : SystemIOTest() {
    val action: () -> Unit = {
        solution1927(arrayOf())
    }

    @Test
    fun `Test example input 1`() {
        val input = """
            9
            0
            12345678
            1
            2
            0
            0
            0
            0
            32
        """.trimIndent()

        val expected = """
            0
            1
            2
            12345678
            0
        """.trimIndent()

        action at input be expected
    }
}