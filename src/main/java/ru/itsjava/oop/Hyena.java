package ru.itsjava.oop;

public class Hyena {
    private String name;
    private int age;
    private int weight;

    public Hyena(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void printHyena() {
        System.out.println("Гиена с именем " + name + ", возраст: " + age + " года " + " Вес: " + weight+" кг.");

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
