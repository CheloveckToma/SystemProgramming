package ru.kav.systemprogramming.banksbaccount;

import javax.swing.plaf.TableHeaderUI;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        long moneyForDeposit = 5;// 0 + (int) (Math.random()*100);
        long moneyForWithdraw = 100;
        Thread depositThread = new Deposit(account, moneyForDeposit);
        Thread withdrawThread = new Withdraw(account, moneyForWithdraw);
        withdrawThread.start();
        depositThread.start();

        try {
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
