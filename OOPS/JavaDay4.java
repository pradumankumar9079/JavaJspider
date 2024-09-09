/**
 * Program 1
 */
// public class JavaDay4 {
// // Step 1: declare return type based on value to be returned like here int
// it's
// // like a making Promise
// static int test() {
// // Step 2: check it's compatible with return type
// return 10;
// }

// public static void main(String[] args) {
// System.out.println("Program Started");

// // Created Varible which will hold the value
// int val = test();
// System.out.println(" Returned Value is: " + val);

// /*
// * **********************************************
// *
// */

// // instead fo storing directly print
// System.out.println("Returned Value is " + test());

// System.out.println("Program Ended");
// }
// }

/**
 * Program 2
 */
// public class JavaDay4 {
// // not possible with void
// static char play() {
// return 'J';
// }

// static double disp() {
// return 4.5;
// }

// public static void main(String[] args) {
// System.out.println("Program Started");
// // Directly Displaying
// System.out.println("Returned Value " + disp());

// /* ********************************************************* */
// // Firstly Store and than Display
// char ch = play();
// System.out.println("Returned Value " + ch);
// System.out.println("Program Ended");
// }
// }

/**
 * Program 3 both returning and passing --> use of passing of returning in Real
 * world like banking services,Login Services--> like Entering uname and
 * password for Verification and we are getting Response, QR Payment Service
 */
// true
// main()<-------------------- method()
// public class JavaDay4 {
// static boolean method() {
// return true;
// }

// public static void main(String[] args) {
// System.out.println("Program Started");
// System.out.println("Returned Value is " + method());
// System.out.println("Program Ended");
// }
// }

/**
 * Example 4 --> Both Passing As Well As Returning
 */
// public class JavaDay4 {
// static int addition(int a, int b) {
// int sum = a + b;
// return sum;
// }

// public static void main(String[] args) {
// System.out.println("Program Started");
// int a = 2234;
// int b = 4556;
// int res = addition(a, b);
// System.out.println("Sum of " + a + " And " + b + " is " + res);
// System.out.println("Program Ended");
// }
// }

/**
 * Program 5 ---> Example Related to our Business
 */
// public class JavaDay4 {
// static boolean verify(int num) {

// // if else not Execute at the same time
// // if (num % 2 == 0) {

// // return true;
// // } else {

// // return false;
// // }

// /* **************************************************************** */
// // So We can go With this One
// if (num % 2 == 0)
// return true;
// return false;
// }

// public static void main(String[] args) {
// System.out.println("Program Started");
// System.out.println("Status " + verify(10));
// System.out.println("Status " + verify(32455));
// System.out.println("Status " + verify(4546));
// System.out.println("Status " + verify(348));
// System.out.println("Status " + verify(437));

// // Mine
// // int num = 34568;
// // if (verify(num) == true) {
// // System.out.println(num + " Number is Even ");
// // } else {
// // System.out.println(num + " Number is Odd ");

// // }
// System.out.println("Program Ended");
// }
// }

/**
 * Program 5 --> Square of a number -->do it for Cube
 */
// public class JavaDay4 {
// // Use Double for Math.pow()
// static int squre(int n) {
// int sq = n * n;
// return sq;

// // Math.pow is always returning double value
// // return Math.pow(n, 2);
// }

// public static void main(String[] args) {
// System.out.println("Program Started");
// System.out.println("Square of number " + 823 + " is " + squre(823));
// System.out.println("Square of number " + 293 + " is " + squre(293));
// System.out.println("Square of number " + 2 + " is " + squre(2));
// System.out.println("Square of number " + 495 + " is " + squre(495));
// System.out.println("Program Ended");
// }

/**
 * Program 6 --> Cube of a number
 */
// public class JavaDay4 {
// // Use Double for Math.pow()
// static int cube(int n) {
// int cu = n * n * n;
// return cu;

// // Math.pow is always returning double value
// // return Math.pow(n, 3);
// }

