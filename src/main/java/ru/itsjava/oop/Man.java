package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class Man extends Person {
    private String name;
    private int age;



    @Override
    public void setMale(boolean isMale) {

        isMale = true;
    }
}
