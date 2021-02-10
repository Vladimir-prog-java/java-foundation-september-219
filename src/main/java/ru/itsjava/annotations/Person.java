package ru.itsjava.annotations;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@MyAnnotation(message = "Я персона номер один", isFlag = true)
@RequiredArgsConstructor
public class Person {
    private String name;
    private boolean isGood = false;

    public Person(String valeriy) {
    }

    // public Person(String valeriy) {
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", isGood=" + isGood +
                '}';
    }
}
