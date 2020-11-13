package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Caw {
    private String nameBreed;
    private String color;

    public Caw(String nameBreed, String color) {
        this.nameBreed = nameBreed;
        this.color = color;
    }


}
