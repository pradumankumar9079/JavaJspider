/**
 * Delta
 */
class Delta {
    static int a = 10;
    int b = 20;

    static void test() {
        System.out.println("Executing Test()....");
    }

    void disp() {
        System.out.println("Executing Desp()....");
    }
}

public class Program4 {
    public static void main(String[] args) {
        Delta obj = new Delta();
        System.out.println(Delta.a);

        /****************************************************************** */
        // it will also work for static member access using object
        // System.out.println(obj.a);//--> Not Recommanded
        /****************************************************************** */

        System.out.println(obj.b);

        Delta.test();
        obj.disp();
    }

}