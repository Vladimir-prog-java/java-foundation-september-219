package ru.itsjava.collection.set.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {


        Set<Fruit> fruits = new HashSet<>();
        Fruit apple = new Fruit("Apple", 200);
        Fruit pear = new Fruit("Pear", 150);
        Fruit kiwi = new Fruit("Kiwi", 100);
        System.out.println("fruits.add(apple) = " + fruits.add(apple));
        System.out.println("fruits.add(apple) = " + fruits.add(apple));
        System.out.println("fruits.add(kiwi) = " + fruits.add(kiwi));
        System.out.println("fruits.add(pear) = " + fruits.add(pear));
        fruits.remove(pear);
        System.out.println("fruits.contains(kiwi) = " + fruits.contains(kiwi));
        System.out.println("fruits.contains(pear) = " + fruits.contains(pear));

        Iterator<Fruit> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }
    }
}

