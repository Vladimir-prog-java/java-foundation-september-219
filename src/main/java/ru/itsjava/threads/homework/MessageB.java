package ru.itsjava.threads.homework;

import lombok.SneakyThrows;

public class MessageB implements Runnable{
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            Thread.sleep(2000);
            System.out.print("Message B ");
        }

    }
}
