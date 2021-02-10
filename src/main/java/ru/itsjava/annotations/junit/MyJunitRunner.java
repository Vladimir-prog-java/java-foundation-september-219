package ru.itsjava.annotations.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyJunitRunner {
    public static void main(String[] args) {
        int passedTests = 0;
        int failedTests = 0;

        MyAmazingTest myAmazingTest = new MyAmazingTest();

        Method[] declaredMethodsMyAmazingTest = MyAmazingTest.class.getDeclaredMethods();
        for (Method method : declaredMethodsMyAmazingTest) {
            try {
                method.invoke(myAmazingTest);
                System.out.println("Тест" + method.getName() + "успешно прошел");
                passedTests++;
            } catch (Throwable throwable) {
                failedTests++;
                throwable.printStackTrace();
                System.err.println("Тест" + method.getName() + "упал");

            }


        }
        System.out.println("Количество пройденых тестов:" + passedTests);
        System.out.println("Количество упавших тестов:" + failedTests);
    }
}