package ru.itsjava.threads.homework;

public class Messenger {
    public synchronized void print(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(message + " ");
        }

    }
}
