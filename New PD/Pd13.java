
/**
 * Pd13 if a number is spy(sumof each digit is equal to product of each digit) or not
 */
import java.util.Scanner;

public class Pd13 {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // storing original Num bcoz it become zero
        int originalNum = num;

        int sum = 0;
        int prod = 1;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }
        if (sum == prod) {
            System.out.println(originalNum + " is Spy number");
        } else {
            System.out.println(originalNum + " is not a spy number");
        }
    }
}