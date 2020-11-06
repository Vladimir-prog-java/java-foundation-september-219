package ru.itsjava.oop;
public class Jungle {
    public static void main(String[] args) {
        Lion shram = new Lion("Shram");
        shram.printLion();
        shram.setName("Король Шрам");
        shram.printLion();
        System.out.println("В наших джунглях есть: " + shram.getName());
        System.out.println("Количество лап " + shram.getName() + ":" + shram.getPawsCount());

    Hyena shenzi = new Hyena("Шензи", 2, 15);
    Hyena banzai = new Hyena("Банзай", 3, 18);
    Hyena ed = new Hyena("Эд", 3, 19);
    shenzi.printHyena();

    }
}
//
