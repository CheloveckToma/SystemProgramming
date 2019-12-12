package ru.kav.systemprogramming.banksbaccount;

import ru.kav.systemprogramming.banksbaccount.exceptions.NegativeBalanceException;

public class Withdraw extends Thread {
    Account account;
    long moneyForWithdraw;

    public Withdraw(Account account, long moneyForWithDraw) {
        this.account = account;
        this.moneyForWithdraw = moneyForWithDraw;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                account.withdraw(moneyForWithdraw);
            } catch (NegativeBalanceException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
