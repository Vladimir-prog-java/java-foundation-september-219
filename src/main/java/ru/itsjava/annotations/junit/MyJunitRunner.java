package ru.itsjava.annotations.junit;

public class MyJunitRunner {


    public static void main(String[] args) {
        Runner runner = new Runner(MyAmazingTest.class);
        runner.start();

    }
}