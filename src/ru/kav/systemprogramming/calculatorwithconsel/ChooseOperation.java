package ru.kav.systemprogramming.calculatorwithconsel;

public class ChooseOperation {
    public static int calculations(int firstNumber, int secondNumber, String sign) {
        int result = 0;
        switch (sign) {
            case "+":
                result = MathInteger.addition(firstNumber, secondNumber);
                break;
            case "-":
                result = MathInteger.subtraction(firstNumber, secondNumber);
                break;
            case "*":
                result = MathInteger.multiplication(firstNumber, secondNumber);
                break;
            case "/":
                result = MathInteger.division(firstNumber, secondNumber);
                break;
            case "^":
                result = MathInteger.exponentiation(firstNumber, secondNumber);
                break;
            case "%":
                result =MathInteger.residue(firstNumber, secondNumber);
                break;
        }
        return result;
    }

}
