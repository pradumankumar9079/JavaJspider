import java.util.Scanner;

/**
 * Leap Year --> comes after every four year
 * eg: 2024, 2400, 2000, 1600
 * Not a Leap Year: --> 1800,1400,1900--> but divisible by 4 that's why using
 * (condition 1)
 */
public class Pd7 {
    public static void main(String[] args) {
        System.out.println("Enter year u wanna check for leap year: ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        // if (year % 4 == 0 && year % 100 != 0) { // avoid century year (condition 1)
        // // 2024 check work now 2024%4==0 but 2024%100==24 which is not zero
        // // 1700 will also work divided by 4 but also divisible by 100
        // // 1100 will also work divided by 4 but also divisible by 100
        // /***************************************************************************
        // */
        // // 2400(but this one is leap year so we will not avoid all century year
        // handle
        // // it seperately) will also work divided by 4 but also divisible by 100

        // // 1100,1200,1300,1400,1500,1600,1700,1800,1900,2000--> only
        // 1200,1600,2000(is a
        // // leap year so condition is to be taken divided by 400)

        // // Summary: some century year is also leap year so we are taking condition
        // // divided by 400
        // /***************************************************************************
        // */
        // System.out.println(year + " Leap Year");
        // } else if (year % 400 == 0) {
        // System.out.println(year + " Leap Year");
        // } else {
        // System.out.println(year + " Not a Leap Year");
        // }

        // 2nd way
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Leap Year");
        } else {
            System.out.println(year + " Not a Leap Year");
        }
    }
}