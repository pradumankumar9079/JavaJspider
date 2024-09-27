
/**
 * Pd17 Check For Even Or Odd Using Method
 */
// import java.util.Scanner;

// public class Pd17 {

//     public static void main(String[] args) {
//         System.out.println("Enter Number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean res = isEvenOrOdd(n); // Passing n Value
//         if (res == true) {
//             System.out.println(n + " is Even");
//         } else {
//             System.out.println(n + " is Odd");
//         }
//     }

//     static boolean isEvenOrOdd(int x) {
//         if (x % 2 == 0) {
//             return true;
//         }
//         return false;
//     }
// }

/**
 * Pd17 Check For Prime Number(Prime number is having two factor only 1 and itself)
 */
// import java.util.Scanner;

// public class Pd17 {
//     static boolean isPrime(int n) {
//         // Extra Cases
//         if (n <= 1)
//             return false;
//         for (int i = 2; i <= n / 2; i++) {
//             // --> after half number we wont have any number which will devide it completely
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println("Enter Number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean res = isPrime(n);
//         if (res == true) {
//             System.out.println(n + " is a Prime Number");
//         } else {
//             System.out.println(n + " is not Prime Number");

//         }
//     }
// }

/**
 * Pd17 Armstrong number(Sum of Power(count of digit) of each digit is equal to
 * that number)
 * mine one
 */
import java.util.Scanner;

public class Pd17 {
    static int countOfDigit(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n /= 10;
        }
        return cnt;
    }

    static int sumOfPowerOfEach(int n) {
        int cnt = countOfDigit(n);// this will act as p
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;// this will act as a n value
            sum += powerOfdigit(rem, cnt);
            n /= 10;
        }
        return sum;
    }

    static int powerOfdigit(int rem, int cnt) {
        int res = 1;
        while (cnt != 0) {
            res *= rem;
            cnt--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int originalNumber = n;
        int sum = sumOfPowerOfEach(n);

        if (sum == originalNumber) {
            System.out.println(n + " is a Armstrong");
        } else {
            System.out.println(n + " is Not a Armstrong");
        }
    }

}