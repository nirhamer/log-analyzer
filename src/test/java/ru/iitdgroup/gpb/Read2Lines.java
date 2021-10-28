package ru.iitdgroup.gpb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read2Lines {

    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "test2.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}