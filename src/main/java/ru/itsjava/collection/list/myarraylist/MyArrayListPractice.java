package ru.itsjava.collection.list.myarraylist;

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
myArrayList.add(1,"STR0");
        System.out.println("myArrayList = " + myArrayList);
myArrayList.remove(1);
        System.out.println("myArrayList = " + myArrayList);

    }

}
