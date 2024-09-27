
/**
 * Pd18 Sir Explanation
 * Armstrong number(Sum of Power(count of digit) of each digit is equal to
 * that number)
 */
import java.util.Scanner;

public class Pd18 {
    static int countDigit(int n) {
        int count = 0;
        while (n > 0) {// we don't know how many iteration is there
            // int rem = n % 10;// no need of rem
            count++;
            n /= 10;

        }
        return count;
    }

    static int power(int n, int p) {
        int pow = 1;
        // multiplying n p times
        for (int i = 1; i <= p; i++) {
            pow *= n;
        }
        return pow;
    }

    static void isArmStrong(int n) {
        int cd = countDigit(n);
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += power(rem, cd);
            n /= 10;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();

        isArmStrong(n);

    }
}