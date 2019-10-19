package ru.kav.systemprogramming.multiplication;

/**
 * Умножение без оператора умножения
 */


import java.util.Scanner;

/**
 * Класс multiplication выводит произведение двух множителей
 *
 * @author Кувшинов А.В 17ИТ18
 */
public class Multiplications {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstOperand = sc.nextInt();
        System.out.println("Введите второе число");
        int secondOperand = sc.nextInt();
        System.out.println(Multiplications.multiplication(firstOperand, secondOperand));
    }

    /**
     * Производит умножение двух множителей
     *
     * @param firstOperand - первый множитель
     * @param secondOperand - второй множитель
     * @return произведение первого и второго множителя
     */

    public static int multiplication(int firstOperand, int secondOperand) {

        /**
         * если одно из чисел равно нулю то возвращаетт нуль
         */
        if (firstOperand == 0 || secondOperand == 0) {
            return 0;
        }

        /**
         * меняет знак первого операнда
         */

        int negativeNumber = 0;
        if (firstOperand < 0) {
            firstOperand = -firstOperand;
            negativeNumber++;
        }

        /**
         * меняет знак второго операнда
         */

        if (secondOperand < 0) {
            secondOperand = -secondOperand;
            negativeNumber++;
        }

        /**
         * меняет первое и второе число местами
         */

        if (firstOperand > secondOperand) {
            int variable = firstOperand;
            firstOperand = secondOperand;
            secondOperand = variable;
        }

        /**
         * определяет четность второго числа
         */

        boolean valueOfParity = false;
        if (secondOperand % 2 != 0) {
            secondOperand++;
            valueOfParity = true;
        }

        int endResult = 0;
        for (int i = 0; i < secondOperand/2; i++) {
            endResult += firstOperand + firstOperand;
        }

        /**
         * вычитает из рузультата первое число
         */

        if (valueOfParity) {
            endResult -= firstOperand;
        }

        /**
         * меняет знак рузльтата
         */

        if (negativeNumber == 1) {
            endResult = -endResult;
        }

        return endResult;
    }
}

