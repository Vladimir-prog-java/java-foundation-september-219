package ru.itsjava.annotations.junit;

import ru.itsjava.annotations.junit.annotation.Before;
import ru.itsjava.annotations.junit.annotation.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public void start() {
        int passedTests = 0;
        int failedTests = 0;

//    Class myAmazingTestClass = MyAmazingTest.class;
////    myAmazingTestClass
//    if (myAmazingTestClass.isAnnotationPresent(Before.class)){
////Method[] methodsBeforeAnnotation = myAmazingTestClass.getAnnotationsByType(Before.class);
//    }

        FindMethod findMethod = new FindMethod();
       Method[] methodList = findMethod.findMethodByAnnotation(Before.class);

        for (Method method : methodList) {
            System.out.println(method.getName());
        }


//    MyAmazingTest myAmazingTest = new MyAmazingTest();
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
