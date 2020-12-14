package ru.itsjava.collection.list.myarraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println("myArrayList.size() = " + myArrayList.size());
myArrayList.add("str1");
myArrayList.add("str1");
        System.out.println("myArrayList = " + myArrayList);

myArrayList.remove("str1");
        System.out.println("myArrayList = " + myArrayList);

        //System.out.println("myArrayList.get(8) = " + myArrayList.get(8));
        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));


    }

}
