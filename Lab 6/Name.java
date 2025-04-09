package week6;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {


        String filename = "data.txt";

        int number = 2545;
        String name = "Gilberto Ojeda";
        String favoriteColor = "Blue";


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor + "\n");
        bufferedWriter.write(number + "\n");

        bufferedWriter.close();


        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));


        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();

    }
}
