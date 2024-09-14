
/**
 * Pd9 Check Even Odd Using Switch Case Question 1
 */
// import java.util.Scanner;

// public class Pd9 {

//     public static void main(String[] args) {
//         System.out.println("Enter Number u wanna Check for Even Odd");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         /**************************************** */
//         int rem = num % 2;
//         // and than put rem inside switch it will also work fine
//         /**************************************** */

//         switch (num % 2) { // -->Specify Expression Only Not Condition--> Condition is Expression Which
//                            // Result in Boolean Value
//             case 0:
//                 System.out.println(num + " Number is Even ");
//                 break;
//             case 1:
//                 System.out.println(num + " Number is Odd ");// --> Possible Reminder 0 and 1 Here Only
//                 // No Need to put break at last Statement

//                 /***************************************************** */
//                 // This will also Work
//                 // default:
//                 // System.out.println(num + " Number is Odd ");
//                 // break;
//                 /***************************************************** */
//         }
//     }
// }

/**
 * Pd9 Question 2
 */
import java.util.Scanner;

public class Pd9 {
    public static void main(String[] args) {
        double balanceAtStarting = 10000;

        System.out.println("Enter Amount u wanna Withdraw");
        Scanner sc = new Scanner(System.in);
        double withDrawAmount = sc.nextDouble();

        double remainAmount = 0;
        if (balanceAtStarting >= withDrawAmount) {
            remainAmount = balanceAtStarting - withDrawAmount;
            System.out.println("Transaction SuccessFul Remaining Amount is: " + remainAmount);
        } else {
            System.out.println("Transaction Failed Enter Valid Amount");
        }

    }
}