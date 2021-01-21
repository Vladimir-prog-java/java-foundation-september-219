package ru.itsjava.threads.homework;

import lombok.AllArgsConstructor;
import ru.itsjava.threads.lecture2.Printer;
@AllArgsConstructor
public class ThreadMessenger extends Thread{
    private String message;
    private final int count;
    private final Messenger messenger;


    @Override
    public void run() {
        messenger.print(message, count);
    }
}
