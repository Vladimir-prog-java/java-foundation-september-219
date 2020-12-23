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
//        myArrayList.remove(0);
//        System.out.println("myArrayList = " + myArrayList);
//        System.out.println("myArrayList.isEmpty() = " + myArrayList.isEmpty());
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
        myArrayList.add(3, "STR0");
        System.out.println("myArrayList = " + myArrayList);
        myArrayList.remove(4);
        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.indexOf(\"STR\") = " + myArrayList.indexOf("STR"));
        System.out.println("myArrayList.lastIndexOf(\"str3\") = " + myArrayList.lastIndexOf("str3"));


    }

}
