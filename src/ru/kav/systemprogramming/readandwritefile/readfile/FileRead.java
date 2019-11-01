package ru.kav.systemprogramming.readandwritefile.readfile;

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

        ArrayList listOfExpressions = new ArrayList();

        try(FileReader fileReader = new FileReader(path);BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String expression;

            while ((expression = bufferedReader.readLine()) != null) {
                listOfExpressions.add(expression);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfExpressions;
    }

}
