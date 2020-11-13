package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private boolean isMale;
    private String name;
    private int age;

    public void printAge(int age) {
        this.age = age;
        System.out.println("Ваш возраст: " + age);
    }
}
