/**
 * Pd19 Prime Number between 1 to 100
 */
// public class Pd19 {
// public static void main(String[] args) {
// for (int i = 2; i <= 100; i++) {
// boolean res = isPrime(i);
// if (res == true) {
// System.out.print(i + " ");
// }
// }
// }

// static boolean isPrime(int n) {
// /************************ My Way******************************** */
// // using Factor
// // here we are avoiding 1 and itself a factor that's why (2 to =n/2)
// // int fact = 0;
// // for (int i = 2; i <= n / 2; i++) {
// // if (n % i == 0) {
// // // fact++;
// // }
// // }
// // if (fact == 0) {// according to looping condition it could be 1 or 2
// // System.out.print(n + " ");
// // return true;
// // }
// // return false;
// /******************************************************** */

// // using Factor
// // here we are avoiding 1 and itself a factor that's why (2 to =n/2)
// // All Case Included
// if (n <= 1) {
// return false;
// }
// // checking it's having factor 1 or other than itself or not
// for (int i = 2; i <= n / 2; i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }
// }

/**
 * Pd19 Prime Number between 1 to 50 sum
 */
// public class Pd19 {
//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 2; i <= 50; i++) {
//             boolean res = isPrime(i);
//             if (res == true) {
//                 sum += i;
//             }
//         }
//         System.out.println("Sum is " + sum);
//     }

//     static boolean isPrime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         // checking it's having factor 1 or other than itself or not
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

/**
 * Pd19 WAP to print n first n prime number
 */
import java.util.Scanner;

public class Pd19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        for(int i=2; i)
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // checking it's having factor 1 or other than itself or not
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}