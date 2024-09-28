/**
 * Test1 10 print all even number between 1 to 20
 */
// public class Test1 {
// public static void main(String[] args) {
// for (int i = 1; i <= 20; i++) {
// if (i % 2 == 0) {
// System.out.print(i + ",");
// }
// }
// }
// }

/**
 * Test1 10 print factor of a given number
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// for (int i = 1; i <= n / 2; i++) {
// if (n % i == 0) {
// System.out.print(i + ",");
// }
// }
// System.out.print(n);
// }
// }

/**
 * Test1 10 wap to find a number is perfect number or not
 * perfect Number: - if sum of it's positive devisor
 * excluding number itself is equal to that number
 * eg: 6,28
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// int sum = 0;
// for (int i = 1; i <= n / 2; i++) {
// if (n % i == 0) {
// sum += i;
// }
// }
// if (sum == n) {
// System.out.println(n + " is Perfect Number");
// } else {
// System.out.println(n + " is not Perfect Number");
// }
// }
// }

/**
 * Test1 10 find factorial of a given number
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// int fact = 1;
// for (int i = 2; i <= n; i++) {
// fact *= i;
// }
// System.out.println("Factorial of a given number " + n + " is " + fact);
// }
// }

/**
 * Test1 11 count how many digit present in a number
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();
// int originalNumber = n;

// int cnt = 0;
// while (n > 0) {
// cnt++;
// n /= 10;
// }
// System.out.println("Number of digit present inside number " + originalNumber
// + " is " + cnt);
// }
// }

/**
 * Test1 11 sum of each digit present in a number
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// int sum = 0;
// while (n > 0) {
// int rem = n % 10;
// sum += rem;
// n /= 10;
// }
// System.out.println("Sum is " + sum);
// }
// }

/**
 * Test1 11 print product of each digit int number
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// int prod = 1;
// while (n > 0) {
// int rem = n % 10;
// prod *= rem;
// n /= 10;
// }
// System.out.println("Product is: " + prod);

// }
// }

/**
 * Test1 12 (Learnt While Loop) print all odd number between 1 to 20 using while
 * but not recommanded because we already know number of iteration
 */
// public class Test1 {
// public static void main(String[] args) {
// int i = 1;
// while (i <= 20) {
// if (i % 2 == 0) {
// System.out.print(i + ",");
// }
// i++;
// }
// }
// }

/**
 * Test1 13 check user enter number is spy or not
 * spy number: - sum of each digit should be product of each digit
 * eg: 2141
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// int sum = 0;
// int prod = 1;
// while (n > 0) {
// int rem = n % 10;
// sum += rem;
// prod *= rem;
// n /= 10;
// }
// if (sum == prod) {
// System.out.println("Is Spy NUMBER");
// } else {
// System.out.println("NOT Spy NUMBER");
// }
// }
// }

/**
 * Test1 13 wap to count how many even digit present in a number
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// int cnt = 0;
// while (n > 0) {
// int rem = n % 10;
// if (rem % 2 == 0)
// cnt++;
// n /= 10;
// }
// System.out.println("Count of Even Digit is: " + cnt);
// }
// }

/**
 * Test1 13 sum of odd digit present in a given number
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// int sum = 0;
// while (n > 0) {
// int rem = n % 10;
// if (rem % 2 == 1)
// sum += rem;
// n /= 10;
// }
// System.out.println("Sum of Odd Digit is: " + sum);
// }
// }

/**
 * Test1 13 WAP to reverse a given Number
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// System.out.println("Enter Number: ");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int rev = 0;
// while (n > 0) {
// int rem = n % 10;
// rev = rev * 10 + rem;
// n /= 10;
// }
// System.out.println("Reverse Number is " + rev);
// }
// }

/**
 * Test1 14 WAP to Check the Even Digit Sum is Even or Not Universaly True
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// int sum = 0;
// while (n > 0) {
// int rem = n % 10;
// if (rem % 2 == 0)
// sum += rem;
// n /= 10;
// }
// if (sum % 2 == 0) {
// System.out.println("Even");
// } else {
// System.out.println("Odd");
// }
// }
// }

/**
 * Test1 14 WAP to find given number is palindrome or not(If rev is equal to
 * original Number than Palindrome)
 * eg: 123,12321
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// System.out.println("Enter Number: ");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int originalNumber = n;

// int rev = 0;
// while (n > 0) {
// int rem = n % 10;
// rev = rev * 10 + rem;
// n /= 10;
// }
// if (originalNumber == rev) {
// System.out.println(originalNumber + " is Palindrome");
// } else {
// System.out.println(originalNumber + " is not Palindrome");
// }
// }
// }

/**
 * Test1 14 WAP To check Given Number is Neon(sum of digits of it's Squaer is
 * equal to that Number) or Not
 * eg: 9
 */
// import java.util.Scanner;

// public class Test1 {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number");
// int n = sc.nextInt();

// int square = n * n;
// boolean res = isNeon(square, n);
// if (res == true) {

// System.out.println(n + " Is Neon number");
// } else {
// System.out.println(n + " Is Not Neon number");
// }
// }

// static boolean isNeon(int n, int originalNumber) {
// int sum = 0;
// while (n > 0) {
// int rem = n % 10;
// sum += rem;
// n /= 10;
// }
// if (sum == originalNumber) {
// return true;
// }
// return false;
// }
// }

/**
 * Test1 14 User Enter Number is Prime or not
 */
// import java.util.Scanner;

// public class Test1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Number: ");
// int n = sc.nextInt();

// boolean prime = isPrime(n);
// if (prime == true) {
// System.out.println(n + " Is Prime");
// } else {
// System.out.println(n + " Is not Prime");
// }
// }

// static boolean isPrime(int n) {
// for (int i = 2; i < n; i++) {
// if (n % i == 0)
// return false;
// }
// return true;
// }
// }