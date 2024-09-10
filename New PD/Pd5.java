import java.util.Scanner;

/**
 * Program 1
 */
public class Pd5 {
    static void checkEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

    }

    static void checkEvenOddUsingDivisibilty(int num) {
        // int rem = num % 10;
        // if (rem % 2 == 0) {
        // System.out.println(num + " is Even");

        // } else {
        // System.out.println(num + " is Odd");

        // }

        // Tutor one
        if ((num / 2) * 2 == num) {
            System.out.println(num + " is Even");

        } else {
            System.out.println(num + " is Odd");

        }
    }

    static void checkForLeapYear(int year) {
        // Divisible by 4 or divisble by 100 and
        if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 400 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + " is a Leap Year");
            }
        } else {
            System.out.println(year + " is  not a Leap Year");
        }
    }

    static void checkForN(int n) {
        if (n > 10) {
            System.out.println(n + " is greater than 10");
        } else if (n < 10) {
            System.out.println(n + " is Lesser than 10");
        } else {
            System.out.println(n + " is equal to 10");
        }
    }

    public static void main(String[] args) {
        // else should be always associated with if
        // do not write anything between if/else
        // Q1) Even odd Check
        // User Input
        // System.out.println("Enter number u wanna check for Even or Odd");
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // checkEvenOdd(num);

        // Q2) Even Odd Checking Without using Modulo
        // System.out.println("Enter number u wanna check for Even or Odd");
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // checkEvenOddUsingDivisibilty(num);

        // Q3) check if year is leap year or not --> partially Correct
        // System.out.println("Enter Year u wanna chec..k fo Leap");
        // Scanner s = new Scanner(System.in);
        // int year = s.nextInt();
        // checkForLeapYear(year);

        // Q4) check n is <, >, = to 10 // Three Posibility over here so else if Ladder
        // used
        System.out.println("Enter Number u wanna check for Greater Lesser or Equal to 10");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        checkForN(n);

    }
}