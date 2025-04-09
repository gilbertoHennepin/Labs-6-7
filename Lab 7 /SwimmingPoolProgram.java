package week7;

public class SwimmingPoolProgram {
    public static void main(String[] args) {

        Pool ymca = new Pool("YMCA", 50);
        double totalSwam = ymca.distanceForLaps(6);

        ymca.setName("NEW YMCA");

        System.out.println(ymca);
        System.out.println("The total distance is: " + totalSwam + " meters");

        Pool como = new Pool("Como Park", 25);
        System.out.println("The total distance is: " + como.distanceForLaps(10));

        System.out.println(como);

        Pool Edina = new Pool("Edina", 50);
        double distance = Edina.distanceForLaps(12);
        System.out.println(distance);
        System.out.println(Edina);
    }
}
