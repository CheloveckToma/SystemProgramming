package ru.kav.systemprogramming.mathIntegerwithfile;

import ru.kav.systemprogramming.mathinteger.MathInteger;

import java.io.*;
import java.util.ArrayList;

/**
 * IntegerWithFileMain выполняет запуск пограммы, считывание файла, запись в файл
 */

public class IntegerWithFileMain {
    public static ArrayList arrayList = new ArrayList();
    public static String expression = "";

    public static void main(String[] args) {
        try {
            readWithFile();
            writeToFile();

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Invalid data format");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Oops...something went wrong");
            e.printStackTrace();
        }

    }

    /**
     * readWithFile выполняет считывание файла
     */

    public static void readWithFile() {
        try {
            FileReader fileReader = new FileReader("src\\ru\\kav\\systemprogramming\\mathIntegerwithfile\\fileOne.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((expression = bufferedReader.readLine()) != null) {
                boolean resultOfDataCheckWithFile = MathInteger.dataCheckWithFile(expression);
                if (!expression.equals("") && resultOfDataCheckWithFile) {
                    MathInteger.someOperationWithExpression(expression);
                    int result = MathInteger.calculator(MathInteger.firstNumber, MathInteger.secondNumber);
                    arrayList.add(result);
                } else {
                    String read = "Неверный ввод!";
                    arrayList.add(read);
                }
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * writeToFile выполняет запись в файл
     */

    public static void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter("src\\ru\\kav\\systemprogramming\\mathIntegerwithfile\\fileTwo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < arrayList.size(); i++) {
                String number = arrayList.get(i).toString();
                bufferedWriter.write(number + "\n");
            }
            bufferedWriter.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
