package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;


public class TireComparison {

    public static void main(String[] args) {
//        Tire example = new Tire("Bridgestone", 40, 1000);
//        System.out.println(" $ "+ example.pricePer1000Miles());
//        System.out.println(example);
//        System.out.println(example.costForSet());

    List<Tire> tireList = new ArrayList();

    do {
        Tire tire = getTireInfo();
        tireList.add(tire);
      } while (yesNoInput("More tires to add to compare"));

        Collections.sort(tireList);
        printReportTable(tireList);
        
    }

    private static void printReportTable(List<Tire> tireList) {
        for (Tire tire: tireList) {
            System.out.println(tire + " Cost per 4 tires is $" +tire.costForSet());
        }

    }

    private static Tire getTireInfo() {
        String name = stringInput("Enter the name of the tire: ");
        double price = positiveDoubleInput("Enter price of " + name + "?");
        int mileWarranty = positiveIntInput("Enter mile warranty of" + name + "?");

        Tire tire = new Tire(name, price, mileWarranty);
        return tire;
    }
}
