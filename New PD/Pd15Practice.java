
/**
 * Pd15Practice wap to check whether Entered Number Prime or Not
 */
// import java.util.Scanner;

// public class Pd15Practice {
//     public static void main(String[] args) {
//         System.out.println("Enter Number: ");
//          Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         boolean flag = false;
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {
//                 flag = true;
//                 break;
//             }
//         }
//         if (flag == true) {
//             System.out.println(num + " is Not a Prime Number");
//         } else {
//             System.out.println(num + " is a Prime Number");
//         }

//     }
// }

/**
 * Pd15Practice wap a program to check user entered number is strong(sum of
 * factorial of each digit is equal to that number) number or not
 * Special Note: Use method for everything
 */
import java.util.Scanner;

public class Pd15Practice {
    static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    static void isStrongNumber(int num) {// Recommended to use boolean
        // making static to avoid object creation
        int originalNumber = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += factorial(rem);// method chaining calling method inside method
            num /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number");
        } else {
            System.out.println(originalNumber + " is not a Strong Number");
        }
    }

    /***************************************************************************************** */
    // main method is bit different from other like if i will remove static it will
    // not work
    // because execution start from main only by JVM
    /***************************************************************************************** */

    static public void main(String[] a) {// --> Swapping Access Modifier and Non
        // Access Modifier Possible
        // we can also change args to any other name but don't remove bracket Error
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        /********************************************************************** */
        // here we are calling it dirctly because it's present in same class
        // if class differ we will call with className

        // Pd15Practice.isStrongNumber(num);// internally it's passing n value // This
        // is also correct

        // Pd15Practice p1 = new Pd15Practice(); // This will also work for not static
        // p1.isStrongNumber(num);// internally it's passing n value

        isStrongNumber(num);
        /********************************************************************** */

    }

}