package ru.kav.systemprogramming.calculators.calculatorwithconsel;

public class DataCheck {

    /**
     * dataCheckWithConsole - выполянет проверку данных с консоли
     *
     * @param expression - пример
     * @return - true(если прошело проверку), ошибку(если не прошёл проверку)
     */

    public static boolean dataCheckWithConsole(String expression) {
        if (expression.matches("[+-]?[0-9]+\\s[+-/*^%]?\\s[+-]?[0-9]+")) {
            return true;
        } else {
            throw new ArithmeticException("Incorrect data entry");
        }
    }

    /**
     * dataCheckWithFile - выполняет проверку данных c файла
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
     * fileDataCheck выполняет проверку выражения
     * @param expression - выражение
     * @return true(если прошло проверку), false(если не прошло проверку)
     */

    public static boolean fileDataCheck(String expression) {
        if ((!(expression.equals(""))) && DataCheck.dataCheckWithFile(expression)) {
            return true;
        } else {
            return false;
        }
    }
}
