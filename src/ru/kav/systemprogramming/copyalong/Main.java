package ru.kav.systemprogramming.copyalong;

public class Main {
    public static void main(String[] args) {
        Thread threadOne = new CopyFile("src\\\\ru\\\\kav\\\\systemprogramming\\\\copyalong\\\\firstThread.txt",
                "src\\\\ru\\\\kav\\\\systemprogramming\\\\copyalong\\\\firstThread.txt");
        Thread threadTwo = new CopyFile("src\\\\ru\\\\kav\\\\systemprogramming\\\\copyalong\\\\secondThread.txt",
                "src\\\\ru\\\\kav\\\\systemprogramming\\\\copyalong\\\\secondThread.txt");

    }
}
