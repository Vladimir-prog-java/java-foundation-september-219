package ru.itsjava.oop;

public class Panter extends Cat{

    public Panter(String breed) {
        super(breed);
    }

    @Override
    public void sayMeow() {
        System.out.println("RRRRRR");
    }
}
