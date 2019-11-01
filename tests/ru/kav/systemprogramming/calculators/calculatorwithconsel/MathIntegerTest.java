package ru.kav.systemprogramming.calculators.calculatorwithconsel;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathIntegerTest {

    @Test
    public void additionPositive() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.addition(numberOne, numberTwo);
        assertEquals(numberOne + numberTwo, result);
    }
    @Test
    public void additionNegative() {
        int numberOne = -100 + (int) (Math.random() * 99);
        int numberTwo = -100 + (int) (Math.random() * 99);
        int result = MathInteger.addition(numberOne, numberTwo);
        assertEquals(numberOne + numberTwo, result);
    }

    @Test
    public void additionZero() {
        int numberOne = 0;
        int numberTwo = 0;
        int result = MathInteger.addition(numberOne, numberTwo);
        assertEquals(numberOne + numberTwo, result);
    }

    @Test
    public void additionFirstNumberZero() {
        int numberOne = 0;
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.addition(numberOne, numberTwo);
        assertEquals(numberOne + numberTwo, result);
    }

    @Test
    public void additionSecondNumberZero() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 0;
        int result = MathInteger.addition(numberOne, numberTwo);
        assertEquals(numberOne + numberTwo, result);
    }

    @Test(expected = ArithmeticException.class)
    public void additionOverflow() {
        int numberOne = 2147483647;
        int numberTwo = 5;
        int result = MathInteger.addition(numberOne, numberTwo);
        assertEquals(numberOne + numberTwo, result);
    }


    @Test
    public void subtractionPositive() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.subtraction(numberOne, numberTwo);
        assertEquals(numberOne - numberTwo, result);
    }

    @Test
    public void subtractionNegative() {
        int numberOne = -100 + (int) (Math.random() * 99);
        int numberTwo = -100 + (int) (Math.random() * 99);
        int result = MathInteger.subtraction(numberOne, numberTwo);
        assertEquals(numberOne - numberTwo, result);
    }

    @Test
    public void subtractionZero() {
        int numberOne = 0;
        int numberTwo = 0;
        int result = MathInteger.subtraction(numberOne, numberTwo);
        assertEquals(numberOne - numberTwo, result);
    }

    @Test
    public void subtractionFirstNumberZero() {
        int numberOne = 0;
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.subtraction(numberOne, numberTwo);
        assertEquals(numberOne - numberTwo, result);
    }

    @Test
    public void subtractionSecondNumberZero() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 0;
        int result = MathInteger.subtraction(numberOne, numberTwo);
        assertEquals(numberOne - numberTwo, result);
    }

    @Test(expected = ArithmeticException.class)
    public void subtractionOverflow() {
        int numberOne = -2147483647;
        int numberTwo = 5;
        int result = MathInteger.subtraction(numberOne, numberTwo);
        assertEquals(numberOne - numberTwo, result);
    }

    @Test
    public void divisionPositive() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.division(numberOne, numberTwo);
        assertEquals(numberOne / numberTwo, result);
    }

    @Test
    public void divisionNegative() {
        int numberOne = -100 + (int) (Math.random() * 99);
        int numberTwo = -100 + (int) (Math.random() * 99);
        int result = MathInteger.division(numberOne, numberTwo);
        assertEquals(numberOne / numberTwo, result);
    }

    @Test
    public void divisionFirstNumberZero() {
        int numberOne = 0;
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.division(numberOne, numberTwo);
        assertEquals(numberOne / numberTwo, result);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionSecondNumberZero() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 0;
        int result = MathInteger.division(numberOne, numberTwo);
        assertEquals(numberOne / numberTwo, result);
    }

    @Test
    public void multiplyPositive() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.multiplication(numberOne, numberTwo);
        assertEquals(numberOne * numberTwo, result);
    }

    @Test
    public void multiplyNegative() {
        int numberOne = -100 + (int) (Math.random() * 99);
        int numberTwo = -100 + (int) (Math.random() * 99);
        int result = MathInteger.multiplication(numberOne, numberTwo);
        assertEquals(numberOne * numberTwo, result);
    }

    @Test
    public void multiplyZero() {
        int numberOne = 0;
        int numberTwo = 0;
        int result = MathInteger.multiplication(numberOne, numberTwo);
        assertEquals(numberOne * numberTwo, result);
    }

    @Test
    public void multiplyFirstNumberZero() {
        int numberOne = 0;
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.multiplication(numberOne, numberTwo);
        assertEquals(numberOne * numberTwo, result);
    }

    @Test
    public void multiplySecondNumberZero() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 0;
        int result = MathInteger.multiplication(numberOne, numberTwo);
        assertEquals(numberOne * numberTwo, result);
    }

    @Test(expected = ArithmeticException.class)
    public void multiplyOverflow() {
        int numberOne = 2147483647;
        int numberTwo = 2;
        int result = MathInteger.multiplication(numberOne, numberTwo);
        assertEquals(numberOne * numberTwo, result);
    }

    @Test
    public void powPositive() {
        int numberOne = 1 + (int) (Math.random() * 10);
        int numberTwo = 1 + (int) (Math.random() * 10);
        int result = MathInteger.exponentiation(numberOne, numberTwo);
        assertEquals((int) Math.pow(numberOne, numberTwo), result);
    }

    @Test(expected = ArithmeticException.class)
    public void powNegative() {
        int numberOne = 1 + (int) (Math.random() * 10);
        int numberTwo = -10 + (int) (Math.random() * 9);
        int result = MathInteger.exponentiation(numberOne, numberTwo);
        assertEquals((int) Math.pow(numberOne, numberTwo), result);
    }

    @Test
    public void powFirstNumberZero() {
        int numberOne = 0;
        int numberTwo = 1 + (int) (Math.random() * 10);
        int result = MathInteger.exponentiation(numberOne, numberTwo);
        assertEquals(0, result);
    }

    @Test
    public void powZero() {
        int numberOne = 0;
        int numberTwo = 0;
        int result = MathInteger.exponentiation(numberOne, numberTwo);
        assertEquals(1, result);
    }

    @Test
    public void powSecondNumberZero() {
        int numberOne = 1 + (int) (Math.random() * 10);
        int numberTwo = 0;
        int result = MathInteger.exponentiation(numberOne, numberTwo);
        assertEquals(1, result);
    }

    @Test(expected = ArithmeticException.class)
    public void powOverFlow() {
        int numberOne = 999999999;
        int numberTwo = 999999999;
        int result = MathInteger.exponentiation(numberOne, numberTwo);
        assertEquals((int)Math.pow(numberOne, numberTwo), result);
    }

    @Test
    public void residuePositive() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.residue(numberOne, numberTwo);
        assertEquals(numberOne % numberTwo, result);
    }

    @Test
    public void residueNegative() {
        int numberOne = -100 + (int) (Math.random() * 99);
        int numberTwo = -100 + (int) (Math.random() * 99);
        int result = MathInteger.residue(numberOne, numberTwo);
        assertEquals(numberOne % numberTwo, result);
    }

    @Test
    public void residueFirstNumberZero() {
        int numberOne = 0;
        int numberTwo = 1 + (int) (Math.random() * 100);
        int result = MathInteger.residue(numberOne, numberTwo);
        assertEquals(0, result);
    }

    @Test(expected = ArithmeticException.class)
    public void residueSecondNumberZero() {
        int numberOne = 1 + (int) (Math.random() * 100);
        int numberTwo = 0;
        int result = MathInteger.residue(numberOne, numberTwo);
        assertEquals(numberOne % numberTwo, result);
    }
}