package ru.itsjava.interfaces;

public class Man implements Runnable, Swimable, Walkable {

    @Override
    public void run() {
        System.out.println("Бежим марафон 30км!");
    }

    @Override
    public int maxRunDistance() {
        return 30;
    }

    @Override
    public void swim() {
        System.out.println("Переплыть Ламанш!");
    }

    @Override
    public double maxSwimSpeed() {
        return 5;
    }

    @Override
    public void walk() {
        System.out.println("Сегодня гуляем в парке!");
    }
}
