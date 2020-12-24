package ru.itsjava.threads.lecture1;

import java.util.List;

public class ThreadPractice {
    public static void main(String[] args) {
        //Написать букву A 8 раз
        String str = "A ";
//        for (int i = 0; i < 8; i++) {
//            System.out.print(str);
//        }
//Написать букву А с некоторой задержкой примерно 2 секунды
//        for (int i = 0; i < 8; i++) {
//            //for (int j = 0; j < 2_000_000_000L; j++) {
//           // }
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.print(str);
//        }


        // Печать А раз в 2 секунды и печать В раз в 3 секунды (каждая по 6 раз)
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        // Печать      А B A  A&B  A B  A    A&B       B        B

        Thread threadA = new PrinterA();
        threadA.start();

//        Runnable runnableB = new PrinterB();
//        Thread threadB = new Thread(runnableB);
//        threadB.start();
//то же самое
        Thread threadB = new Thread(new PrinterB());
        threadB.start();
// АНОНИМНЫЙ КЛАСС
//        Runnable runnableC = new Runnable() {
//            @SneakyThrows
//            @Override
//            public void run() {
//                for (int i = 0; i < 6; i++) {
//                    Thread.sleep(1000);
//                    System.out.print("C ");
//                }
//            }
//        };


        Runnable runnableC = () -> {
            for (int i = 0; i < 6; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("C ");
            }
        };
        new Thread(runnableC).start();

        List.of("Str1", "Str2").forEach(System.out::println);
    }
}
