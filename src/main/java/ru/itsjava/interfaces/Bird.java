package ru.itsjava.interfaces;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Улетела в теплые страны!");
    }

    @Override
    public String sing() {
        String song = "Зимой не пою!";
        return song;
    }
}
