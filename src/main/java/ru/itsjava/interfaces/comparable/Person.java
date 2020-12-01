package ru.itsjava.interfaces.comparable;

import lombok.Data;

@Data
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public int compareTo(Person person) {
        if (surname.equalsIgnoreCase(person.surname) ) {
            return 0;
        } else if (name.equalsIgnoreCase(person.name)) {
            return 0;
        } else if (age == person.age) {
            return 0;
        }
        else return -1;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
