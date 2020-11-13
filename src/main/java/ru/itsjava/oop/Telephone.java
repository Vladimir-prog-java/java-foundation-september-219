package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Telephone {
    private int value;

    public Telephone(int value) {
        this.value = value;
    }
}
