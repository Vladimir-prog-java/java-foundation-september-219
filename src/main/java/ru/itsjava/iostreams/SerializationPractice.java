package ru.itsjava.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationPractice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Person vladimir = new Person("Vladimir", 37);
//        System.out.println("before serialization" + vladimir);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/vladimir.out"));
//        objectOutputStream.writeObject(vladimir);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/vladimir.out"));
        Object objVladimir = objectInputStream.readObject();
      //  Person vladimirAfterSer = (Person) objVladimir;

        //System.out.println("after serialization" + vladimirAfterSer);
        System.out.println("after serialization" + objVladimir);
    }


}
