package ru.itsjava.iostreams.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextWriter {
    public static void main(String[] args) {
        System.out.println("Введите имя файла (например user-file.txt):");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        File userFile = new File("src/main/resources/" + fileName);
        List<String> textList = new ArrayList();
        System.out.println("Введите текст(10 строк):");

        for (int i = 0; i < 10; i++) {
            Scanner scanner1 = new Scanner(System.in);
            textList.add(scanner1.nextLine());
        }

        try (FileWriter fileWriter = new FileWriter(userFile)) {
            for (int i = 0; i < textList.size(); i++) {
                fileWriter.write(textList.get(i) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
