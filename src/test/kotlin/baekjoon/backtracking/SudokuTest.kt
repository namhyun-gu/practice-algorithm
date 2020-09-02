package baekjoon.backtracking

import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.ExpectedSystemExit
import util.SystemIOTest

class SudokuTest : SystemIOTest() {

    @get:Rule
    val exit: ExpectedSystemExit = ExpectedSystemExit.none()

    val action: () -> Unit = {
        Sudoku.main(arrayOf())
    }

    @Test
    fun `Test example input 1`() {
        exit.expectSystemExit()

        test("""
            0 3 5 4 6 9 2 7 8
            7 8 2 1 0 5 6 0 9
            0 6 0 2 7 8 1 3 5
            3 2 1 0 4 6 8 9 7
            8 0 4 9 1 3 5 0 6
            5 9 6 8 2 0 4 1 3
            9 1 7 6 5 2 0 8 0
            6 0 3 7 0 1 9 5 2
            2 5 8 3 9 4 7 6 0
        """.trimIndent(), """
            1 3 5 4 6 9 2 7 8
            7 8 2 1 3 5 6 4 9
            4 6 9 2 7 8 1 3 5
            3 2 1 5 4 6 8 9 7
            8 7 4 9 1 3 5 2 6
            5 9 6 8 2 7 4 1 3
            9 1 7 6 5 2 3 8 4
            6 4 3 7 8 1 9 5 2
            2 5 8 3 9 4 7 6 1
        """.trimIndent(), action)
    }

    @Test
    fun `Test example input 2`() {
        exit.expectSystemExit()

        test("""
            0 2 0 9 0 5 0 0 0
            5 9 0 0 3 0 2 0 0
            7 0 0 6 0 2 0 0 5
            0 0 9 3 5 0 4 6 0
            0 5 4 0 0 0 7 8 0
            0 8 3 0 2 7 5 0 0
            8 0 0 2 0 9 0 0 4
            0 0 5 0 4 0 0 2 6
            0 0 0 5 0 3 0 7 0
        """.trimIndent(), """
            3 2 1 9 7 5 6 4 8
            5 9 6 8 3 4 2 1 7
            7 4 8 6 1 2 9 3 5
            1 7 9 3 5 8 4 6 2
            2 5 4 1 9 6 7 8 3
            6 8 3 4 2 7 5 9 1
            8 1 7 2 6 9 3 5 4
            9 3 5 7 4 1 8 2 6
            4 6 2 5 8 3 1 7 9
        """.trimIndent(), action)
    }

    @Test
    fun `Test example input 3`() {
        exit.expectSystemExit()

        test("""
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
            0 0 0 0 0 0 0 0 0
        """.trimIndent(), """
            1 2 3 4 5 6 7 8 9
            4 5 6 7 8 9 1 2 3
            7 8 9 1 2 3 4 5 6
            2 1 4 3 6 5 8 9 7
            3 6 5 8 9 7 2 1 4
            8 9 7 2 1 4 3 6 5
            5 3 1 6 4 2 9 7 8
            6 4 2 9 7 8 5 3 1
            9 7 8 5 3 1 6 4 2
        """.trimIndent(), action)
    }
}