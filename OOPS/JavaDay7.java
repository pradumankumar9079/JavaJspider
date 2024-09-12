// /**
// * Pattern Printing
// */
// public class JavaDay7 {

// public static void main(String[] args) {
// /********************************************************************** */
// // Doing with single loop
// // int n = 5;
// // for (int i = 0; i < n; i++) {
// // System.out.print("* * * * * " + "\n");
// // }

// /********************************************************************** */
// // // Doing with nested loop --> tutor method

// // int n = 5; // Control size of square
// // for (int i = 0; i < 8; i++) {// --> Outer loop control row

// // // it will print n number of stars and after that it will run for n time
// // using
// // // outer for loop
// // for (int j = 0; j < 5; j++) { // --> inner loop control column
// // System.out.print("*" + " ");
// // }

// // // for new line after printing one row
// // System.out.println();
// // }

// /********************************************************************** */
// // Harcoded n = 5;

// // Trace-->
// // i=1 ,i<5
// // j=0 j=1 j=2 j=3 j=4 j=5(inner loop exit condition false)
// // * * * * *
// // after breaking inner loop printing new line(\n)

// // i=2 ,i<5
// // j=0 j=1 j=2 j=3 j=4 j=5(inner loop exit condition false)
// // * * * * *
// // after breaking inner loop printing new line(\n)

// // i=3 ,i<5
// // j=0 j=1 j=2 j=3 j=4 j=5(inner loop exit condition false)
// // * * * * *
// // after breaking inner loop printing new line(\n)

// // i=4 ,i<5
// // j=0 j=1 j=2 j=3 j=4 j=5(inner loop exit condition false)
// // * * * * *
// // after breaking inner loop printing new line(\n)

// // i=5 ,i<5 false(outer loop exit condition false)
// // after breaking inner loop printing new line(\n)

// // Final Output:
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// /********************************************************************* */

// /********************************************************************** */

// }
// }

/**
 * Pattern 2
 */
// public class JavaDay7 {

// public static void main(String[] args) {
// int n = 5;
// int val = 1;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// System.out.print(val + " ");
// }
// System.out.println();
// // after each row we are increasing val by 1
// val++;
// }
// }
// // Output:
// // 1 1 1 1 1
// // 2 2 2 2 2
// // 3 3 3 3 3
// // 4 4 4 4 4
// // 5 5 5 5 5

// }

/**
 * Pattern 3
 */
// public class JavaDay7 {

// public static void main(String[] args) {
// int n = 5;
// char ch = 'a';
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// System.out.print(ch + " ");
// }
// System.out.println();
// // after each row we are increasing ch by 1
// ch++;
// }
// }
// // Output:
// // a a a a a
// // b b b b b
// // c c c c c
// // d d d d d
// // e e e e e

// }

/**
 * Pattern 4
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         int val = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//             // after each row we are decreasing val by 1
//             val--;
//         }
//     }
//     // Output:
//     // 5 5 5 5 5
//     // 4 4 4 4 4
//     // 3 3 3 3 3
//     // 2 2 2 2 2
//     // 1 1 1 1 1

// }

/**
 * Pattern 5
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         int val = 1;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(val + " ");
//                 // after each column we are increasing val by 1
//                 val++;
//             }

//             // after each row we are setting val to again 1
//             val = 1;
//             System.out.println();
//         }
//     }
/************************************************************************ */
// Trace-->

// Start val=1;
// int i = 0;
// int j = 0 j=1 j=2 j=3 j=4 j=5(inner for loop increasing each time by 1)
// 1 2 3 4 5
// again setting val =1; and printing new line as well

// Start val=1;
// int i = 1;
// int j = 0 j=1 j=2 j=3 j=4 j=5(inner for loop increasing each time by 1)
// 1 2 3 4 5

// again setting val =1; and printing new line as well
// Start val=1;
// int i = 2;
// int j = 0 j=1 j=2 j=3 j=4 j=5(inner for loop increasing each time by 1)
// 1 2 3 4 5
// again setting val =1; and printing new line as well

