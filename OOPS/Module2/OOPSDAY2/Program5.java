/**
 * Program5
 */
class Tessaract {
    static double rad = 6.7;
    char sym = 'A';

    static void push() {
        System.out.println("Executing Push()............");
    }

    void pull() {
        System.out.println("Executing Pull()............");

    }
}8888

public class Program5 {
    public static void main(String[] args) {
        Tessaract tes = new Tessaract();// Object Creation(tes is assigned to a object it's refernce)

        System.out.println(Tessaract.rad);
        System.out.println(tes.sym);

        Tessaract.push();
        tes.pull();
    }
}