/**
 * find Biggest number out of three
 */
// public class Pd8Practice {
//     public static void main(String[] args) {
//         // using big variable
//         int num1 = 33;
//         int num2 = 345;
//         int num3 = 34433546;
//         int big = num1;
//         if (num2 > big) {
//             big = num2;
//         }
//         if (num3 > big) {
//             big = num3;
//         }
//         System.out.println("Biggest Number is: " + big);
//     }

// }

/**
 * Pd8 finding Smallest Number among three
 */
// public class Pd8Practice {

//     public static void main(String[] args) {
//         int num1 = 234;
//         int num2 = 23456754;
//         int num3 = 214;
//         if (num1 < num2 && num1 < num3) {
//             System.out.println("Smallest  Number: " + num1);
//         } else if (num2 < num3) {
//             System.out.println("Smallest Number: " + num2);
//         } else {
//             System.out.println("Smallest Number: " + num3);
//         }
//     }
// }

/**
 * Pd8Practice finding largest number among three using ternary
 */
public class Pd8Practice {
    public static void main(String[] args) {
        int a = 34;
        int b = 34345;
        int c = 234;
        int res = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("Biggest Number is: " + res);
    }
}