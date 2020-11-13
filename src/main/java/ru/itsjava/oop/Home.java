package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Home {
    private int area;

    public Home(int area) {
        this.area = area;
    }
}
