package ru.kav.systemprogramming.copywithnioalong;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long firstTime = System.currentTimeMillis();
        Thread firstThread = new CopyNIO("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteOne.txt");
        Thread secondThread = new CopyNIO("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteTwo.txt");
        firstThread.join();
        secondThread.join();
        long secondTime = System.currentTimeMillis();
        System.out.println(secondTime - firstTime);

    }
}
