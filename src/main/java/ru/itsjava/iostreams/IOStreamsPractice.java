package ru.itsjava.iostreams;

import java.io.*;

public class IOStreamsPractice {
    public static void main(String[] args) {
        System.out.println();

        //File file = new File("F:\\Java\\java-foundation-september-219\\src\\main\\resources/my-file.txt");
       //прописыаем ОБЯЗАТЕЛЬНО относительный путь!!!!
        File file = new File("src/main/resources/my-file.txt/my-file.txt");

        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Привет");
            printWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        //try with resources (AutoClosable)
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {

            System.out.println("fileReader.readLine() = " + fileReader.readLine());

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }



    }
}
