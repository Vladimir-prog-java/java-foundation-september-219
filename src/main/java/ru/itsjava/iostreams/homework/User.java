package ru.itsjava.iostreams.homework;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@ToString
@AllArgsConstructor
public class User implements Serializable {
    private final String name;
    private transient String password;

}
