package ru.itsjava.annotations.junit;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import ru.itsjava.annotations.junit.annotation.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

//@RequiredArgsConstructor
public class Runner {
    private Class<? extends Annotation> annotation;
    private Class<?> testClass;

    public Runner(Class<?> testClass) {
        this.testClass = testClass;
    }


    public void start() {
        int passedTests = 0;
        int failedTests = 0;



        FindMethod findMethod = new FindMethod();
        annotation = Before.class;
        Method[] methodListBefore = findMethod.findMethodByAnnotation(annotation, testClass.getDeclaredMethods());
        for (int i = 0; i < methodListBefore.length; i++) {
            if (methodListBefore[i] != null) {
                try {
                    methodListBefore[i].invoke(testClass);
                    System.out.println("Тест " + methodListBefore[i].getName() + " успешно прошел");
                    passedTests++;
                } catch (Throwable throwable) {
                    failedTests++;
                    throwable.printStackTrace();
                    System.err.println("Тест " + methodListBefore[i].getName() + " упал");

                }
            }
        }
//        if (MyAmazingTest.class.isAnnotationPresent(Before.class)) {
//
//        }


        annotation = BeforeEach.class;
        Method[] methodListBeforeEach = findMethod.findMethodByAnnotation(annotation, testClass.getDeclaredMethods());
        for (int i = 0; i < methodListBeforeEach.length; i++) {
            if (methodListBeforeEach[i] != null) {
                try {
                    methodListBeforeEach[i].invoke(testClass);
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
        Method[] methodListTest = findMethod.findMethodByAnnotation(annotation, testClass.getDeclaredMethods());
        for (int i = 0; i < methodListTest.length; i++) {
            if (methodListTest[i] != null) {
                try {
                    methodListTest[i].invoke(testClass);
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
        Method[] methodListAfterEach = findMethod.findMethodByAnnotation(annotation, testClass.getDeclaredMethods());
        for (int i = 0; i < methodListAfterEach.length; i++) {
            if (methodListAfterEach[i] != null) {
                try {
                    methodListAfterEach[i].invoke(testClass);
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
        Method[] methodListAfter = findMethod.findMethodByAnnotation(annotation, testClass.getDeclaredMethods());
        for (int i = 0; i < methodListAfter.length; i++) {
            if (methodListAfter[i] != null) {
                try {
                    methodListAfter[i].invoke(testClass);
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

