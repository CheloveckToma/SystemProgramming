package ru.kav.systemprogramming.mathinteger;

import java.util.Scanner;

public class MainOfMathInteger {

    public static void main(String[] args) {
        System.out.println("Enter an example");
        try {
            String expression = inputWithConsel();
            MathInteger.dataCheckWithConsole(expression);
            MathInteger.someOperationWithExpression(expression);
                int result = MathInteger.calculator(MathInteger.firstNumber,MathInteger.secondNumber);
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


