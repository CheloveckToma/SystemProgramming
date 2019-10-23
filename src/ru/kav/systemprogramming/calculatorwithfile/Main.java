package ru.kav.systemprogramming.calculatorwithfile;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ведите путь для файла ввода");
            ArrayList listOfExpressions = new ArrayList();
            listOfExpressions = FileRead.readFile(sc.nextLine());
            ArrayList listOfResults = new ArrayList();
            listOfResults = Launch.сalculations(listOfExpressions);
            //src\\ru\\kav\\systemprogramming\\mathIntegerwithfile\\fileOne.txt
            System.out.println("Введите путь для файла вывода");
            FileWrite.fileWrite(listOfResults, sc.nextLine());
            //src\\ru\\kav\\systemprogramming\\mathIntegerwithfile\\fileTwo.txt


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

}
