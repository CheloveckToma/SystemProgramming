package ru.kav.systemprogramming.threads.tenthread;

public class TenThread extends Thread {
    int number;

    TenThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Поток номер " + number + " cоздан");
    }
}

class MainThread {
    public static void main(String[] arhs) {
        for (int i = 0; i <= 10; i++) {
            Thread thread = (new TenThread(i));
            thread.start();
        }
    }
}

