package ru.itsjava.exceptions;

public class Person {
    private final int age;
private final String name;
    public Person(int age, String name) throws IncorrectPersonAgeException {
        this.name = name;
        this.age = age;
        if (age < 0) throw new IncorrectPersonAgeException("Введён некорректный возраст!");


    }
}
