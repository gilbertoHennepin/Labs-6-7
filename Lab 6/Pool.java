package week7;

public class Pool {
//    instance variables
    private String name; // field, or a variable
    private double length; //another field

    public Pool(String name, double length ) { // constructor, same name a class
        this.name = name;
        this.length = length;
    }
// instance method
    // instance is another word for an object
    // A pool object is an instance of the Pool class
    public double distanceForLaps(int laps) {
        // 10 laps of pool of length 50, that's 500 meters
        double total = laps * length;
        return total;
    }
    @Override
    public String toString() {
        String description = name + " pool is " + length + " meters long ";
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > 1000) {
            return;
        }
        this.length = length;
    }
}
