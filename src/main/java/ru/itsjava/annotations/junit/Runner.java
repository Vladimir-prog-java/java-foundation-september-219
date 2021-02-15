package ru.itsjava.annotations.junit;

import lombok.SneakyThrows;
import ru.itsjava.annotations.junit.annotation.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Runner {
    Class<? extends Annotation> annotation;

    public void start() {
        int passedTests = 0;
        int failedTests = 0;

        MyAmazingTest myAmazingTest = new MyAmazingTest();
        FindMethod findMethod = new FindMethod();
        annotation = Before.class;
        Method[] methodListBefore = findMethod.findMethodByAnnotation(annotation);
        for (int i = 0; i < methodListBefore.length; i++) {
            if (!(methodListBefore[i] == null)) {
                try {
                    methodListBefore[i].invoke(myAmazingTest);
                    System.out.println("Тест " + methodListBefore[i].getName() + " успешно прошел");
                    passedTests++;
                } catch (Throwable throwable) {
                    failedTests++;
                    throwable.printStackTrace();
                    System.err.println("Тест " + methodListBefore[i].getName() + " упал");

                }
            }
        }

        annotation = BeforeEach.class;
        Method[] methodListBeforeEach = findMethod.findMethodByAnnotation(annotation);
        for (int i = 0; i < methodListBeforeEach.length; i++) {
            if (!(methodListBeforeEach[i] == null)) {
                try {
                    methodListBeforeEach[i].invoke(myAmazingTest);
                    System.out.println("Тест " + methodListBeforeEach[i].getName() + " успешно прошел");
                    passedTests++;
                } catch (Throwable throwable) {
                    failedTests++;
                    throwable.printStackTrace();
                    System.err.println("Тест " + methodListBeforeEach[i].getName() + " упал");

                }
            }
        }
        annotation = Test.class;
        Method[] methodListTest = findMethod.findMethodByAnnotation(annotation);
        for (int i = 0; i < methodListTest.length; i++) {
            if (!(methodListTest[i] == null)) {
                try {
                    methodListTest[i].invoke(myAmazingTest);
                    System.out.println("Тест " + methodListTest[i].getName() + " успешно прошел");
                    passedTests++;
                } catch (Throwable throwable) {
                    failedTests++;
                    throwable.printStackTrace();
                    System.err.println("Тест " + methodListTest[i].getName() + " упал");

                }
            }
        }
        annotation = AfterEach.class;
        Method[] methodListAfterEach = findMethod.findMethodByAnnotation(annotation);
        for (int i = 0; i < methodListAfterEach.length; i++) {
            if (!(methodListAfterEach[i] == null)) {
                try {
                    methodListAfterEach[i].invoke(myAmazingTest);
                    System.out.println("Тест " + methodListAfterEach[i].getName() + " успешно прошел");
                    passedTests++;
                } catch (Throwable throwable) {
                    failedTests++;
                    throwable.printStackTrace();
                    System.err.println("Тест " + methodListAfterEach[i].getName() + " упал");

                }
            }
        }
        annotation = After.class;
        Method[] methodListAfter = findMethod.findMethodByAnnotation(annotation);
        for (int i = 0; i < methodListAfter.length; i++) {
            if (!(methodListAfter[i] == null)) {
                try {
                    methodListAfter[i].invoke(myAmazingTest);
                    System.out.println("Тест " + methodListAfter[i].getName() + " успешно прошел");
                    passedTests++;
                } catch (Throwable throwable) {
                    failedTests++;
                    throwable.printStackTrace();
                    System.err.println("Тест " + methodListAfter[i].getName() + " упал");

                }
            }
        }

        System.out.println("Количество пройденых тестов:" + passedTests);
        System.out.println("Количество упавших тестов:" + failedTests);

//        for (Method method : methodListBefore) {
//            System.out.println(method.getName());
//        }


        //MyAmazingTest myAmazingTest = new MyAmazingTest();
//
//    Method[] declaredMethodsMyAmazingTest = MyAmazingTest.class.getDeclaredMethods();
//    for (Method method : declaredMethodsMyAmazingTest) {
//        try {
//            method.invoke(myAmazingTest);
//            System.out.println("Тест" + method.getName() + "успешно прошел");
//            passedTests++;
//        } catch (Throwable throwable) {
//            failedTests++;
//            throwable.printStackTrace();
//            System.err.println("Тест" + method.getName() + "упал");
//
//        }
//
//
//    }
//    System.out.println("Количество пройденых тестов:" + passedTests);
//    System.out.println("Количество упавших тестов:" + failedTests);


    }

}

