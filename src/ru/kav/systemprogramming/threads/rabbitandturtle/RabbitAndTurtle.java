package ru.kav.systemprogramming.threads.rabbitandturtle;

public class RabbitAndTurtle {
    public static void main(String[] args) {
        Thread turtle = new AnimalThread("turtle", 1);
        Thread rabbit = new AnimalThread("rabbit", 10);
        turtle.start();
        rabbit.start();
    }
}
