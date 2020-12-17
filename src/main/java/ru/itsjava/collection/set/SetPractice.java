package ru.itsjava.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Man> men = new HashSet<>();
        Man andrey = new Man("Andrey");


        System.out.println("men.add(andrey) = " + men.add(andrey));
        System.out.println("men.add(andrey) = " + men.add(andrey));
        System.out.println("men.size() = " + men.size());
        Man mark = new Man("Mark");
        men.add(mark);
        System.out.println("men.size() = " + men.size());
        for (Man man : men) {
            System.out.print(man + " ");

        }
        System.out.println();

        Iterator<Man> iterator = men.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Set<Man> manSet = Set.of(andrey, mark);
        for (Man man : manSet) {
            System.out.println(man+" ");
        }
        System.out.println();
    }
}
