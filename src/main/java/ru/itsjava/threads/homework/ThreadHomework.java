package ru.itsjava.threads.homework;

import lombok.SneakyThrows;

public class ThreadHomework {
    @SneakyThrows
    public static void main(String[] args) {
        Thread threadMessageA = new MessageA();
        threadMessageA.start();

        Thread threadMessageB = new Thread(new MessageB());
        threadMessageB.start();


        for (int i = 0; i < 5; i++) {
            Thread.sleep(5000);
            System.out.println("Любое сообщение раз в 5 секунд");
        }
        final Messenger monitor = new Messenger();
        new ThreadMessenger("Hello", 3, monitor).start();
        new ThreadMessenger("OK", 3, monitor).setDaemon(true);
        new ThreadMessenger("By", 3, monitor).start();


        Thread myThread1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток1");
        });
       myThread1.start();

        Thread myThread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Deamon");
        });
        myThread2.setDaemon(true);
        myThread2.start();

        Thread myThread3 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток3");
        });
        myThread3.start();

    }
}
