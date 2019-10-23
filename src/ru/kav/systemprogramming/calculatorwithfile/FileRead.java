package ru.kav.systemprogramming.calculatorwithfile;

import java.io.*;
import java.util.ArrayList;

public class FileRead {

    /**
     * выполняет чтение файла
     *
     * @param path - путь до файла с которого нужно читать
     * @return список выражений
     */

    public static ArrayList readFile(String path) {

        path = "src\\\\ru\\\\kav\\\\systemprogramming\\\\mathIntegerwithfile\\\\fileOne.txt";
        ArrayList listOfExpressions = new ArrayList();

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String expression;

            while ((expression = bufferedReader.readLine()) != null) {
                listOfExpressions.add(expression);
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfExpressions;
    }

}
