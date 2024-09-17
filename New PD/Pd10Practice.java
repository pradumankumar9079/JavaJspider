// import java.util.Scanner;

// public class Pd10Practice {
//     public static void main(String[] args) {
//         // write a program to check user entered number is perfect number or not

//         /*************************************************************************** */
//         // after n/2 will get only one factor that's itself only so better to write n/2
//         // instead of n
//         /*************************************************************************** */

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The number u wanna find for Perfect or not: ");
//         int num = sc.nextInt();
//         int sum = 0;

//         for (int i = 1; i <= num / 2; i++) {
//             if (num % i == 0) {
//                 sum += i;
//                 // System.out.print(i + " ");
//             }
//         }
//         // System.out.println();
//         if (sum == num) {
//             System.out.println(num + " is a Perfect Number:");
//         } else {
//             System.out.println(num + " is not a perfect number:");
//         }
//     }
// }
// 6--> 1,2,3
// 6 ,28,496 --> These are perfect number
// 24 --> 1 2, 3,4 6,8,12

/**
 * Pd10Practice  Find Factorial of a given number try with recursion
 */
// import java.util.Scanner;

// public class Pd10Practice {

//     public static void main(String[] args) {
//         System.out.println("Enter number u wanna find Factorial: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int fact = 1;

//         // First Way
//         // for (int i = 1; i <= n; i++) {
//         // fact *= i;
//         // }
//         // Second Way Opposite looping it will also work don't declare fact variable
//         // inside loop it will get initialized everytime --> Don't do it
//         // it will not work for bigger number return garbage or 0 sometimes

//         for (int i = n; i >= 2; i--)
//             fact *= i;

//         System.out.println(n + " Factorial is " + fact);
//     }
// }

/**
 * Pd10Practice --> Break means come out of particular loop
 */
public class Pd10Practice {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= 5; j++) {
                if (j == 2 || j == 4) {
                    break;
                }
                System.out.print(j + " ");
                System.out.println();
            }
        }
    }
}