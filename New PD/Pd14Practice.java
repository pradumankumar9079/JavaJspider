
/**
 * Pd14Practice find Neon Number(Square of Sum of each digit is equal to that number eg: 0,1,9-->is Only Neon Number)
 */
// import java.util.Scanner;

// public class Pd14Practice {

//     public static void main(String[] args) {
//         System.out.println("Enter Number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         int square = num * num;
//         int sum = 0;
//         while (square != 0) {
//             int rem = square % 10;
//             sum += rem;
//             square /= 10;
//         }

//         if (sum == num) {
//             System.out.println(num + " is Neon Number");
//         } else {
//             System.out.println(num + " is Not a Neon Number");
//         }

//     }
// }

/**
 * Pd14Practice Check for Palindrome eg: 121, 12321
 */
import java.util.Scanner;

public class Pd14Practice {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNumber = num;

        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem; // Remember This
            num /= 10;
        }
        if (originalNumber == rev) {
            System.out.println(originalNumber + "==" + rev + " is Palindrome Number");
        } else {
            System.out.println(originalNumber + "!=" + rev + " is Not a Palindrome Number");
        }

        // -->Trace
        // num = 123 num!=0 rem = 3 (rev = 3) num = 12
        // num = 12 num!=0 rem = 2 (rev = 3*10+2=32) num = 1
        // num = 1 num!=0 rem = 1 (rev = 32*10+1=321) num = 0
        // num = 0 num!=0 false EXIT LOOP
        // num!=originalNumber Not a Palindrome Number
        /*********************************************************************** */
        // 321
        // 100th position 3, 2 is in 10th position, 1 is in 0 position
        // *10 to shift the position of previous Value */
        /*********************************************************************** */

    }
}