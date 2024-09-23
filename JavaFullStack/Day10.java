
/**
 * Day11 do while loop
 * in case of while loop the condition is checked befor the statements where as
 * in case of do while loop the condition is checked after the statements
 * Bank.Java
 * when the value of condition is accepted  *inside the loop suggested to go for do while  * loop, in while we will get Error.
 */
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currentBalance = 0, deposit, withdraw;
        int enterdOption;
        do {
            System.out.println("Enter Option: ");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display Balance");
            System.out.println("4.Exit");
            enterdOption = sc.nextInt();
            switch (enterdOption) {
                case 1:
                    System.out.println("Enter Amount u wanna Deposit: ");
                    deposit = sc.nextDouble();
                    currentBalance += deposit;
                    break;
                case 2:
                    System.out.println("Enter Amount u wanna Withdraw: ");
                    withdraw = sc.nextDouble();
                    if (withdraw <= currentBalance) {
                        currentBalance -= withdraw;
                        System.out.println("Withdraw Successfull");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 3:
                    System.out.println("ur Current Balance is: " + currentBalance);
                    break;
                case 4:
                    System.out.println("Thnx for using our service");
                    // System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Choice: ");
            }
        } while (enterdOption != 4);
    }
}