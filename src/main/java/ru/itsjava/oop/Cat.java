package ru.itsjava.oop;

import lombok.Getter;

@Getter

public class Cat {
    private String breed;

    public Cat(String breed) {
       // System.out.println("Я родитель - кошка");
        this.breed = breed;
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

}
