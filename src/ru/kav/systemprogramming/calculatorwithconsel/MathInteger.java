package ru.kav.systemprogramming.calculatorwithconsel;

/**
 * класс MathInteger выполняет умножение, деление, сложени, вычетание, нахождение остатка, возведение в степень.
 *
 * @author Кувшинов А.В  17ИТ18
 */
public class MathInteger {

    /**
     * метод выполняет сложение
     *
     * @param x первое число
     * @param y второе число
     * @return сумму чисел
     */

    public static int addition(int x, int y)    {
        int r = x + y;
        if (((x ^ r) & (y ^ r)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return r;
    }

    /**
     * метод выполняет вычетания
     *
     * @param x первое число
     * @param y второе число
     * @return рузультат вычетания
     */

    public static int subtraction(int x, int y) {
        int r = x - y;
        if (((x ^ y) & (x ^ r)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return r;
    }

    /**
     * метод выполняет умножение
     *
     * @param x первое число
     * @param y второе число
     * @return произведение чисел
     */

    public static int multiplication(int x, int y) {
        long r = (long) x * (long) y;
        if ((int) r != r) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) r;
    }

    /**
     * метод выполняет деление
     *
     * @param x первое число
     * @param y второе число
     * @return результат деления
     */

    public static int division(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("You can't divide by zero!");
        }
        int r = x / y;
        if ((x ^ y) < 0 && (r * y != x)) {
            r--;
        }

        return r;
    }

    /**
     * метод выполняет возведение в степень
     *
     * @param x основание
     * @param y степень
     * @return результат возведения в степень
     */

    public static int exponentiation(int x, int y) {
        long r = 1;
        for (int i = 0; i < y; i++) {
            r = r * x;
        }
        if ((int) r != r) {
            throw new ArithmeticException("integer overflow");
        }
        if (y < 0) {
            throw new ArithmeticException("Negative power forbidden!");
        }
        return (int) r;
    }

    /**
     * метод выполняет выделение остатка
     *
     * @param x первое число
     * @param y второе число
     * @return остаток от деления
     */
    public static int residue(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("You can't divide by zero!");
        }
        int r = x % y;

        return r;
    }
}