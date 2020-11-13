package ru.itsjava.oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<Person> list = new ArrayList<>();
        Man vasia = new Man("Вася", 23);
        list.add(vasia);
        count++;
        Woman masha = new Woman("Маша", 22);
        list.add(masha);
        count++;
        Man petr = new Man("Пётр", 33);
        list.add(petr);
        count++;
        Woman dasha = new Woman("Даша", 32);
        list.add(dasha);
        count++;
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).getAge());
        }


    }
//    public ArrayList addPerson(Person){
//return addPerson();
//    }
}
