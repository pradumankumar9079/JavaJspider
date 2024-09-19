/**
 * JavaDay9
 */
public class JavaDay9 {
    public static void main(String[] args) {
        // Dimension Approach
        // JVM provide memory here 5*4(size of one int) allocate contigious memory of 20
        // bytes
        // Create 5 segment of 4 bytes because it's int
        // To Access Each Segment use index Value it Start from (zero to size-1)
        // int arr[] = new int[5];

        // int[] values = { 13, 14, 15, 16, 17, 18 }; // 6*4(size of int) ==24 byte
        // contigious allocation Access With index

        // double[] doubleArray = new double[5];// 5*8(size of double) == 40 byte of
        // contigious memory Allocation

        // char[] charArray = { 't', 'i', 'g', 'e', 'r' }; // 5*2(size of char) == 10
        // byte Allocate

        /************************** length*********************************** */
        // int arr[] = new int[7];
        // System.out.println("The Size of the Array is: " + arr.length);

        // int[] evenNos = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        // System.out.println("The Size of the Array is: " + evenNos.length);

        // double[] cgpa = { 8.4, 8.5, 9.1, 7.4, 8.6, 8.7 };
        // System.out.println("The Size of the Array is: " + cgpa.length);

        // char[] ch = new char[15];
        // System.out.println("The Size of the Array is: " + ch.length);
        /************************************************************* */

        /************************************************************* */
        // Value Store & Print
        // int arr[] = new int[5];
        // arr[0] = 15;
        // arr[1] = 12;
        // arr[2] = 14;
        // arr[3] = 17;
        // arr[4] = 18;

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        /************************************************************* */

        // double[] dArr = { 7.4, 57.53, 6.3, 63.6, 256 };
        // System.out.println("Array Length: " + dArr.length);
        // System.out.println(dArr[0]);
        // System.out.println(dArr[1]);
        // System.out.println(dArr[2]);
        // System.out.println(dArr[3]);
        // System.out.println(dArr[4]);
        // System.out.println(arrayDouble[5]);// ArrayIndexOutOfBoundsException

        /************************************************************* */

        /************************************************************* */
        // int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 12;
        // arr[2] = 14;
        // arr[3] = 15;
        // arr[4] = 16;

        // // <= arr.length-1 --> Will also work but operation happened 2 here
        // Length is Property here
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        /************************************************************* */
        // double[] dArr = { 8.4, 8.5, 9.1, 7.4, 8.6, 8.7 };
        // for (int i = 0; i < dArr.length; i++) {
        // System.out.print(dArr[i] + " ");
        // }

        /************************************************************* */
        char ch[] = { 'T', 'I', 'G', 'E', 'R' };
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
        /************************************************************* */

    }
}