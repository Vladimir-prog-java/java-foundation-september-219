package ru.itsjava.iostreams.homework;

import java.io.*;

public class IOStreamsHomework {
    public static void main(String[] args) {

        try (BufferedReader fileOneReader = new BufferedReader(new FileReader("src/main/resources/file-one.txt"));
             BufferedReader fileTwoReader = new BufferedReader(new FileReader("src/main/resources/file-two.txt"));
             //FileWriter printFileTwoWriter = new FileWriter("src/main/resources/file-two.txt");
             FileWriter printFileOneWriter = new FileWriter("src/main/resources/file-one.txt")) {

            String textFileOne;
            String textFileTwo;

//            while ((textFileOne = fileOneReader.readLine()) != null) {
//                printFileTwoWriter.write(textFileOne);
//            }
            while ((textFileTwo = fileTwoReader.readLine()) != null) {
                printFileOneWriter.write(textFileTwo);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        //Это текст второго файла, который должен быть скопирован в первый файл!
        //Это текст первого файла, который должен быть скопирован во второй файл!

//        try (BufferedReader fileTwoReader = new BufferedReader(new FileReader("src/main/resources/file-two.txt"))) {
//            System.out.println("fileTwoReader.readLine() = " + fileTwoReader.readLine());
//            //textFileTwo = ;
//            //fileTwoReader.close();
////            PrintWriter printFileOneWriter = new PrintWriter("src/main/resources/file-one.txt");
////            printFileOneWriter.write(fileTwoReader.readLine());
////            printFileOneWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(PrintWriter printFileOneWriter = new PrintWriter("src/main/resources/file-one.txt")) {
//            printFileOneWriter.println(textFileTwo);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try (BufferedReader reader = new BufferedReader(new FileReader("")); FileWriter writer = new FileWriter("");) {
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                writer.write("www." + line + ".com");
//                writer.write("\n");
//            }
//        }


    }


}
