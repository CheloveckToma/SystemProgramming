package ru.kav.systemprogramming.eggandchicken;

public class ConflictEggAndChicken implements Runnable {

    Thread thread;


    public ConflictEggAndChicken(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName());
        }
    }
}
