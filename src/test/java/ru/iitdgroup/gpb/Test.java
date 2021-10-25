package ru.iitdgroup.gpb;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {

        Scanner s = null;

        double sum = 0;

        try {
            s = new Scanner(
            new BufferedReader(new FileReader("test2.txt")));

            while (s.hasNext()) {

                if (s.hasNextDouble()) {

                    sum += s.nextDouble();

                } else {

                    s.next();

                }

            }

        } finally {

            s.close();

        }

        System.out.println(sum);

    }

}