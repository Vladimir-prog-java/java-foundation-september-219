package ru.itsjava.oop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notebook {
    private String modelName;

    public Notebook(String modelName) {
        this.modelName = modelName;
    }
}
