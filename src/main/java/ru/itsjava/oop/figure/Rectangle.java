package ru.itsjava.oop.figure;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double area;
    private double perimeter;

    public double getArea(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = this.sideA;
        this.sideB = this.sideB;
        this.sideC = this.sideC;
        this.sideD = this.sideD;

        area = sideA * sideB;
        return area;
    }

    public double getPerimeter(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = this.sideA;
        this.sideB = this.sideB;
        this.sideC = this.sideC;
        this.sideD = this.sideD;

        perimeter = sideA + sideB + sideC + sideD;
        return perimeter;
    }

}
