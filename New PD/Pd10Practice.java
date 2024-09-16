import java.util.Scanner;

public class Pd10Practice {
    public static void main(String[] args) {
        // write a program to check user entered number is perfect number or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number u wanna find for Perfect or not: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a Perfect Number:");
        } else {
            System.out.println(num + " is not a perfect number:");
        }
    }
}
// 6 ,28,496
// 24 --> 1 2, 3,4 6,8,12
