package ru.itsjava.interfaces;

public class Main {
    public static void main(String[] args) {

        Man man = new Man();
        man.run();
        System.out.println("Сегодня пробежали " + man.maxRunDistance() + "км");
        man.swim();
        System.out.println("Ламанш взят! Средняя скорость - " + man.maxSwimSpeed() + "км");
        man.walk();
        System.out.println();

        Dog doggy = new Dog();
        doggy.run();
        System.out.println("Сколько бежать за тобой!? Уже и так пробежал " + doggy.maxRunDistance() + "км");
        doggy.swim();
        System.out.println("Сегодня крейсерская скорость пёсика - " + doggy.maxSwimSpeed() + "км");
        doggy.walk();
        System.out.println();

        Cat barsik = new Cat();
        barsik.run();
        System.out.println("Без сметаны Ваш кот пробежал: " + barsik.maxRunDistance() + "км");
        barsik.swim();
        barsik.walk();
        System.out.println();

        Bird chizik= new Bird();
        chizik.fly();
        System.out.println(chizik.sing());
        System.out.println();

        Fish fish = new Fish();
        fish.swim();
        System.out.println("Сегодня могу выжать только "+ fish.maxSwimSpeed()+"км/ч");

    }
}