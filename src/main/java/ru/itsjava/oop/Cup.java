package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cup {
    private String color;

    public Cup(String color) {
        this.color = color;
    }


}
