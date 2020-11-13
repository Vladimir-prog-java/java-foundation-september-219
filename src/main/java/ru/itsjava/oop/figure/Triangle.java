package ru.itsjava.oop.figure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;//высота от основания до вершины
    private double area;
    private double perimeter;


    public double getArea(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = this.sideA;
        this.sideB = this.sideB;
        this.sideC = this.sideC;
        this.sideD = this.sideD;
        area = 0.5 * sideC * sideD;
        return area;
    }


    public double getPerimeter(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = this.sideA;
        this.sideB = this.sideB;
        this.sideC = this.sideC;
        this.sideD = this.sideD;

        perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}
