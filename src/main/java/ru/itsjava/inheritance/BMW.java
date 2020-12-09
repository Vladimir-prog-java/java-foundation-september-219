package ru.itsjava.inheritance;

public class BMW extends Car implements Movable {
    @Override
    public String getCarMake() {
        return "BMW";
    }

    @Override
    public void move() {
        System.out.println(getCarMake()+"move!");
    }
}
