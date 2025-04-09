package week6;

public class Catchblock {
    public static void main(String[] args) {


        String hopeThisIsANumber = "50";

        try {
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is" + number);
        } catch (NumberFormatException e) {
            System.out.println("The number is not an integer");
        }
        System.out.println("This is the end of the program");
    }
}
