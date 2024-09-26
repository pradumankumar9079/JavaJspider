public class Pd2 {
    public static void main(String[] args) {
        /********************************************************************** */
        // int x = 10;
        // int y = 20;
        // int z = 20;

        // z = z + x + y; // it will work
        // z += x + y;// same it will also work fine first RHS Process L---> R Than
        // Assign to z
        // z += x;

        // System.out.println(z);
        /**********************************************************************  */

        /**********************************************************************  */
        // increment operator
        // int x = 10;
        // int k = 4;
        // System.out.println(x); // 10
        // ++x;
        // System.out.println(x); // 11
        // x++;
        // System.out.println(x); // 12
        // x += k;
        // System.out.println(x); // 16

        // Next Concept bit Confusing one
        int x = 0;
        int y = 0;
        y = x++ + x;
        // x = x++ + y;
        System.out.println(x);// 1
        System.out.println(y);// 1
        /**********************************************************************  */
    }

}
