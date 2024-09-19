/**
 * JavaDay10
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// /******************************************************* */
// int arr[] = { 13, 14, 15, 11, 16 };
// System.out.println("Even Number is: ");
// // Even Number inside Array
// for (int i = 0; i < arr.length; i++) {
// // System.out.print(arr[i] + " ");

// if (arr[i] % 2 == 0) {
// System.out.print(arr[i] + " ");
// }
// }
// /******************************************************* */

// /******************************************************* */
// System.out.println();
// System.out.println("Odd Number is: ");
// // Odd Number inside Array
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] % 2 != 0) {
// System.out.print(arr[i] + " ");
// }
// }
// System.out.println();
// /******************************************************* */

// }
// }

/**
 * JavaDay10 Access in Reverse Order
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// int arr[] = { 13, 14, 15, 11, 16 };
// for (int i = arr.length - 1; i >= 0; i--) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// // --> Trace
// // i = 5-1; print arr[4]
// // i = 4; print arr[3]
// // i = 3; print arr[2]
// // i = 2; print arr[1]
// // i = 1; print arr[0]
// // i = 0; print arr[-1] // Condition false
// }
// }

/**
 * JavaDay10 Print in Reverse Program 2
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// char[] ch = { 'J', 'a', 'v', 'a' };
// for (int i = ch.length - 1; i >= 0; i--) {
// System.out.print(ch[i] + " ");
// }
// System.out.println();
// }
// }

/**
 * JavaDay10 sum of array element
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// int sum = 0;
// int[] arr = { 12, 10, 15, 16, 13 };
// for (int i = 0; i < arr.length; i++) {
// sum = sum + arr[i];
// }
// System.out.println("Sum of Array is: " + sum);
// // -->Trace
// // i = 0 sum = 0 sum+arr[0];
// // i = 1 sum = 12 sum+arr[1];
// // i = 2 sum = 22 sum+arr[2];
// // i = 3 sum = 37 sum+arr[3];
// // i = 4 sum = 53 sum+arr[4];
// // i = 5 sum = 66 condition false Exit
// }
// }
/**
 * JavaDay10 sum of array element
 * only even Number
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// int sumOfEven = 0;
// int[] arr = { 12, 10, 15, 16, 13 };
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] % 2 == 0) {
// sumOfEven = sumOfEven + arr[i];
// }
// }
// System.out.println("sumOfEven " + sumOfEven);
// }
// }

/**
 * JavaDay10 sum of array element
 * only Odd Number
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// int sumOfOdd = 0;
// int[] arr = { 12, 10, 15, 16, 13 };
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] % 2 != 0) {
// sumOfOdd = sumOfOdd + arr[i];
// }
// }
// System.out.println("sumOfOdd " + sumOfOdd);
// }
// }

/**
 * JavaDay10 sum of array element find out Average
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// double sum = 0;
// int[] arr = { 12, 10, 15, 16, 13 };
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] % 2 != 0) {
// sum = sum + arr[i];
// }
// }
// double avg = sum / arr.length;
// System.out.println("Average: " + avg);
// }
// }

/**
 * JavaDay10 Avg rent question
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// int rent[] = { 7500, 7200, 7300, 7250, 8000, 7300 };
// double sum = 0.0;
// for (int i = 0; i < rent.length; i++) {
// sum += rent[i];
// }
// double avgRent = sum / rent.length;
// System.out.println("Avg Rent is: " + avgRent);
// }
// }

/**
 * JavaDay10 Avg Height
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// double[] height = { 5.5, 5.7, 6.2, 7.1, 8.9 };
// int sumOfHeight = 0;
// for (int i = 0; i < height.length; i++) {
// sumOfHeight += height[i];
// }
// double avgHeight = sumOfHeight / height.length;
// System.out.println("Average height is: " + avgHeight);
// }
// }

/**
 * JavaDay10 Largest Number
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// int[] arr = { 345, 67321, 87654, 2356, 789 };
// int large = arr[0];
// for (int i = 1; i < arr.length; i++) {
// if (large < arr[i]) {
// large = arr[i];
// }
// }
// System.out.println("Largest Number is: " + large);
// }
// }

/**
 * JavaDay10 Smallest Number
 */
// public class JavaDay10 {

// public static void main(String[] args) {
// double[] arr = { 5.8, 5.7, 5.6, 6.0, 5.9 };
// double small = arr[0];
// for (int i = 1; i < arr.length; i++) {
// if (arr[i] < small) {
// small = arr[i];
// }
// }
// System.out.println("Smallst Number is: " + small);
// }
// }

/**
 * JavaDay10 Array Search
 */
// import java.util.Scanner;

// public class JavaDay10 {
// public static void main(String[] args) {
// int[] arr = { 13, 11, 14, 16, 15, 11, 17 };

// System.out.println("Enter Number u wanna Search");
// Scanner sc = new Scanner(System.in);
// int element = sc.nextInt();
// boolean flag = false;

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == element) {
// // it will also work for multi value and return bot index
// System.out.println(element + " Found at Index is: " + i);
// flag = true;
// }
// }
// if (flag == false) {
// System.out.println(element + " is Not Present");
// }
// }
// }

/**
 * JavaDay10 Program 6 Automated Array User Input values
 */

import java.util.Scanner;

public class JavaDay10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Inserting Value
        System.out.println("Enter Value to Insert: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing Value
        System.out.println("Entered Value is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}