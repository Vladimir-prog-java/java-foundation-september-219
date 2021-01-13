package ru.itsjava.collection.list.myarraylist;

import java.util.Arrays;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add("str1");
        myArrayList.add("str2");
        myArrayList.add("str3");
        myArrayList.add("str4");


        System.out.println("myArrayList = " + myArrayList);

//        myArrayList.remove("str1");
//        System.out.println("myArrayList = " + myArrayList);
//
//        //System.out.println("myArrayList.get(8) = " + myArrayList.get(8));
//        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
//        System.out.println("myArrayList.isEmpty() = " + myArrayList.isEmpty());
////myArrayList.clear();
////        System.out.println("myArrayList.isEmpty() = " + myArrayList.isEmpty());

        myArrayList.set(1, "STR");
        System.out.println("myArrayList = " + myArrayList);
        myArrayList.add(1, "STR0");
        System.out.println("myArrayList = " + myArrayList);
//myArrayList.remove(1);
//        System.out.println("myArrayList = " + myArrayList);
        String str = "STR100";
        String str0 = "STRSTR";
        String str1 = "STRSTR1";
        String str2 = "STRSTR2";

        Object[] array = new Object[5];
        array[0] = str;
        array[1] = str0;
        array[2] = str1;
        array[3] = str2;
        array[4] = str0;

        System.out.println("myArrayList.toArray().toString() = " + myArrayList.toArray().toString());


    }

}
