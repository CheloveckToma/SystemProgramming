package ru.kav.systemprogramming.banksbaccount;

import ru.kav.systemprogramming.banksbaccount.exceptions.NegativeBalanceException;
import ru.kav.systemprogramming.banksbaccount.exceptions.NegativeMoneyException;

public class Account {

    private long balance;

    public Account() {
        this(0);
    }

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public synchronized void deposit(long money) throws NegativeMoneyException {
        if (!isMoneyCorrect(money)) {
            throw new NegativeMoneyException();
        }
        balance = balance + money;
        notify();
    }

    public synchronized void withdraw(long money) throws NegativeBalanceException,InterruptedException {

        while (isBalanceCorrect(money)){
                wait();
        }

        if (!isMoneyCorrect(money)) {
            throw new NegativeBalanceException();
        }

        balance = balance - money;

    }

    public boolean isMoneyCorrect(long money) {
        return money > 0;
    }

    public boolean isBalanceCorrect(long money) {
        return balance < money;
    }
}
