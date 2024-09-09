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
 * Program 3 both returning and passing
 */`
// true
// main()<-------------------- method()
public class JavaDay4 {
    static boolean method() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Program Started");

        System.out.println("Returned Value is " + method());

        System.out.println("Program Ended");
    }
}