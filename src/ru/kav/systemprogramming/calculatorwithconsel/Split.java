package ru.kav.systemprogramming.calculatorwithconsel;

import java.util.ArrayList;

public class Split {

    /**
     * splitListOfExpression - выполняет преобразование строки к требуемому виду
     * @param expression - выражение
     * @return
     */

    public static String[] splitListOfExpression(String expression) {
        String[] splitedExpression = expression.split(" ");
        return splitedExpression;
    }

    /**
     * выполняет выделение из списка отдельнго выражения
     * @param listOfExpressions - спсок выражений
     * @param i - индекс выражения в списке
     * @return выражение
     */

    public static String splitListOfExpression(ArrayList listOfExpressions, int i) {
        String[] expression = new String[listOfExpressions.size()];
        expression[i] = listOfExpressions.get(i).toString();
        return expression[i];
    }
}
