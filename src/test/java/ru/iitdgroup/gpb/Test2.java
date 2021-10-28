package ru.iitdgroup.gpb;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {

        try {

            File f = new File("test2.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine;

            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}