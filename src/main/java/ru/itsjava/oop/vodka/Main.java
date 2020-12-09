package ru.itsjava.oop.vodka;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

Vodka smirnoff = new Vodka("Smirnoff", 1.0, 40,1200);
Vodka beluga = new Vodka("Beluga", 43,3000);
beluga.drinkTooMuch();
smirnoff.drinkTooMuch("Давай еще чуть-чуть!");

    }
}
