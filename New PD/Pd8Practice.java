/**
 * find Biggest number out of three --> Mine one
 */
// public class Pd8Practice {
// public static void main(String[] args) {
// // using big variable
// int num1 = 33;
// int num2 = 345;
// int num3 = 34433546;
// int big = num1;
// if (num2 > big) {
// big = num2;
// }
// if (num3 > big) {
// big = num3;
// }
// System.out.println("Biggest Number is: " + big);
// }

// }

/**
 * Pd8 finding Smallest Number among three
 */
// public class Pd8Practice {

// public static void main(String[] args) {
// int num1 = 234;
// int num2 = 23456754;
// int num3 = 214;
// if (num1 < num2 && num1 < num3) {
// System.out.println("Smallest Number: " + num1);
// } else if (num2 < num3) {
// System.out.println("Smallest Number: " + num2);
// } else {
// System.out.println("Smallest Number: " + num3);
// }
// }
// }

/**
 * Pd8Practice finding largest number among two using ternary
 */
// public class Pd8Practice {
// public static void main(String[] args) {
// int a = 40, b = 30;
// // Syntax: (Condition)?true Body:false Body;
// int big = (a > b) ? a : b;
// System.out.println("Biggest Number is: " + big);

// /*******************************************************************************
// */
// // String big = (a > b) ? a : b;--> resultant value type should be same as
// // resultant variable type (ERROR Here CTE)
// String bigStr = (a > b) ? "a is Biggest" : "b is Biggest"; // --> this will
// work fine
// System.out.println("Biggest Number is: " + bigStr);
// /*******************************************************************************
// */

// }
// }

/**
 * Pd8Practice finding largest number among three using ternary
 */
// public class Pd8Practice {
// public static void main(String[] args) {
// int a = 34;
// int b = 34345;
// int c = 234;
// // Syntax: (Condition)?true Body:false Body;
// int big = (a > b && a > c) ? a : (b > c) ? b : c;
// System.out.println("Biggest Number is: " + big);
// }
// }

/**
 * Pd8Practice find Smallest among three using ternary
 */
// public class Pd8Practice {
// public static void main(String[] args) {
// int a = 20, b = 30, c = 40;
// // Same as if else Ladder (if, else if, else)
// int small = (a < b && a < c) ? a : (b < c) ? b : c;
// System.out.println("Smallest Number is: " + small);
// }

// }

/**
 * Pd8Practice Biggest Number among four using ternary
 */
public class Pd8Practice {
    public static void main(String[] args) {
        int a = 3430, b = 450, c = 3453430, d = 20;
        int big = (a > b && a > c && a > d) ? a : (b > c && b > d) ? b : (c > d) ? c : d;
        System.out.println("Biggest Number is: " + big);
    }
}