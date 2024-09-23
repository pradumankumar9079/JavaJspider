/**
 * Program4 Object Creation
 * Everything is a Object in java
 */
class Laptop {
    /*********************************************************** */
    // Here it's a date member
    String model;
    double cost;

    /*********************************************************** */

    void coding() {
        System.out.println("Coding in: " + model + " Laptop Which is Having cost: " + cost);
    }

    void playing() {
        System.out.println("Playing in: " + model + " Laptop Which is Having cost: " + cost);

    }
}

public class Program4 {
    public static void main(String[] args) {
        /********************************************************* */
        // --> This is States Over here
        Laptop l1 = new Laptop();
        l1.model = "HPElitebookG2";
        l1.cost = 75000;
        l1.coding();
        l1.playing();
        /********************************************************* */

        /********************************************************* */
        // --> This is States Over here
        Laptop l2 = new Laptop();
        l2.model = "Apple M2";
        l2.cost = 100000;
        l2.coding();
        l2.playing();
        /********************************************************* */
    }
}