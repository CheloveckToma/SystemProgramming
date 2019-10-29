package ru.kav.systemprogramming.copywithnioalong;

public class Main {
    public static void main(String[] args)  {
        long firstTime = System.currentTimeMillis();
        Thread firstThread = new CopyNIO("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteOne.txt");
        Thread secondThread = new CopyNIO("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteTwo.txt");
        firstThread.start();
        secondThread.start();
        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long secondTime = System.currentTimeMillis();
        System.out.println("Время выполнения программы: " + (secondTime-firstTime));

    }
}
