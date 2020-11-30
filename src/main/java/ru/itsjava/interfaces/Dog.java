package ru.itsjava.interfaces;

public class Dog implements Walkable, Runnable, Swimable {

    @Override
    public void run() {
        System.out.println("Сейчас догоню!");
    }

    @Override
    public int maxRunDistance() {
        return 50;
    }

    @Override
    public void swim() {
        System.out.println("Вода холодная, лезь сам!");
    }

    @Override
    public double maxSwimSpeed() {
        return 0;
    }

    @Override
    public void walk() {
        System.out.println("Никогда не поздно меня выгулять!");
    }
}
