package ru.itsjava.collection.list.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class ListHomework {
    public static void main(String[] args) {
        List<String> homeList1 = new ArrayList();

        List<String> homeList2 = new ArrayList(20);

        homeList2.add("Первый элемент");
        homeList2.add("Второй элемент");
        homeList2.add("Третий элемент");
        homeList2.add("Четвертый элемент");
        homeList2.add("Пятый элемент");

        homeList2.add(2, "Шестой элемент");
        homeList2.add(0, "Седьмой элемент");
        List<String> homelist3 = new ArrayList<>(homeList2);
        for (String elem : homelist3) {
            System.out.println(elem + " скопирован из homeList2");
        }
        System.out.println();

        System.out.println("homeList2.get(0) = " + homeList2.get(0));
        System.out.println("homeList2.get(homeList2.size()) = " + homeList2.get(homeList2.size() - 1));
        System.out.println();

        homelist3.remove("Седьмой элемент");
        homelist3.remove(3);
        System.out.println();

//4
        System.out.println("homelist3.contains(\"Четвертый элемент\") = " + homelist3.contains("Четвертый элемент"));
        System.out.println();

//5
        System.out.print("List: {");
        for (int i = 0; i < homelist3.size() - 1; i++) {
            System.out.print("\"" + homelist3.get(i) + "\";");
        }
        System.out.print("\"" + homelist3.get(homelist3.size() - 1) + "\"}");
        System.out.println();

//6
        for (int i = 0; i < homelist3.size(); i = i + 3) {
            System.out.println("homelist3.get(" + i + ") = " + homelist3.get(i));
        }

        homelist3.add("Ещё один элемент");
        homelist3.add(2, "Ещё один элемент");
        String elem = "Ещё один элемент";
        int count = 0;
        for (int i = 0; i < homelist3.size(); i++) {
            if (elem.equals(homelist3.get(i))) {
                count++;
            }
        }
        System.out.println("Количество элементов - \"Ещё один элемент\": " + count);
        System.out.println();

//7
        for (int i = 3; i < homelist3.size(); i++) {
            System.out.print(homelist3.get(i) + " ");
        }
        System.out.println();
        System.out.println();

//6+7
        homelist3.add(2, "Ещё один элемент");
        System.out.print("homelist3 содержит: ");
        for (String element : homelist3) {
            System.out.print(element + " ");
        }
        System.out.println();
        int firstTwoElement = 0;
        for (int i = 0; i < homelist3.size(); i++) {
            if (elem.equals(homelist3.get(i))) {
                homelist3.remove(i);
                i--;
                firstTwoElement++;
            }
            if (firstTwoElement > 1) break;
        }
        System.out.print("Теперь homelist3 содержит: ");
        for (String element : homelist3) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();

//8
        List<String> numberList = new ArrayList<>();
        numberList.add("Один");
        numberList.add("Два");
        numberList.add("Три");
        numberList.add("Четыре");
        numberList.add("Пять");
        numberList.add("Шесть");
        numberList.add("Семь");

        System.out.print("Это первый элемент, который делится на 3: ");
        for (int i = 0; i < numberList.size(); i++) {
            int num = numberList.get(i).length() % 3;
            if (num == 0) {
                System.out.println(numberList.get(i));
                break;
            }
        }
        System.out.println();

//9
        System.out.print("Это все элементы, которые делятся на 3: ");
        for (int i = 0; i < numberList.size(); i++) {
            int num = numberList.get(i).length() % 3;
            if (num == 0) {
                System.out.print(numberList.get(i) + " ");
            }
        }


    }
}