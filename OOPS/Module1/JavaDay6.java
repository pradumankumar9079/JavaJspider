
/**
 * Control Statement --> for loop
 */
public class JavaDay6 {

    public static void main(String[] args) {
        // intialization; condition(true or false --> true then enter the body--> jvm
        // will take care); operation;--> body execute and again and again until
        // condition false

        /*************************************************************************************** */
        for (int a = 1; a <= 5; a++) {
            // System.out.println("Java " + a);
            // -->Trace
            // 1 true (print Java 1) 2
            // 2 true (print Java 2) 3
            // 3 true (print Java 2) 4
            // 4 true (print Java 4) 5
            // 5 true (print Java 5) 6
            // 6 false exit

            // travel small --> large either use < or <=
        }
        /*************************************************************************************** */

        /*************************************************************************************** */
        for (int x = 5; x > 0; x--) {
            // --> Trace
            // 5 true (print Full Stack: 5) 4
            // 4 true (print Full Stack: 4) 3
            // 3 true (print Full Stack: 3) 2
            // 2 true (print Full Stack: 2) 1
            // 1 true (print Full Stack: 1) 0
            // 0 false exit
            // System.out.println("Full Stack: " + x);
            // travel large --> small either use > or >=
        }
        /*************************************************************************************** */

        /*************************************************************************************** */
        // for (int p = 1; p < 10; p = p + 2) { // p+2 is not correct write p=p+2 like
        // this
        // --> Trace
        // 1 true (print Briyani: 1) 3
        // 3 true (print Briyani: 3) 5
        // 5 true (print Briyani: 5) 7
        // 7 true (print Briyani: 7) 9
        // 9 true (print Briyani: 9) 11
        // 11 false exit
        // System.out.println("Briyani: " + p);
        // }
        /*************************************************************************************** */

        /*************************************************************************************** */
        // for (int m = 10; m > 0; m = m - 3) {
        // // --> Trace
        // // 10 true (print JSPIDER: ) 7
        // // 7 true (print JSPIDER: ) 4
        // // 4 true (print JSPIDER: ) 1
        // // 1 true (print JSPIDER: ) -2
        // // -2 false exit
        // System.out.println("JSPIDER: " + m);
        // }
        /*************************************************************************************** */

        /*************************************************************************************** */
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // --> Trace
        // 0 true (print * ) 1
        // 1 true (print * ) 2
        // 2 true (print * ) 3
        // 3 true (print * ) 4
        // 4 true (print * ) 5
        // 5 false exit

        // System.out.print("* ");// work but Not recommended
        // System.out.print("*" + " ");// --> Printing in same line

        // -->Trace Again without ln
        // i=0 i=1 i=2 i=3 i=4 i=5
        // * * * * * exit
        // }
        // System.out.println();
        /*************************************************************************************** */

        /*************************************************************************************** */
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // if (i % 2 == 0) {
        // System.out.print(1 + " ");
        // } else {
        // System.out.print(0 + " ");
        // }
        // // -->Trace Again without ln
        // // i=0 i=1 i=2 i=3 i=4 i=5 --> analyzing even is having 1 and odd is having 0
        // // 1 0 1 0 1 exit
        // }
        // System.out.println();
        /*************************************************************************************** */

        /*************************************************************************************** */
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // if (i % 2 == 0) {
        // System.out.print("a" + " ");
        // } else {
        // System.out.print("b" + " ");
        // }
        // // -->Trace Again without ln
        // // i=0 i=1 i=2 i=3 i=4 i=5 --> analyzing even is having a and odd is having b
        // // a b a b a exit
        // }
        // System.out.println();
        /*************************************************************************************** */

        /*************************************************************************************** */
        // int n = 5;
        // int val = 1;
        // for (int i = 0; i < n; i++) {
        // if (i % 2 == 0) {
        // System.out.print(val + " ");
        // val++;
        // } else {
        // System.out.print("*" + " ");
        // }
        // // -->Trace Again without ln
        // // i=0 i=1 i=2 i=3 i=4 i=5
        // // 1 * 2 * 3 exit
        // }
        // System.out.println();
        /*************************************************************************************** */

        /*************************************************************************************** */
        int n = 5;
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(ch + " ");
                ch++;
            } else {
                System.out.print("*" + " ");
            }
            // -->Trace Again without ln
            // i=0 i=1 i=2 i=3 i=4 i=5
            // a * b * c exit
        }
        System.out.println();
        /*************************************************************************************** */
    }
}