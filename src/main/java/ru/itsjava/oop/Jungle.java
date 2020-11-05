package ru.itsjava.oop;

public class Jungle {
    public static void main(String[] args) {
        Lion shram = new Lion("Shram");
        shram.printLion();
        shram.setName("Король Шрам");
        shram.printLion();

        System.out.println("В наших джунглях есть: " + shram.getName());
        System.out.println("Количество лап " + shram.getName() + ":" + shram.getPawsCount());
    }
}
