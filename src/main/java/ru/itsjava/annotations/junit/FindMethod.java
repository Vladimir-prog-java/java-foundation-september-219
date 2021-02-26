package ru.itsjava.annotations.junit;

import lombok.ToString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@ToString
public class FindMethod {
    public List<Method> findMethodsByAnnotation(Class<? extends Annotation> annotation, Method[] declaredMethods) {
        List<Method> methodsByAnnotation = new ArrayList<>();
        for (int i = 0; i < declaredMethods.length; i++) {

            if (declaredMethods[i].isAnnotationPresent(annotation)) {
               methodsByAnnotation.add(declaredMethods[i]);
            }

        }
        return methodsByAnnotation;
    }
}



