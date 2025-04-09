package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args)  {

        // file will be created if it does not exist
        // file will be overwritten if it does exist!
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Hello.txt"))) {

            bufferedWriter.write("Hello!");
            bufferedWriter.newLine(); // adds a new line
            bufferedWriter.write("More Data Here\n");
            bufferedWriter.write("Goodbye\n");


        } catch (IOException e) {
            System.out.println("Error writing to file" + e);
        }

        try (FileWriter writer2 = new FileWriter("Hello.txt", true);  //append flag - true means data to the end)
             BufferedWriter bufferedWriter2 = new BufferedWriter(writer2)) {  // Properly include in try-with-resources

            bufferedWriter2.write("Hello  people !");
            bufferedWriter2.newLine(); // adds a new line
            bufferedWriter2.write("More Data Here 2222222222");
            bufferedWriter2.newLine();
            bufferedWriter2.write("Goodbye EVERYBODY");
            bufferedWriter2.newLine();

        }catch (IOException e){
            System.out.println("Error writing to file" + e);
        }
    }
}
