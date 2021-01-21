package ru.itsjava.threads.homework;

import lombok.SneakyThrows;

public class MessageA extends Thread {
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.print("Message A ");
        }
    }
}
