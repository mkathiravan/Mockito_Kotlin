package net.kathir.mockito

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {

    @Mock
    lateinit var operators: Operators

    lateinit var calculator: Calculator

    @Before
    fun setUp() {

        calculator = Calculator(operators)
    }

    @Test
    fun addTwoNumbers() {
        val a = 10
        val b = 20
        calculator.addTwoNumbers(a, b)
        verify(operators).add(a, b)
    }

    @Test
    fun subtractTwoNumbers() {
        val a = 10
        val b = 20
        calculator.subtractTwoNumbers(a, b)
        verify(operators).subtract(a, b)
    }

    @Test
    fun multiplyTwoNumbers() {
        val a = 10
        val b = 20
        calculator.multiplyTwoNumbers(a, b)
        verify(operators).multiply(a, b)

    }

    @Test
    fun divideTwoNumbers() {
        val a = 10
        val b = 20
        calculator.divideTwoNumbers(a, b)
        verify(operators).divide(a, b)
    }
}