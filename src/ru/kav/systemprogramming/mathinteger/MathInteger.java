package ru.kav.systemprogramming.mathinteger;

/**
 * класс mathinteger выполняет умножение, деление, сложени, вычетание, нахождение остатка, возведение в степень,
 * деление строки, выбор действия в примере, проверка на правильность ввода примера,перевод переменных массива строк
 * в число.
 *
 * @author Кувшинов А.В  17ИТ18
 */
public class MathInteger {

    public static String sign;
    public static int firstNumber;
    public static int secondNumber;

    /**
     * someOperationWithExpression - выполняет преобразование строки к требуемогу виду
     * @param expression - пример
     * @return
     *
     */
    public static void someOperationWithExpression(String expression) {
        String[] splitedArray = MathInteger.splitString(expression);
        integerOfFirstNumber(splitedArray);
        sign(splitedArray);
        integerOfSecondNumber(splitedArray);
    }

    /**
     *chooseSignAndOperation
     *
     * @param firstNumber - первое число
     * @param secondNumber - второе число
     * @return результат вычислений
     */

    public static int calculator(int firstNumber, int secondNumber) {
        int result = 0;
        switch (sign) {
            case "+":
                result = addition(firstNumber, secondNumber);
                break;
            case "-":
                result = subtraction(firstNumber, secondNumber);
                break;
            case "*":
                result = multiplication(firstNumber, secondNumber);
                break;
            case "/":
                result = division(firstNumber, secondNumber);
                break;
            case "^":
                result = exponentiation(firstNumber, secondNumber);
                break;
            case "%":
                result = residue(firstNumber, secondNumber);
                break;
        }
        return result;
    }

    /**
     * dataCheckWithConsole - выполянет проверку входных данных с консоли
     *
     * @param expression - пример
     * @return - true(если прошело проверку)
     */

    public static boolean dataCheckWithConsole(String expression) {
        if (expression.matches("[+-]?[0-9]+\\s[+-/*^%]?\\s[+-]?[0-9]+")) {
            return true;
        } else {
            throw new ArithmeticException("Incorrect data entry");
        }
    }

    /**
     * dataCheckWithFile - выполняет проверку входных данных
     *
     * @param expression - пример
     * @return true(если прошло проверку), false(если не прошло проверку)
     */
    public static boolean dataCheckWithFile(String expression) {
        if (expression.matches("[+-]?[0-9]+\\s[+-/*^%]?\\s[+-]?[0-9]+")) {
            return true;
        } else {
           return false;
        }
    }

    /**
     * splitString - выполняет деление строки
     * @param expression - пример
     * @return массив символов
     */

    public static String[] splitString(String expression) {
        String[] arrayOfSign = expression.split(" ");
        return arrayOfSign;
    }

    /**
     * integerOfFirstNumber выолняет перевод символа массива в число
     *
     * @param arrayOfSign - массив символов
     */

    public static void integerOfFirstNumber(String[] arrayOfSign) {
        firstNumber = Integer.parseInt(arrayOfSign[0]);
    }

    /**
     * sign - выполняет присваивание переменной элемента массива
     * @param arrayOfSign
     */

    public static void sign(String[] arrayOfSign) {
        sign = arrayOfSign[1];
    }

    /**
     * integerOfSecondNumber выолняет перевод символа массива в число
     *
     * @param arrayOfSign - массив символов
     */

    public static void integerOfSecondNumber(String[] arrayOfSign) {
        secondNumber = Integer.parseInt(arrayOfSign[2]);
    }


    /**
     * метод выполняет сложение
     *
     * @param x первое число
     * @param y второе число
     * @return сумму чисел
     */

    public static int addition(int x, int y) {
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
        return  (int) r;
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