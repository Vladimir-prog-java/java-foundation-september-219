package ru.itsjava.annotations.junit;

import lombok.RequiredArgsConstructor;
import ru.itsjava.annotations.junit.annotation.*;

import javax.xml.datatype.DatatypeConfigurationException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;


@RequiredArgsConstructor
public class Runner {

    private int passedTests = 0;
    private int failedTests = 0;
    private final Class<?> testClass;


    public void start() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Object objTestClass = testClass.getConstructor().newInstance();
        FindMethod findMethod = new FindMethod();
        invokeMethodByBefore(objTestClass, findMethod);
        invokeMethodByBeforeEachAfterEachTest(objTestClass, findMethod);
        invokeMethodByAfter(objTestClass, findMethod);
        System.out.println("Количество пройденых тестов:" + passedTests);
        System.out.println("Количество упавших тестов:" + failedTests);
    }

    private void invokeMethodByBeforeEachAfterEachTest(Object objTestClass, FindMethod findMethod) throws IllegalAccessException, InvocationTargetException {
        List<Method> methodByBeforeEach = findMethod.findMethodsByAnnotation(BeforeEach.class, testClass.getDeclaredMethods());
        List<Method> methodByAfterEach = findMethod.findMethodsByAnnotation(AfterEach.class, testClass.getDeclaredMethods());
        List<Method> methodByTest = findMethod.findMethodsByAnnotation(Test.class, testClass.getDeclaredMethods());
        for (int i = 0; i < methodByTest.size(); i++) {
            for (int j = 0; j < methodByBeforeEach.size(); j++) {
                Method byBeforeEach = methodByBeforeEach.get(j);
                byBeforeEach.invoke(objTestClass);
                System.out.println("Тест " + methodByBeforeEach.get(j).getName() + " успешно прошел");
            }
            try {
                methodByTest.get(i).invoke(objTestClass);
                System.out.println("Тест " + methodByTest.get(i).getName() + " успешно прошел");
                passedTests++;
            } catch (Throwable throwable) {
                failedTests++;
                throwable.printStackTrace();
                System.err.println("Тест " + methodByTest.get(i).getName() + " упал");
            }
            for (int j = 0; j < methodByAfterEach.size(); j++) {
                Method byAfterEach = methodByAfterEach.get(j);
                byAfterEach.invoke(objTestClass);
                System.out.println("Тест " + methodByAfterEach.get(j).getName() + " успешно прошел");
            }
        }
    }

    private void invokeMethodByAfter(Object objTestClass, FindMethod findMethod) throws IllegalAccessException, InvocationTargetException {
        List<Method> methodAfter = findMethod.findMethodsByAnnotation(After.class, testClass.getDeclaredMethods());
        for (Method method : methodAfter) {
            method.invoke(objTestClass);
            System.out.println("Метод After успешно прошел");
        }
    }

    private void invokeMethodByBefore(Object objTestClass, FindMethod findMethod) throws IllegalAccessException, InvocationTargetException {
        List<Method> methodByBefore = findMethod.findMethodsByAnnotation(Before.class, testClass.getDeclaredMethods());
        for (Method method : methodByBefore) {
            method.invoke(objTestClass);
            System.out.println("Метод Before успешно прошел");
        }
    }
}

