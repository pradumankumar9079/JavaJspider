/**
 * Program3 Object Creation
 */
class Pen {
    double price;// Default 0.0
    String color; // Default null

    void writing() {
        System.out.println("Writing Pen Cost: " + price);
    }

    void drawing() {
        System.out.println("Drawing Pen Color: " + color);

    }
}

public class Program3 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.price = 10;
        p1.color = "Blue";
        p1.drawing();

        Pen p2 = new Pen();
        p2.price = 20;
        p2.color = "Black";
        p2.writing();

        Pen p3 = new Pen();
        p3.price = 30;
        p3.color = "Red";
        p3.writing();
        p3.drawing();
    }
}