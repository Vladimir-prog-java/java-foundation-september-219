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

        BritishCat marusya = new BritishCat();
        marusya.sayMeow();
//        marusya.sayMrr();
        System.out.println("marusya.getBreed() = " + marusya.getBreed());
//        Cat marusya1 = new BritishCat(); //ссылка на класс Cat , мы не увидим методы класса BritisCat
//        marusya.sayMeow();

        Caw masha = new Caw("red", "red");
        Caw borya = new Caw("tagilskaya", "black&white");
        Caw petr = new Caw("dutch", "black&white");
        Caw dasha = new Caw("yaroslavl", "black");
        Caw sasha = new Caw("red-mottled", "red&mottled");

        masha.setNameBreed("dutch");
        System.out.println("Теперь порода коровы Маши: " + masha.getNameBreed());
        borya.setNameBreed("red");
        System.out.println("Теперь порода коровы Бори: " + borya.getNameBreed());

    }
}
//
