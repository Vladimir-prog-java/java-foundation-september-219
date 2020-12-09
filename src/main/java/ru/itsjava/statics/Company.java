package ru.itsjava.statics;

public class Company {
    public static void main(String[] args) {
        Salary cleanersSalary = new Salary(10000);
        Salary ceoSalary = new Salary(100000);
        Salary.increaseCoefficient = 5;
        System.out.println("cleanersSalary.getFullSalary() = " + cleanersSalary.getFullSalary());
        System.out.println("ceoSalary.getFullSalary() = " + ceoSalary.getFullSalary());
    }
}
