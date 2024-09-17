
/**
 * Pd10 pin Verify Than Withdraw
 */
// import java.util.Scanner;

// public class Pd10 {

// public static void main(String[] args) {
// // Atm Opeartion
// // (10,20,100 by Default it's int, 10.05,10.78 by default it's Double)
// int pin = 2024;
// System.out.println("Enter Pin: ");
// Scanner sc = new Scanner(System.in);

// int enteredPin = sc.nextInt();
// Double initialBalance = 20000.0;

// // Pin Validation
// if (pin == enteredPin) {
// System.out.println("Enter Amount u wanna Withdraw: ");
// Double withDrawAmount = sc.nextDouble();
// // if Pin correct permit to Withdraw
// if (initialBalance >= withDrawAmount) {
// System.out.println("Withdraw Successful Remaining Balance is: " +
// (initialBalance - withDrawAmount));
// } else {
// System.out.println("Insufficient Balance:");
// }

// } else {
// System.out.println("Incorrect Pin Please Try Again: ");
// }
// }
// }

/**
 * Pd10 print even number between 1 to 20
 */
// public class Pd10 {

// public static void main(String[] args) {
// for (int i = 2; i < 20; i = i + 2 ) {
// // if (i % 2 == 0) {
// System.out.print(i + " ");
// // }
// }
// System.out.println();
// }
// }

/**
 * Pd10 print factor(Divisible) or divisor same for given number
 */
import java.util.Scanner;

public class Pd10 {
    public static void main(String[] args) {
        System.out.println("Enter Number u wanna print Factor: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Factor for num: " + num);
        // Don't Start from zero get (java.lang.ArithmeticException)
        // (it is recommanded for less iteration) check for (n/2) afer that accept
        // itself no factor
        // So check for (n/2)

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(num);
        System.out.println();
    }
}