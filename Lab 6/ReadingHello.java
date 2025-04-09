package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingHello {
    public static void main(String[] args)  {

        try {

            //  FileReader reader = new FileReader("hello.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("hellooo.txt"));

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Sorry, file not found"); // only runs if IOException is thrown
        }

    }
}
