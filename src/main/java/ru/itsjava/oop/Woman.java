package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Woman extends Person {
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void setMale(boolean isMale) {
        isMale = false;
    }

    @Override
    public void printAge(int age) {
        System.out.println("Всегда 18!");
    }

}
