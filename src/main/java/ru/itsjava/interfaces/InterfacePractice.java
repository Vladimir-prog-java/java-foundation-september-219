package ru.itsjava.interfaces;

public class InterfacePractice {
    public static void main(String[] args) {
        Gin khotabich=new Gin();
        khotabich.createWish();
        Creatable badGin= new BadGin();
        badGin.createWish();

    }
    public void canFly(){
        System.out.println("Я не умею летать. Нужен ковер самолет");
    }

}

