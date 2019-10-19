package ru.kav.systemprogramming.rabbitandturtle;

public class AnimalThread extends Thread {

    String name;
    int priority;

    AnimalThread(String name, int priority) {
        this.name = name;
        this.priority = priority;
        setName(name);
        setPriority(priority);
    }

    public void run() {
        int i;
        for (i = 0; i < 500; i++) {
            if ((i == 100) && (name.equals("rabbit"))) {
                setPriority(1);
                System.out.println("Установка приоритета " + getName() + " на :" + getPriority());
            }
            if ((i == 100) && (name.equals("turtle"))) {
                setPriority(10);
                System.out.println("Установка приоритета " + getName() + " на :" + getPriority());
            }
            System.out.println(getName() + ":" + i);
        }

    }
}
