
/**
 * Pd15Practice wap to check whether Entered Number Prime or Not
 */
// import java.util.Scanner;

// public class Pd15Practice {
// public static void main(String[] args) {
// System.out.println("Enter Number: ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// boolean flag = false;
// for (int i = 2; i < num; i++) {
// if (num % i == 0) {
// flag = true;
// break;
// }
// }
// if (flag == true) {
// System.out.println(num + " is Not a Prime Number");
// } else {
// System.out.println(num + " is a Prime Number");
// }

// }
// }

/**
 * Pd15Practice wap a program to check user entered number is strong(sum of
 * factorial of each digit is equal to that number) number or not
 */
import java.util.Scanner;

public class Pd15Practice {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNumber = num;

        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += factorial(rem);
            num /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number");
        } else {
            System.out.println(originalNumber + " is not a Strong Number");
        }
    }
}