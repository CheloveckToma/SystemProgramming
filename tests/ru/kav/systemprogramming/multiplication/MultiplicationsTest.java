package ru.kav.systemprogramming.multiplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationsTest {
    @Test
    public void multiplicationPositiveAndPositiveTest() {
        int firstOperand = 1 + (int) (Math.random() * (100));
        int secondOperand = 1 + (int) (Math.random() * (100));
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

    @Test
    public void  multiplicationNegativeAndNegativeTest() {
        int firstOperand = -100 + (int) (Math.random() * (99));
        int secondOperand = -100 + (int) (Math.random() * (99));
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

    @Test
    public void multiplicationNegativeAndPositiveTest() {
        int firstOperand = -100 + (int) (Math.random() * (99));
        int secondOperand = 1 + (int) (Math.random() * (100));
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

    @Test
    public void multiplicationPositiveAndNegativeTest() {
        int firstOperand = 1 + (int) (Math.random() * (100));
        int secondOperand = -100 + (int) (Math.random() * (99));
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

    @Test
    public void multiplicationPositiveAndZeroTest() {
        int firstOperand = 1 + (int) (Math.random() * (100));
        int secondOperand = 0;
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

    @Test
    public void multiplicationZeroAndPositiveTest() {
        int firstOperand = 0;
        int secondOperand = 1 + (int) (Math.random() * (100));
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

    @Test
    public void multiplicationNegativeAndZeroTest() {
        int firstOperand = -100 + (int) (Math.random() * (99));
        int secondOperand = 0;
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

    @Test
    public void multiplicationZeroAndNegativeTest() {
        int firstOperand = 0;
        int secondOperand = -100 + (int) (Math.random() * (99));
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

    @Test
    public void multiplicationBothZeroTest() {
        int firstOperand = 0;
        int secondOperand = 0;
        int result = Multiplications.multiplication(firstOperand, secondOperand);
        assertEquals(firstOperand * secondOperand, result);
    }

}

