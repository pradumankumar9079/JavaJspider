/**
 * Pd16 --> Method (Methi)
 */

// public class Pd16 {// -->JVM IS RESPONSIBLE TO RUN ONLY MAIN METHOD
// public static void main(String[] args) {
// System.out.println("main method started");

// m2(); // method called

// System.out.println("main method ended");
// }

// // -->PROGRAMMER IS RESPONSIBLE TO CALL m1 METHOD
// public static void m1() {
// System.out.println("m1 method is called");
// }

// // -->PROGRAMMER IS RESPONSIBLE TO CALL m2 METHOD
// public static void m2() {
// System.out.println("m2 method is called");
// m1();
// }
// }

/**
 * Pd16 Define Method to count how many factors are present for that number
 * Variable which is Declared inside function body is local Variable
 * (local variable must be initialized before using in any operation else CTE local variable is not having
 * default value)
 */
import java.util.Scanner;

public class Pd16 {
    public static int countOfFactor(int num) {
        int cnt = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                cnt++;
                // System.out.println("Factor is: " + i);
            }
        }
        return cnt + 1;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int cnt = countOfFactor(num);
        System.out.println("No of Factor for: " + num + " is: " + cnt);
    }
}