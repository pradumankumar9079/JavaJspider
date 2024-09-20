
/**
 * Pd14 sum of even digit is even or odd (Always True)
 */
import java.util.Scanner;

public class Pd14 {

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sumOfEvenDigit = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                sumOfEvenDigit += rem;
            }
            num /= 10;
        }
        if (sumOfEvenDigit % 2 == 0) {
            System.out.println(sumOfEvenDigit + " is Even");
        } else {
            System.out.println(sumOfEvenDigit + " is Odd");
        }

    }
}