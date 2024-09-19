
/*
 * **************************************Question
 * 1*****************************************
 */
/**
 * Pd11Practice write a program to count how many digit in user
 * entered number
 * we can take input with the help of buffer reader as well
 */
// import java.util.Scanner;

// public class Pd11Practice {

// public static void main(String[] args) {
// System.out.println("Enter number : ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// int digit = 0;
// while (num != 0) {// --> at the end num become ZERO
// // (we can take n>0 but it will cause problem in negative number
// // find lastDigit
// // Enter number :
// // -23456
// // Number of Digit is: 0 because of n>0)

// // finding last digit
// int rem = num % 10;

// // Counting Digit
// digit += 1;

// // Delete The digit to go for next digit
// num /= 10;
// }

// System.out.println("Number of Digit is: " + digit);
// }
// --> Trace (take n!=0 for negative number)
// n = 765
// 765>0 true rem=5 digit=1 num = 76
// 76>0 true rem=6 digit=2 num = 7
// 7>0 true rem=7 digit=3 num = 0
// 0>0 false exit from loop
// }

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

//     public static void main(String[] args) {
//         System.out.println("Enter Number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int sum = 0;
//         while (num > 0) {
//             int rem = num % 10;
//             sum += rem;
//             num /= 10;
//         }
//         System.out.println("Sum of Digit is: " + sum);
//     }
//     // num = 786;
//     // sum = 0;

//     // -->Trace
//     // 786>0 true rem=6 sum=6 num=78(After Deleting last Digit)
//     // 78>0 true rem=8 sum=14 num=7(After Deleting last Digit)
//     // 7>0 true rem=7 sum=21 num=0(After Deleting last Digit)
//     // 0>0 false Exit Loop
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
import java.util.Scanner;

public class Pd11Practice {

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int product = 1;
        while (num > 0) {
            int rem = num % 10;
            product *= rem;
            num /= 10;
        }
        System.out.println("Product of Digit is: " + product);
    }
}
/********************************************************************************/