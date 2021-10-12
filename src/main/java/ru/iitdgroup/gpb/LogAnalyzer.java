package ru.iitdgroup.gpb;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class LogAnalyzer {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "hi.txt"));
            String line = reader.readLine();
            while (line != null) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                System.out.println(line + " " + LocalTime.now());
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}