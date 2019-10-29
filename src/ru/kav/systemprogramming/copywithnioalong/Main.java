package ru.kav.systemprogramming.copywithnioalong;

public class Main {
    public static void main(String[] args) {

        Thread firstThread = new CopyNIO("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteOne.txt");
        Thread secondThread = new CopyNIO("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteTwo.txt");



    }
}
