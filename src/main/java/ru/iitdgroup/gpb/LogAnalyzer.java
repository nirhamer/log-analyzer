package ru.iitdgroup.gpb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;

public class LogAnalyzer {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "1_build.txt"));
            String line = reader.readLine();
            while (line != null) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                System.out.println(line + " " + timestamp + timestamp.getTime());
                Instant start = Instant.now();
                line = reader.readLine();
                Instant end = Instant.now();
                Duration timeElapsed = Duration.between(start, end);
                System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}