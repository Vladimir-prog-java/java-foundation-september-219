package ru.itsjava.collection.list.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private final String sex;
    private final int age;
    private final String name;

//    public Person(String sex, int age, String name) {
//        this.sex = sex;
//        this.age = age;
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }

}
