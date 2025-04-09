package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 24;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(Integer.toString(data1)); //makes it a String
        bufferedWriter.newLine();
        bufferedWriter.write(data2 + ""); //makes it a String
        bufferedWriter.newLine();
        bufferedWriter.write(data3 + "\n");  // String number argument


        bufferedWriter.write(number + "\n");
        bufferedWriter.write("Test");   // write a string

        bufferedWriter.close();
    }
}
