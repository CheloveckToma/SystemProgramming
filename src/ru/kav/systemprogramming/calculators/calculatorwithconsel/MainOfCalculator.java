package ru.kav.systemprogramming.calculators.calculatorwithconsel;

import java.util.Scanner;

public class MainOfCalculator {

    public static void main(String[] args) {
        System.out.println("Enter an example");

        try {
            String expression = inputWithConsel();
            DataCheck.dataCheckWithConsole(expression);
            String[] splitedExpression = Split.splitListOfExpression(expression);
            int firstOperand = IntegerInNumbers.integerStringMassive(splitedExpression,0);
            int secondOperand = IntegerInNumbers.integerStringMassive(splitedExpression,2);
            String sign = splitedExpression[1];
            int result = ChooseOperation.calculations(firstOperand,secondOperand,sign);
            System.out.println("Ответ: " + result);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Invalid data format");
        } catch (Exception e) {
            System.err.println("Oops...something went wrong");
        }

    }

    public static String inputWithConsel() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        return expression;
    }
}


