package ru.itsjava.iostreams.homework;

import java.io.*;

public class SerializationHomework {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("User1", "1234");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/user.out"));
        objectOutputStream.writeObject(user);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/user.out"));
        Object objUser = objectInputStream.readObject();
        System.out.println("objUser = " + objUser);


    }


}
