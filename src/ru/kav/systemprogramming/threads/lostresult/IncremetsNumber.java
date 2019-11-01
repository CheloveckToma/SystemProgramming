package ru.kav.systemprogramming.threads.lostresult;

class IncremetsNumber extends Thread {
    public static int i = 0;
    IncremetsNumber task;
    IncremetsNumber checker;

    IncremetsNumber(IncremetsNumber checker) {
        this.checker = checker;
    }

    public void run() {
        }


    int increment() {
        return i++;
    }

    int getI() {
        return i;
    }
}
