import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        // default can be anywhere
        // expression should be int(byte/short/char)<-- Implicit Conversion
        // or String

        /************************************* */
        // wap to accept number and display the following options/menu
        // 1. Add
        // 2. Subtract
        // 3. Multiply
        // 4. Divide
        // Display Result Based on user Choice
        // Scanner sc = new Scanner(System.in);

        // // Local variable always initialized otherwise error
        // double res = 0.0;

        // System.out.println("Enter va1: ");
        // Double val1 = sc.nextDouble();

        // System.out.println("Enter va2: ");
        // Double val2 = sc.nextDouble();

        // System.out.println("Enter the option: ");
        // System.out.println("1.Add");
        // System.out.println("2.Subtract");
        // System.out.println("3.Multiply");
        // System.out.println("4.Divide");
        // int option = sc.nextInt();

        // switch (option) {
        // case 1:
        // res = val1 + val2;
        // break;
        // case 2:
        // res = val1 - val2;
        // break;
        // // if default in between put break if at laast don't put break
        // default:
        // System.out.println("Enter Valid Option: ");
        // // to came out of application it should be with default only
        // System.exit(1);
        // // break; // work
        // case 3:
        // res = val1 * val2;
        // break;
        // case 4:
        // res = val1 / val2;
        // break;

        // }
        // System.out.println("Result: " + res);
        /************************************* */

        /************************************* */
        // Loops while
        // wap to Display Even number from 1 to 100

        // int i = 1;
        // while (i < 100) {
        // // for Even
        // if (i % 2 == 0) {
        // System.out.print(i + ",");
        // }
        // // for odd
        // // if (i % 2 == 1) {
        // // System.out.print(i + ",");
        // // }
        // i++;
        // }
        // System.out.print(i);
        /************************************* */

        /************************************* */
        // wap to find sum of given 10 numbers
        // Scanner sc = new Scanner(System.in);
        // int n, i = 1, sum = 0;
        // while (i <= 10) {
        // System.out.println("Enter Number: ");
        // n = sc.nextInt();
        // sum = sum + n; // sum+=n;
        // i++;
        // }
        // System.out.println("Sum is: " + sum);
        /************************************* */

        /************************************* */
        // Wap to find biggest of given 10 number
        // Scanner sc = new Scanner(System.in);
        // int n, i = 1, big = 0;
        // while (i <= 10) {
        // System.out.println("Enter Number: ");
        // n = sc.nextInt();
        // if (n > big) {
        // big = n;
        // }
        // i++;
        // }
        // System.out.println("Biggest Number is: " + big);
        /************************************* */

        /************************************* */
        // Assignment: 2
        // Q1) wap to check whether the given char is vowel or consonent

        // System.out.println("Enter the char u wanna check for vowell or consonent: ");
        // Scanner sc = new Scanner(System.in);
        // char ch = sc.nextLine().charAt(0);
        // ch = Character.toLowerCase(ch);

        // switch (ch) {
        // case 'a':
        // System.out.println(ch + " vowel ");
        // break;
        // case 'e':
        // System.out.println(ch + " vowel ");
        // break;
        // case 'i':
        // System.out.println(ch + " vowel ");
        // break;
        // default:
        // if (Character.isLetter(ch)) {
        // System.out.println(ch + " is Consonent");
        // } else {
        // System.out.println(ch + " is not a letter");
        // }
        // System.exit(2);
        // case 'o':
        // System.out.println(ch + " vowel ");
        // break;
        // case 'u':
        // System.out.println(ch + " vowel ");
        // break;
        // }
        // sc.close();

        // Q2) wap to find sum of even number and sum of odd numbers from 1 to 100

        // int i = 1;
        // int sumOfOdd = 0, sumOfEven = 0;
        // while (i <= 100) {
        // if (i % 2 == 0) {
        // sumOfEven += i;
        // } else {
        // sumOfOdd += i;
        // }
        // i++;
        // }
        // System.out.println("Sum of Even: " + sumOfEven);
        // System.out.println("Sum of Odd: " + sumOfOdd);

        // Q3) wap to find smallest to given 10 number
        // Scanner sc = new Scanner(System.in);
        // int n, i = 1, small = Integer.MAX_VALUE;
        // while (i <= 10) {
        // System.out.println("Enter Number: ");
        // n = sc.nextInt();
        // if (n < small) {
        // small = n;
        // }
        // i++;
        // }
        // System.out.println("Smallest Number is: " + small);

        // Q4) wap to find sum of digits of a given number
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // while (n > 0) {
        // int rem = n % 10;
        // sum += rem;
        // n /= 10;
        // }
        // System.out.println("Sum is: " + sum);
        /************************************* */

    }
}
