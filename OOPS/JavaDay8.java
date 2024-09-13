
/*
 * JavaDay8 Example 1 --> Scanner
 */
// import java.util.Scanner; //Step: 1

// public class JavaDay8 {
//     public static void main(String[] args) {
//         System.out.println("Enter Number u wanna check for even or odd: ");
//         Scanner sc = new Scanner(System.in); // Step: 2
//         int num = sc.nextInt();// Step: 3
//         if (num % 2 == 0) {
//             System.out.println(num + " is Even");
//         } else {
//             System.out.println(num + " is Odd");
//         }
//     }

// }

/**
 * JavaDay8 Example 2
 */
// import java.util.Scanner; //1

// public class JavaDay8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);// 2
//         System.out.println("Enter value1: ");
//         double num1 = sc.nextDouble();// 3
//         System.out.println("Enter value2: ");
//         double num2 = sc.nextDouble();// 3
//         double sum = num1 + num2;
//         System.out.println("Result: " + sum);
//     }

// }

/**
 * JavaDay8 Example 3
 */
// import java.util.Scanner; //1

// public class JavaDay8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);// 2

//         System.out.println("Enter Integer value: ");
//         int a = sc.nextInt();// 3-->Integer Value

//         System.out.println("Enter Double value: ");
//         double d = sc.nextDouble();// 3 --> Double Value

//         System.out.println("Enter Boolean value: ");
//         boolean b = sc.nextBoolean();// 3 --> Boolean Value

//         System.out.println("Integer: " + a);
//         System.out.println("Double: " + d);
//         System.out.println("Boolean: " + b);
//     }

// }

/**
 * JavaDay8 Example 4 String Value Scanner Input
 * next() Read a Single World
 * nextLine() Read a Entire Word
 * Avoid Using String Input nextLine()
 */
// import java.util.Scanner;

// public class JavaDay8 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter String: ");
//         String str = sc.nextLine();
//         System.out.println("String Value is: " + str);

//         System.out.println("Enter String Again: ");
//         String str1 = sc.next();// --> it will take one word as input after space it break
//         System.out.println("String Value is: " + str1);
//     }
// }

/**
 * JavaDay8 Example 5 Character Input With Scanner
 * We Can't read char values in Java Using Scanner.
 * In This Example we are reading String and Extracting First Character.
 */
// import java.util.Scanner;

// public class JavaDay8 {

//     public static void main(String[] args) {
//         System.out.println("Enter Character: ");
//         Scanner sc = new Scanner(System.in);
//         char ch = sc.next().charAt(0); // --> Trick No Built in Method(Reading String Extracting First Char)
//         System.out.println("Char Value is: " + ch);
//     }
// }

/**
 * JavaDay8 Example 6
 */
// import java.util.Scanner;

// public class JavaDay8 {
//     // (InputMismatchException When User input other than Desired Value) like here i
//     // am entering char instead of int
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Value: ");
//         int val = sc.nextInt();
//         System.out.println("Value is: " + val);
//     }
// }

/**
 * JavaDay8 Arrays Started
 */
public class JavaDay8 {
    public static void main(String[] args) {
        // Multi Line
        // int[] arr; // Initialization
        // arr = new int[4]; // Declaration

        /************************************************************************* */
        // First Way to Create an Array
        // Single line
        int[] arrInt = new int[10];
        Double[] arrDouble = new Double[5];
        char[] arrCharacter = new char[7];
        /************************************************************************* */

        // Second Way to Create an Array
        int[] dobs = { 25, 12, 01 };
        double[] heights = { 5.8, 5.4, 5.8, 5.6, 5.9, 5.6, 5.7 };
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
    }

}