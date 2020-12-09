package ru.itsjava.oop.notepad;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class NotePad {

    static   String name = null;
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("89211231212", "Иванов Иван Петрович");
        phoneBook.put("89111231212", "Петров Иван Иванович");
        phoneBook.put("89211231210", "Иванов Василий Иванович");
        phoneBook.put("89111231213", "Сидоров Николай Сергеевич");
        phoneBook.put("89211231214", "Алексеев Иван Петрович");
        phoneBook.put("89111231215", "Петров Иван Владимирович");

        String phone = null;
        // String name = null;

        System.out.println("Введите номер телефона:");
        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
        String name1 = name;
        Iterator it = phoneBook.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (pair.getValue() == name1) {
                System.out.println("Found: " + pair.getKey() + " = " + pair.getValue());
            }
            it.remove();
        }
        //   String correctphone = getFone(phone);
//            if (correctphone.equals("LIST")) {
//                printMap(phoneBook);
//                continue;
//            }
//             if (phoneBook.containsKey(phone)){
//
//                    System.out.println(phoneBook.get(phone));
//                }
//            else if (name.equals(phoneBook.get(name))){
//
//                    System.out.println(phoneBook.get(name));
//                }
//            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
//                String key = entry.getKey();
//                name = entry.getValue();
//
//                System.out.println(key);
//            }}


    }

    public void processMap(Map phoneBook) {
        Iterator it = phoneBook.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (pair.getValue() == name) {
                System.out.println("Found: " + pair.getKey() + " = " + pair.getValue());
            }
            it.remove(); // чтобы не было ConcurrentModificationException
        }
    }


//    public String getKeytoValue (Map map ,String someValue){
//        for(Map.Entry : map.entrySet()) {
//            if (entry.getValue().equals(someValue)) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }

    public static String getFone(String phone) {
        String space = " ";
        int len1 = phone.length();
        int newlen1 = phone.replaceAll(space, "").length();
        int spaceTotal1 = (len1 - newlen1);
        if (spaceTotal1 > 0)
        {
            System.out.println("Ошибка! Телефон указаны не верно. Укажите, пожалуйста, правильно номер телефона");
        }
        else if (!phone.matches("\\d{11}"))
        {
            System.out.println("Ошибка! Номер телефлна должен содержать только 11 цифр. Укажите, пожалуйста, правильно номер телефона");
        }
        return phone;
    }

    private static void printMap(Map<String, String> map) {
        for (String key : map.keySet()){
            System.out.println(key + "=>" + map.get(key));
        }
    }
}


//    Написать программу, которая будет работать как телефонная книга:
//    если пишем новое имя, просит ввести номер телефона и запоминает его,
//    если новый номер телефона — просит ввести имя и тоже запоминает.
//     Если вводим существующее имя или номер телефона, программа должна выводить всю информацию о контакте.
//     При вводе команды LIST программа должна печатать в консоль список всех абонентов в алфавитном порядке с номерами.

