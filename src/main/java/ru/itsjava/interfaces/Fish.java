package ru.itsjava.interfaces;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("В аквариуме вода теплее!");
    }

    @Override
    public double maxSwimSpeed() {
        return 15;
    }
}
