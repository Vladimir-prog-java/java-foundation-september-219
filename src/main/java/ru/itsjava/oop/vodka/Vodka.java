package ru.itsjava.oop.vodka;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Vodka {
    private String name;
    private double volume;
    private int strong;
    private double price;

    public Vodka(String name, int strong, double price) {
        this.name = name;
        this.strong = strong;
        this.price = price;
    }

    public void drinkTooMuch(){
        System.out.println("На сегодня достаточно!");

    }
    public void drinkTooMuch(String str){
        System.out.println(str);

    }

}
