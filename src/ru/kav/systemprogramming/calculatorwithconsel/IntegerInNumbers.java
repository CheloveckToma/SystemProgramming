package ru.kav.systemprogramming.calculatorwithconsel;

public class IntegerInNumbers {

    /**
     * выполняет преоброзование части массива строк в целочисленное значение
     * @param splitedExpression - разделенное выражение
     * @return
     */

    public static int integerStringMassive(String[] splitedExpression, int i) {
        return Integer.parseInt(splitedExpression[i]);
    }
}
