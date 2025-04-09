package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading2 {
    public static void main(String[] args)  {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"))) {

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Sorry, file not found" + e); // only runs if IOException is thrown
        }

    }
}
