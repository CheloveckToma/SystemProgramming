package ru.kav.systemprogramming.readandwritefile.writefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWrite {

    /**
     * выполняет запись в файл
     * @param listOfResults - список резуьлтатов выражений
     * @param path - пусть по которуому нужно записать
     */

    public static void fileWrite(ArrayList listOfResults, String path) {

        try(FileWriter fileWriter = new FileWriter(path); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {


            for (int i = 0; i < listOfResults.size(); i++) {
                bufferedWriter.write(listOfResults.get(i) + "\n");
            }

            bufferedWriter.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

}
