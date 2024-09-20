
/**
 * Pd13Practice wap to count even digits are present in given number
 */
// import java.util.Scanner;

// public class Pd13Practice {
//     public static void main(String[] args) {
//         System.out.println("Enter Number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int noOfEvenDigit = 0;
//         while (num != 0) {
//             // Find Last Digit
//             int rem = num % 10;
//             if (rem % 2 == 0) {
//                 // counting No of Even Digit
//                 noOfEvenDigit++;
//             }
//             // Deleting Last Digit
//             num /= 10;
//         }
//         // --> Trace num = 876;
//         // noOfEvenDigit = 0;

//         // noOfEvenDigit = 0 true rem = 6 noOfEvenDigit = 1 num = 87
//         // noOfEvenDigit = 1 true rem = 7 noOfEvenDigit = 1 num = 8
//         // noOfEvenDigit = 1 true rem = 8 noOfEvenDigit = 2 num = 0
//         // noOfEvenDigit = 2 false (EXIT LOOP)

//         System.out.println("Number of Even Digits are: " + noOfEvenDigit);

//     }
// }

/**
 * Pd13Practice wap to sum odd digits are present in given number
 */
import java.util.Scanner;

public class Pd13Practice {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sumOfOddDigit = 0;
        while (num != 0) {
            int rem = num % 10;
            if (rem % 2 == 1) {
                sumOfOddDigit += rem;
            }
            num /= 10;
        }
        System.out.println("Number of Even Digits are: " + sumOfOddDigit);

    }
}

/**
 * Pd13Practice wap to reverse a number
 */
// import java.util.Scanner;

// public class Pd13Practice {
// public static void main(String[] args) {
// System.out.println("Enter Number: ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// int rev = 0;
// while (num != 0) {
// int rem = num % 10;
// rev = rev * 10 + rem;
// num /= 10;
// }
// System.out.println("Reverse Number is: " + rev);

// }
// }