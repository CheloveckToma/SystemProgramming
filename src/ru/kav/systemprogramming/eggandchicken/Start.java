package ru.kav.systemprogramming.eggandchicken;

public class Start {
    public static void main(String[] args) {
        ConflictEggAndChicken egg = new ConflictEggAndChicken("egg");
        ConflictEggAndChicken chicken = new ConflictEggAndChicken("chicken");


        try {
            egg.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (chicken.thread.isAlive()){
            System.out.println("Курица появилась первой!");
        }else{
            System.out.println("Яйцо появилось первым!");
        }
    }

}
