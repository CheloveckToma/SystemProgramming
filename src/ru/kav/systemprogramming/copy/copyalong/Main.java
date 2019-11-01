package ru.kav.systemprogramming.copy.copyalong;

public class Main {
    public static void main(String[] args) {
        long firstTime = System.currentTimeMillis();
        try {
            Thread threadOne = new CopyFile("src\\\\ru\\\\kav\\\\systemprogramming\\\\copyalong\\\\firstThread.txt",
                    "src\\\\ru\\\\kav\\\\systemprogramming\\\\copyalong\\\\firstThread.txt");
            Thread threadTwo = new CopyFile("src\\\\ru\\\\kav\\\\systemprogramming\\\\copyalong\\\\secondThread.txt",
                    "src\\\\ru\\\\kav\\\\systemprogramming\\\\copyalong\\\\secondThread.txt");
            threadOne.start();
            threadTwo.start();
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long secondTime = System.currentTimeMillis();
        System.out.println("Время выполнения программы: " + (secondTime-firstTime));
    }
}
