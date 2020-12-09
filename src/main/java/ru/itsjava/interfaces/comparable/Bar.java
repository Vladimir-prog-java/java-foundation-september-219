package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class Bar {
    public static void main(String[] args) throws CloneNotSupportedException {
Bottle waterBottle= new Bottle("glass", 0.5);
        Bottle wiskeyBottle= new Bottle("glass", 0.7);
        Bottle colaBottle= new Bottle("plastic", 1.5);
Bottle[] bottles={waterBottle, wiskeyBottle,colaBottle};
        System.out.println("Перед сортировкой"+Arrays.toString(bottles));

        Arrays.sort(bottles);
        System.out.println(Arrays.toString(bottles));
        System.out.println("waterBottle.clone() = " + waterBottle.clone());
    }
}
