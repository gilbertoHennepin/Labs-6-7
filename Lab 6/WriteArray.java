package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static javax.swing.UIManager.get;

public class WriteArray {
    public static void main(String[] args) throws IOException {

        String filename2 = "writearray.txt";

        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun",};


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename2));

        for (int i = 0; i < months.length; i++) {
            bufferedWriter.write(months[i] + "\n");
        }
        bufferedWriter.close();
    }
}
