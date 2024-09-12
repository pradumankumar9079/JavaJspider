/**
 * JavaDay7Practice Assignment Question 1
 */
// public class JavaDay7Practice {

// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || j == n / 2 || i == n / 2)
// {
// System.out.print("*" + " ");
// } else {
// System.out.print(" " + " ");
// }
// }
// System.out.println();
// }
// }
// }

/**
 * JavaDay7Practice Assignment Question 2
 */
// public class JavaDay7Practice {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n - 1) {
//                     if (j % 2 != 0) {
//                         System.out.print(" " + " ");
//                     } else {
//                         System.out.print("*" + " ");
//                     }
//                 }
//                 if (i % 2 != 0) {
//                     if (j == 0 || j == n - 1) {
//                         System.out.print(" " + " ");
//                     } else {
//                         System.out.print("*" + " ");
//                     }
//                 }
//                 if (i == n / 2) {
//                     System.out.print("*" + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * JavaDay7Practice Assignment Question 3
 */
// public class JavaDay7Practice {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n - 1) {
//                     if (j == 0 || j == n - 1) {
//                         System.out.print(" " + " ");
//                     } else {
//                         System.out.print("*" + " ");
//                     }
//                 }
//                 if (i % 2 != 0) {
//                     if (j % 2 == 0) {
//                         System.out.print("*" + " ");
//                     } else {
//                         System.out.print(" " + " ");
//                     }
//                 }
//                 if (i == n / 2) {
//                     System.out.print("*" + " ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

/**
 * JavaDay7Practice Assignment Question 4
 */
public class JavaDay7Practice {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("1" + " ");
                    } else {
                        System.out.print("0" + " ");
                    }
                }
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("1" + " ");
                    } else {
                        System.out.print("0" + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}