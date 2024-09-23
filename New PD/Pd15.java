
/**
 * Pd15 find n to the power p -->Important (multiply n p times)
 */
import java.util.Scanner;

public class Pd15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Enter p:");
        int p = sc.nextInt();

        int ntoThePowerP = 1;
        // while (p != 0) {
        // ntoThePowerP *= n;
        // p--;
        // }

        // Recommended for loop
        for (int i = 1; i <= p; i++) {
            ntoThePowerP *= n;
        }

        System.out.println(ntoThePowerP);
    }

}