// public static void main(String[] args) {
// System.out.println("Program Started");
// System.out.println("Cube of number " + 823 + " is " + cube(823));
// System.out.println("Cube of number " + 293 + " is " + cube(293));
// System.out.println("Cube of number " + 2 + " is " + cube(2));
// System.out.println("Cube of number " + 495 + " is " + cube(495));
// System.out.println("Program Ended");
// }
// }

// Void Return nothing
/**
 * Program 7 --> Will generate Error void Return Type is here-->incompatible
 * types: unexpected return value and can get (Lossy Conversion Error during int
 * but returning double)
 */

// public class JavaDay4 {
// static void test() {
// return 420;
// }

// public static void main(String[] args) {
// test();
// }

// }

/**
 * Program 8 --> it will work bcoz i called method than i failed to Capture
 */
// static int test() {
// return 12;
// }

// public static void main(String[] args) {
// test(); // Value Lost
// }
// }

// Can't Declare Two Return Type
// public class JavaDay4 {
// static int test() {
// return 12;
// }

// public static void main(String[] args) {
// test(); // Value Lost
// }
// }

// Some Common Question
// Can We Declare a method Without Arguments: Yes
// Can We Declare a method Without Return Type: No but it can be void

/**
 * Program 9 --> Some Common Question Answer
 */
// public class JavaDay4 {
// static void test() { // Method Without Argument Without Return Value

// }

// static void play(int a) { // Method With Argument Without Return Value

// }

// static double disp() { // Method Without Argument With Return Value
// return 8.9;
// }

// static boolean send(int a) { // Method With Argument With Return Value
// return false;
// }

// public static void main(String[] args) {
// // System.out.println(test()); // We can Complie but not run
// // System.out.println(play(2));
// System.out.println(disp());
// System.out.println(send(5));
// }
// }

/**
 * RECURSION IN METHOD --> NEW TOPIC INSIDE METHOD
 * -->Exception in thread "main" java.lang.StackOverflowError Not Cotrolled
 */
/********************************************************* */
// A method is said to be in recursion in below 2 Scenarions
// The Called method gives a call to Calling method
// A------>B-------->A--------->B------->A

/********************************************************* */

// public class JavaDay4 {
// static void test() {
// System.out.println("Executing test()........");
// play();
// }

// static void play() {
// System.out.println("Executing Play()........");
// test();
// }

// public static void main(String[] args) {
// test();
// }
// }

/**
 * Controlled RECURSION
 */
// public class JavaDay4 {
// // disp() is calling it self again and again here
// static void disp() {
// System.out.println("Executing disp()........");
// disp();
// }

// public static void main(String[] args) {
// disp();
// }
// }

/**
 * Activity 1 --> displayAscending Using Recursion 1 to 6 // Controlled
 * Recursion // 1 2 3 4 5
 */
// public class JavaDay4 {
// static void displayAscending(int a) {
// System.out.println(a);

// // Base Condition to Stop Looping after certain condition hit
// if (a < 5) {
// a++;
// displayAscending(a);
// }

// }

// public static void main(String[] args) {
// displayAscending(1);
// }
// }

/**
 * Activity 2 --> displayDescending Using Recursion 6 to 1 // Controlled
 * Recursion // 5 4 3 2 1 0
 */
// public class JavaDay4 {
// static void displayDescending(int a) { // 5 debug it to Properly UnderStand
// System.out.println(a);

// // Base Condition to Stop Looping after certain condition hit
// if (a > 0) {
// a--;
// displayDescending(a);
// }

// }

// public static void main(String[] args) {
// displayDescending(5);
// }
// }

/**
 * Activity 3 --> Recursion Eg(Table of 7)--> Debug it For Better UnderStanding
 */
/************************************************************************************** */
// Prefer Loops Over RECURSION
/************************************************************************************** */
// public class JavaDay4 {
// static void display(int n) {
// System.out.println(n);
// if (n < 70) {
// n = n + 7;
// display(n);
// }
// }

// public static void main(String[] args) {
// display(7);
// }
// }