// Start val=1;
// int i = 3;
// int j = 0 j=1 j=2 j=3 j=4 j=5(inner for loop increasing each time by 1)
// 1 2 3 4 5
// again setting val =1; and printing new line as well

// Start val=1;
// int i = 4;
// int j = 0 j=1 j=2 j=3 j=4 j=5(inner for loop increasing each time by 1)
// 1 2 3 4 5
// again setting val =1; and printing new line as well

// Start val=1;
// int i = 5; (exit false)
// again setting val =1; and printing new line as well

// Output:
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
/************************************************************************ */

// }

/**
 * Pattern 6
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         char ch = 'a';
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(ch + " ");
//                 // after each column we are increasing ch by 1
//                 ch++;
//             }
//             // after each column we are reintializing to 'a'
//             ch = 'a';
//             System.out.println();
//         }
//     }
//     // Output:
//     // a b c d e
//     // a b c d e
//     // a b c d e
//     // a b c d e
//     // a b c d e

// }

/**
 * Pattern 7
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         int val = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(val + " ");
//                 // after each column we are Decreasing val by 1
//                 val--;
//             }
//             // after each column we are reintializing to 5
//             val = 5;
//             System.out.println();
//         }
//     }
//     // Output:
//     // 5 4 3 2 1
//     // 5 4 3 2 1
//     // 5 4 3 2 1
//     // 5 4 3 2 1
//     // 5 4 3 2 1
// }

/**
 * Pattern 8 -->sandwitch Program
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             // Checking i is even or odd
//             if (i % 2 == 0) {
//                 for (int j = 0; j < n; j++) {
//                     // if even print 1
//                     System.out.print(1 + " ");
//                 }
//             } else {
//                 for (int j = 0; j < n; j++) {
//                     // if odd print 0
//                     System.out.print(0 + " ");
//                 }
//             }
//             System.out.println();
//         }
//         // Output:
//         // j=0 j=1 j=2 j=3 j=4 j=5(break false)
//         // i=0 1 1 1 1 1
//         // i=1 0 0 0 0 0
//         // i=2 1 1 1 1 1
//         // i=3 0 0 0 0 0
//         // i=4 1 1 1 1 1
//         // i=5 (break false)
//     }
// }

/**
 * Pattern 9 -->sandwitch Program
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             // Checking i is even or odd --> control row
//             if (i % 2 == 0) {
//                 for (int j = 0; j < n; j++) {
//                     // Checking j is even or odd --> control column
//                     if (j % 2 == 0) {
//                         System.out.print(1 + " ");
//                     } else {
//                         System.out.print(0 + " ");
//                     }
//                 }
//             } else {
//                 for (int j = 0; j < n; j++) {
//                     if (j % 2 == 0) {
//                         System.out.print(1 + " ");
//                     } else {
//                         System.out.print(0 + " ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//         // Output:
//         // j=0 j=1 j=2 j=3 j=4 j=5(break false)
//         // i=1 1 0 1 0 1
//         // i=2 1 0 1 0 1
//         // i=3 1 0 1 0 1
//         // i=4 1 0 1 0 1
//         // i=5 (break false)
//     }
// }

/**
 * Pattern 10 -->sandwitch Program
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
//                     System.out.print("*" + " ");
//                 } else {
//                     System.out.print(" " + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Pattern 11 -->sandwitch Program
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == n / 2 || j == n / 2) {
//                     System.out.print("*" + " ");
//                 } else {
//                     System.out.print(" " + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Pattern 12 -->sandwitch Program
 */
// public class JavaDay7 {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == j || (i + j) == n - 1) {// --> focus on this
//                     System.out.print("*" + " ");
//                 } else {
//                     System.out.print(" " + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Pattern 13 -->sandwitch Program
 */
public class JavaDay7 {

    public static void main(String[] args) {
        int n = 5;
    }
}
