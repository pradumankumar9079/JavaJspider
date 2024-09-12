import java.util.Scanner;

/**
 * // Logical Operator (&&--> (don't use single & it's Biitwise),||, !)--> it's
 * Works on Boolean
 * Expression and the
 * result also in boolean
 */

public class Pd6 {

    public static void main(String[] args) {
        // Logical And(&&)--> Minimum Two Expression is mendatory--> if all conditon
        // true return true else false
        // Note:--> when all condition has to be met go for &&

        /********************************************************************************************* */
        // System.out.println(10 > 5 && 10 > 20);//--> Two Expression Using Logical
        // AND(&&)
        // System.out.println(5 > 2 && 20 > 15);//-->true && ture--> true
        // System.out.println(5 < 10 && 10 > 6);//-->true && ture--> true
        // System.out.println(10 > 20 && 10 < 50);// -->flase && ture--> false

        /********************************************************************************************* */
        // Note:-if First condition false && operator never check for next one return
        // directly false
        /********************************************************************************************* */

        /********************************************************************************************* */
        // System.out.println(10 + 20 && 10 + 50);// --> not work it's not a boolean
        // expression CTE
        /********************************************************************************************* */

        /********************************************************************************************* */
        // Logical OR(||)-->Minimum Two Expression is mendatory--> if one expression
        // return true if any one of condition expression becomes true else false
        // Note: --> Any one condition has to be met
        /********************************************************************************************* */

        /********************************************************************************************* */
        // System.out.println(10 > 5 || 10 > 20);// --> Two Expression Using Logical
        // OR(||)
        // System.out.println(5 > 2 || 20 > 15);// -->true || ture--> true
        // System.out.println(5 < 10 || 10 > 6);// -->true || ture--> true
        // System.out.println(10 > 20 || 10 < 50);// -->flase || ture--> true
        // System.out.println(false || true);// -->flase || ture--> true
        /********************************************************************************************* */

        /********************************************************************************************* */
        // Logical Not(!)-->work if we have minimum one expression
        // Note:--> (!true--> false) vice versa
        System.out.println(!false); // --> !false-->true
        System.out.println(!true); // --> !true-->false

        System.out.println(!(10 > 5)); // --> !true-->false
        System.out.println(!(30 < 20)); // --> !false-->true
        /********************************************************************************************* */

        // Q1)
        System.out.println("Enter ur Lucky Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // if (num % 3 == 0 && num % 5 != 0) {
        // System.out.println("Sanju");
        // } else if (num % 3 != 0 && num % 5 == 0) {
        // System.out.println("Geeta");
        // } else if (num % 3 == 0 && num % 5 == 0) {
        // System.out.println("Sanju Weds Geeta");
        // } else {
        // System.out.println("Breakup");
        // }

        // Sir one Trace for 15
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Sanju Weds Geeta");
        } else if (num % 3 == 0) {
            System.out.println("Sanju");
        } else if (num % 5 == 0) {
            System.out.println("Geeta");
        } else {
            System.out.println("Breakup");
        }
    }
}