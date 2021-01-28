package ru.itsjava.core;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static int even;
    public static int odd;

    @SneakyThrows
    public static void main(String[] args) {
//        int num = 5;
//        System.out.println("num++ = " + num++);
//        System.out.println("After incr: num = " + num);
//        System.out.println("++num = " + ++num);
//
//        System.out.println("1" + 2 + 3);
//        System.out.println("1" + (2 + 3));
//        System.out.println(num++ + ++num);
//

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());


        while (number % 10 > 0) {
            int oneNumber = number % 10;
            if (oneNumber % 2 == 0) {
                even++;
            } else odd++;
            number = number / 10;
        }
        int a = even;
        int b = odd;
        System.out.println("Even: " + a + " Odd: " + b);
    }


}

