package ru.iitdgroup.gpb;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


class Test {

    public static void main(String[] args)
    {
        try {
            FileReader fr = new FileReader("hi.txt");
            FileWriter fw = new FileWriter("hi2.txt");
            //  a blank string to hold all the content
            String str = "";
            int i;
            // Reading the file using read()
            while ((i = fr.read()) != -1) {

                // Storing the data in the string
                str += (char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(
                    "There might be IOException");
        }
    }
}