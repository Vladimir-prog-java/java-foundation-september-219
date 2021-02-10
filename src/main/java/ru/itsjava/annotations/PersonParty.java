package ru.itsjava.annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class PersonParty {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Person valeriy = new Person("Valeriy");
        System.out.println(valeriy);
//        Class<? extends Person> personClass = valeriy.getClass();
        Class<?> aClass = Class.forName("ru.itsjava.annotations.Person");
        System.out.println(aClass.getName());
        Constructor constructorPerson = aClass.getConstructor(String.class);
        Person petr = (Person) constructorPerson.newInstance("Petr");
        System.out.println(petr);

        Field aClassField = aClass.getDeclaredField("isGood");
        aClassField.setAccessible(true);
        aClassField.setBoolean(valeriy, true);
        aClassField.setBoolean(petr, true);

        System.out.println(valeriy);

        if (Person.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = Person.class.getAnnotation(MyAnnotation.class);
            if (myAnnotation.isFlag()) {
                System.out.println("myAnnotation.message() = " + myAnnotation.message());
            }
        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            method.invoke(petr);

        }

//        Arrays.stream(declaredMethods).forEach(method -> {
//            try {
//                method.invoke(petr);
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//        });

    }
}
