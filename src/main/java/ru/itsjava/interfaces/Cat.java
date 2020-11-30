package ru.itsjava.interfaces;

public class Cat implements Walkable, Runnable, Swimable {
    @Override
    public void run() {
        System.out.println("Сегодня мне лень бегать!");
    }

    @Override
    public int maxRunDistance() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Ты с ума сошёл?!");
    }

    @Override
    public double maxSwimSpeed() {
        return 0;
    }

    @Override
    public void walk() {
        System.out.println("Гуляю когда захочу!");
    }
}
