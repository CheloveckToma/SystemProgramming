package ru.kav.systemprogramming.banksbaccount;

import ru.kav.systemprogramming.banksbaccount.exceptions.NegativeMoneyException;

public class Deposit extends Thread {

    Account account;
    long moneyForDeposit;

    public Deposit(Account account, long moneyForDeposit) {
        this.moneyForDeposit = moneyForDeposit;
        this.account = account;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                account.deposit(moneyForDeposit);
                System.out.println(account.getBalance());
            }
        } catch (NegativeMoneyException e) {
            e.printStackTrace();
        }
    }
}

