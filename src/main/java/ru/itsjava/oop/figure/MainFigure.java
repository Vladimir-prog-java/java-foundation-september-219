package ru.itsjava.oop.figure;

public class MainFigure {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println("Площадь треугольника: " + triangle.getArea(2.0, 2.0, 2.0, 3.0));

    }
}
