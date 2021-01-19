package ru.itsjava.collection.map.homework;

import ru.itsjava.collection.map.Man;
import ru.itsjava.object.TelephoneShop;

import java.util.HashMap;
import java.util.Map;

public class Bazar {
    public static void main(String[] args) {
        HashMap<Buyer, Fruit> fruits = new HashMap<>();
        Buyer ivan = new Buyer("Ivan");
        Buyer andrey = new Buyer("Andrey");
        Buyer alexey = new Buyer("Alexey");
        Buyer masha = new Buyer("Masha");
        Buyer sasha = new Buyer("Sasha");


        Fruit melon = new Fruit("Дыня", 6);
        Fruit watermelon = new Fruit("Арбуз", 8);
        Fruit apple = new Fruit("Яблоко", 1);

        fruits.put(ivan, melon);
        fruits.put(andrey, watermelon);
        fruits.put(alexey, melon);
        fruits.put(masha, apple);
        fruits.put(sasha, melon);


        System.out.println("fruits.get(ivan) = " + fruits.get(ivan));

        HashMap<Buyer, Fruit> newFruits = new HashMap<>();
        newFruits.putAll(fruits);
        for (Buyer key : newFruits.keySet()) {
            System.out.println("New HashMap: " + key + " " + newFruits.get(key));
        }

        fruits.remove(alexey);
        System.out.println("fruits.containsKey(ivan) = " + fruits.containsKey(ivan));
        System.out.println("fruits.containsValue(apple) = " + fruits.containsValue(apple));

        for (Buyer key : fruits.keySet()) {
            System.out.println("key " + key.getName());
        }

        for (Buyer key : fruits.keySet()) {
            System.out.println(fruits.get(key));
        }

        for (Map.Entry<Buyer, Fruit> pair : fruits.entrySet()) {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
        System.out.println("fruits.get(ivan).name = " + fruits.get(ivan).name);

        int keyCount = 0;
        for (Buyer key : fruits.keySet()) {
            if (key.getName().length() > 5) {
                keyCount++;
            }
        }
        System.out.println("keyLenght > 5 = " + keyCount);

        int melonCount = 0;
        for (Buyer key : fruits.keySet()) {
            if (fruits.get(key).name.equals("Дыня")) {
                melonCount++;
            }
        }
        System.out.println("Количество дынь: " + melonCount);

        fruits.put(masha, watermelon);
        fruits.put(alexey, apple);
        int watermelonCount = 0;
        for (Buyer key : fruits.keySet()) {
            if (fruits.get(key).name.equals("Арбуз")) {
                watermelonCount++;
                if (watermelonCount > 2) {
                    break;
                }
            } else System.out.println(key + " " + fruits.get(key));
        }

        int keyACount = 0;
        for (Buyer key : fruits.keySet()) {
            if (key.getName().charAt(0) == 'A') {
                keyACount++;
                if (keyACount > 2) {
                    break;
                }
            } else System.out.println("Key without A: " + key);
        }

        for (Buyer key : fruits.keySet()) {
            if (fruits.get(key).name.equalsIgnoreCase("Арбуз")) {
                System.out.println(fruits.get(key));
                break;
            }

        }

        HashMap<Buyer, Fruit> melons = new HashMap<>();

        for (Buyer key : fruits.keySet()) {
            if (fruits.get(key).name.equals("Дыня")) {
                melons.put(key, fruits.get(key));
            }
        }
        for (Buyer key : melons.keySet()) {
            System.out.println("melons.get(key) = " + melons.get(key));
        }

        for (Buyer key : fruits.keySet()) {
            System.out.println(fruits.get(key));
        }
        int countFruits = 0;
        double weightFruits = 0;
        for (Buyer key : fruits.keySet()) {
            countFruits++;
            weightFruits = weightFruits+fruits.get(key).weight;
        }
        double averageWeight = weightFruits / countFruits;
        System.out.println("averageWeight = " + averageWeight);
    }
}
