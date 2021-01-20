package ru.itsjava.collection.list.mylinkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("first");
        linkedList.add("4");
        linkedList.add("third");
        linkedList.add("2");
        linkedList.add("2");


        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.size() = " + linkedList.size());
        //  System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
        System.out.println("linkedList.size() = " + linkedList.size());
        // System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
        System.out.println("linkedList.size() = " + linkedList.size());

        System.out.println("linkedList = " + linkedList);
        //  System.out.println("linkedList.remove(0) = " + linkedList.remove(0));
        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList = " + linkedList);
//linkedList.clear();
        //System.out.println("linkedList = " + linkedList);
//        System.out.println("linkedList.indexOf(\"first\") = " + linkedList.indexOf("first"));
//        System.out.println("linkedList.indexOf(\"5\") = " + linkedList.indexOf("5"));
       System.out.println("linkedList.lastIndexOf(\"4\") = " + linkedList.lastIndexOf("0"));
        linkedList.add(2, "OOO");
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.set(0, \"qqqq\") = " + linkedList.set(0, "qqqq"));
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.get(1) = " + linkedList.get(1));
      System.out.println("linkedList = " + linkedList);
//        System.out.println("linkedList.remove(\"4\") = " + linkedList.remove("4"));
//        System.out.println("linkedList = " + linkedList);
//        System.out.println("linkedList.contains(\"qqqq\") = " + linkedList.contains("qqqq"));
    }

}
