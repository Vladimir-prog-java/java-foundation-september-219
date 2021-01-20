package ru.itsjava.iostreams.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsHomework {
    public static void main(String[] args) {
        List<String> textListOne = new ArrayList();
        List<String> textListTwo = new ArrayList();
        try (BufferedReader fileOneReader = new BufferedReader(new FileReader("src/main/resources/file-one.txt"))) {
            String textFileOne;
            while ((textFileOne = fileOneReader.readLine()) != null) {
                textListOne.add(textFileOne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader fileTwoReader = new BufferedReader(new FileReader("src/main/resources/file-two.txt"))) {
            String textFileTwo;
            while ((textFileTwo = fileTwoReader.readLine()) != null) {
                textListTwo.add(textFileTwo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter printFileTwoWriter = new FileWriter("src/main/resources/file-two.txt")) {
            for (int i = 0; i < textListOne.size(); i++) {
                printFileTwoWriter.write(textListOne.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter printFileOneWriter = new FileWriter("src/main/resources/file-one.txt")) {
            for (int i = 0; i < textListTwo.size(); i++) {
                printFileOneWriter.write(textListTwo.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
