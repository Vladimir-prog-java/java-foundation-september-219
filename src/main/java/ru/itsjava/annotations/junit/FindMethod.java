package ru.itsjava.annotations.junit;

import lombok.ToString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@ToString
public class FindMethod {
    //    public Method[] findMethodByAnnotation(Class<?> annotation) {
//        Method[] declaredMethodsMyAmazingTest = MyAmazingTest.class.getDeclaredMethods();
//        Method[] methodsAnnotationInclude = new Method[declaredMethodsMyAmazingTest.length];
//        for (int i = 0; i < declaredMethodsMyAmazingTest.length; i++) {
//            if (MyAmazingTest.class.isAnnotationPresent((Class<? extends Annotation>) annotation)) {
    public Method[] findMethodByAnnotation(Class<? extends Annotation> annotation) {
        Method[] declaredMethodsMyAmazingTest = MyAmazingTest.class.getDeclaredMethods();
        Method[] methodsAnnotationInclude = new Method[declaredMethodsMyAmazingTest.length];
        for (int i = 0; i < declaredMethodsMyAmazingTest.length; i++) {

            if (declaredMethodsMyAmazingTest[i].isAnnotationPresent(annotation)) {
                System.out.println("Метод " + declaredMethodsMyAmazingTest[i] + " содержит аннотацию " + annotation);
                methodsAnnotationInclude[i] = declaredMethodsMyAmazingTest[i];
            }

        }
        return methodsAnnotationInclude;
    }
}



