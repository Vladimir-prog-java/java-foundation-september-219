package ru.itsjava.interfaces;

public class BadGin implements Creatable {
    @Override
    public void createWish() {
        System.out.println("Слушаю и повинуюсь! Но я тебя подставил");
    }
}
