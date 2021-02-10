package ru.itsjava.annotations;


import lombok.RequiredArgsConstructor;
import ru.itsjava.annotations.junit.annotation.MyAnnotation;

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
