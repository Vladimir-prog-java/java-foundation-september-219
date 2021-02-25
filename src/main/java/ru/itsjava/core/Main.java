package ru.itsjava.core;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Main {


    public static int even;
    public static int odd;

    // @SneakyThrows
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
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(reader.readLine());
//
//
//        while (number % 10 > 0) {
//            int oneNumber = number % 10;
//            if (oneNumber % 2 == 0) {
//                even++;
//            } else odd++;
//            number = number / 10;
//        }
//        int a = even;
//        int b = odd;
//        System.out.println("Even: " + a + " Odd: " + b);
//        int[] array = {10,2,3,8,6,9,7,1,2,4};
//        quickSort(array, 0, 9 );
//        for (int s:array) {
//            System.out.println(s);
//
//        }
//    }
//        public static void quickSort(int[] source, int leftBorder, int rightBorder) {
//            int leftMarker = leftBorder;
//            int rightMarker = rightBorder;
//            int pivot = source[(leftMarker + rightMarker) / 2];
//            do {
//                // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
//                while (source[leftMarker] < pivot) {
//                    leftMarker++;
//                }
//                // Двигаем правый маркер, пока элемент больше, чем pivot
//                while (source[rightMarker] > pivot) {
//                    rightMarker--;
//                }
//                // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
//                if (leftMarker <= rightMarker) {
//                    // Левый маркер будет меньше правого только если мы должны выполнить swap
//                    if (leftMarker < rightMarker) {
//                        int tmp = source[leftMarker];
//                        source[leftMarker] = source[rightMarker];
//                        source[rightMarker] = tmp;
//                    }
//                    // Сдвигаем маркеры, чтобы получить новые границы
//                    leftMarker++;
//                    rightMarker--;
//                }
//            } while (leftMarker <= rightMarker);
//
//            // Выполняем рекурсивно для частей
//            if (leftMarker < rightBorder) {
//                quickSort(source, leftMarker, rightBorder);
//            }
//            if (leftBorder < rightMarker) {
//                quickSort(source, leftBorder, rightMarker);
//            }
//        }


    }
}
