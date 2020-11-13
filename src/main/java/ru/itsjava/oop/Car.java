package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }
}
