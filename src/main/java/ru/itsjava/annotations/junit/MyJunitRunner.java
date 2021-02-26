package ru.itsjava.annotations.junit;

import java.lang.reflect.InvocationTargetException;

public class MyJunitRunner {


    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Runner runner = new Runner(MyAmazingTest.class);
        runner.start();

    }
}