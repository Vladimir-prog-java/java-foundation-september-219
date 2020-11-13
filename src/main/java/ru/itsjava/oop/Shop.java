package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shop {
    private String name;

    public Shop(String name) {
        this.name = name;
    }
}
