
/* **************************************Question 1***************************************** */
/**
 * Pd11Practice write a program to count how many digit in user
 * entered number
 * we can take input with the help of buffer reader as well
 */
import java.util.Scanner;

public class Pd11Practice {

    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digit = 0;
        while (num > 0) {
            num /= 10;
            digit += 1;
        }

        System.out.println("Number of Digit is: " + digit);
    }
}
/*
 * *****************************************************************************
 * **
 */

/*
 * *************************************Question2*******************************
 * ***********
 */
/**
 * Pd11Practice wap to print sum of digit in user entered number
 */
// import java.util.Scanner;

// public class Pd11Practice {

// public static void main(String[] args) {
// System.out.println("Enter Number: ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// int sum = 0;
// while (num > 0) {
// int rem = num % 10;
// sum += rem;
// num /= 10;
// }
// System.out.println("Sum of Digit is: " + sum);
// }
// }
/*
 * *****************************************************************************
 * **
 */

/*
 * ********************************Question
 * 3***********************************************
 */
/**
 * Pd11Practice wap to print product of digit in user entered number
 */
// import java.util.Scanner;

// public class Pd11Practice {

// public static void main(String[] args) {
// System.out.println("Enter Number: ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// int product = 1;
// while (num > 0) {
// int rem = num % 10;
// product *= rem;
// num /= 10;
// }
// System.out.println("Product of Digit is: " + product);
// }
// }
/********************************************************************************/