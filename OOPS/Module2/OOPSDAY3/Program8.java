/**
 * Program8 Bike
 */
class Bike {
    String model;

    void riding() {
        System.out.println("Riding on " + model + " Bike");
    }

    void stopping() {
        System.out.println(model + " Bike Stopped");
    }
}

public class Program8 {
    public static void main(String[] args) {
        // Bike1 Object
        Bike b1 = new Bike();
        b1.model = "Harley Davidson";
        b1.riding();
        b1.stopping();

        // Bike2 Object
        Bike b2 = new Bike();
        b2.model = "Honda City";
        b2.riding();
        b2.stopping();

    }
}