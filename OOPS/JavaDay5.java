/**
 * Program 1 --> class name given by programmer and method as well it's is
 * Identifier class Program1 --> correct class, 1Program --> Wrong, class
 * P1rogram --> Correct,
 * $ and _ Allowed But Not Recommended
 * Key Word--> Not Allowed It's Reserved
 * Blank Spaces are not Allowed like class Prime Number(){} --> NOT ALLOWED
 */
// public class JavaDay5 {
// public static void main(String[] args) {

// }
// }

/**
 * Naming Convention --> PascalCase(First Letter of Each and Every Word is
 * Capital like CredentialManager, class Login) for ClassName
 */
// camelCase(eg: test(),printBill, updateEmployeeSalary) first letter is small
// thane wd3 Capital For Method And Variable(age,employeeId,creditCardNumber)
// public class JavaDay5 {

// public static void main(String[] args) {

// }
// }

/**
 * Scanner --> Predefined Program to take user input
 */
// // STEP: 1
// import java.util.Scanner;
// // import java.util.*; --> Not Good Practice

// public class JavaDay5 {
// public static void main(String[] args) {
// System.out.println("Give Some Input: ");
// // STEP 2:
// // Creating Object Of Scanner Class
// // ClassName objName = new ClassName();--> Syntax
// // Sample s = new Sample(); --> Like This

// Scanner s = new Scanner(System.in);

// // STEP 3: Reading Value
// /********************************************************** */
// // Taking String as User Input
// // String name = s.nextLine();
// // System.out.println("Hey: " + name);
// /********************************************************** */

// // Taking Character as User Input
// // char ch = s.nextLine().charAt(0);
// // System.out.println("Hey: " + ch);

// /********************************************************** */
// // Taking Integer as User Input
// int num = s.nextInt();
// System.out.println(num);
// /********************************************************** */

// }
// }
/**
 * Check For Even Odd But Take User Input
 */
// import java.util.Scanner;

// public class JavaDay5 {
// static void checkForEvenOdd(int num) {
// if (num % 2 == 0) {
// System.out.println(num + " is Even");
// } else {
// System.out.println(num + " is Odd");
// }
// }

// public static void main(String[] args) {
// System.out.println("Enter the number u wanna check foe Even Or Odd: ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// checkForEvenOdd(num);
// }
// }

/**
 * Taking Double Value As User Input
 */
// import java.util.Scanner;

// public class JavaDay5 {
// static void addition(double n1, double n2) {
// double sum = n1 + n2;
// System.out.println(sum);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter Value 1: ");
// double n1 = sc.nextDouble();

// System.out.println("Enter Value 2: ");
// double n2 = sc.nextDouble();

// addition(n1, n2);
// }
// }

/**
 * Some More Example of taking User Input
 */
import java.util.Scanner;

public class JavaDay5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Integer: ");
        int a = sc.nextInt();

        System.out.println(" Enter Double: ");
        double d = sc.nextDouble();

        System.out.println(" Enter Boolean: ");
        boolean b = sc.nextBoolean(); // Don't Give User Input as 0 or 1 it will Accept Only TRUE OF FALSE

        System.out.println("Integer: " + a);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);
    }
}
