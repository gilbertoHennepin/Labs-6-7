package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeStyleCheck {
    public static void main(String[] args) {



        String filename = "ReadNumbersFromFile.java";
        int maxLineLength = 50; // original was 100

        try (BufferedReader reader = new BufferedReader(new FileReader("ReadNumbersFromFile.java"))) {

            boolean lineTooLong = false;
            int numberOfLinesTooLong = 0;
            String line = reader.readLine();
            int LineCounter = 1;

            while (line != null) {

                if (line.length() > maxLineLength) {
                    System.out.println("Line" + LineCounter + "too long ");
                    System.out.println(line);
                    lineTooLong = true;
                    numberOfLinesTooLong++;
                }
                LineCounter ++;
                line = reader.readLine();
            }

            if (lineTooLong) {
                System.out.println("There were " + numberOfLinesTooLong + " lines  that were too long " );
            }else{
                System.out.println("There were no lines that were too long ");
            }

        } catch (IOException e) {
            System.out.println("IOException occured" + e);
        }
    }
}
