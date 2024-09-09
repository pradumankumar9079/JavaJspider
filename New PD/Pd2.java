public class Pd2 {
    public static void main(String[] args) {
        // int x = 10;
        // int y = 20;
        // int z = 20;
        // z = z + x + y; // it is also a error
        // z += x;
        // x += y;// error not possible
        // System.out.println(z);

        // increment operator
        // int x = 10;
        // int k = 4;
        // System.out.println(x);// 10
        // ++x;
        // System.out.println(x);
        // x++;
        // System.out.println(x);
        // x += k;
        // System.out.println(x);
        int x = 0;
        int y = 0;
        y = x++ + x;
        // x = x++ + y;
        System.out.println(x);
        System.out.println(y);
    }

}
