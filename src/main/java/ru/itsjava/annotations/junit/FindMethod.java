package ru.itsjava.annotations.junit;

import lombok.ToString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@ToString
public class FindMethod {
    public Method[] findMethodByAnnotation(Class<? extends Annotation> annotation, Method[] declaredMethods) {
             Method[] methodsAnnotationInclude = new Method[declaredMethods.length];
        for (int i = 0; i < declaredMethods.length; i++) {

            if (declaredMethods[i].isAnnotationPresent(annotation)) {
                System.out.println("Метод " + declaredMethods[i] + " содержит аннотацию " + annotation);
                methodsAnnotationInclude[i] = declaredMethods[i];
            }

        }
        return methodsAnnotationInclude;
    }
}



