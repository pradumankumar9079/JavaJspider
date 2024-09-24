/**
 * Program1
 */
// class Demo {
//     static int a = 10;
//     int b = 20;

//     static void test() {

//     }

//     void disp() {

//     }
// }

// public class Program1 {
//     public static void main(String[] args) {
//         Demo ref;

//         // Creating Object non static member will loaded
//         // it's consist non static member of Demo class
//         ref = new Demo();

//     }
// }

/**
 * Program1 Actor--> For Refernce Variable
 */
// class Actor {
//     void acting() {
//         System.out.println("Actor is acting.............");
//     }
// }

// public class Program1 {
//     public static void main(String[] args) {
//         Actor a1 = new Actor();
//         Actor a2 = null;
//         /**********************************************************  */
//         // Actor a3; assign either null or address otherwise it will give cte
//         // System.out.println(a3);// CTE
//         /**********************************************************  */
//         System.out.println(a1);// Address Of a1
//         System.out.println(a2);// Null
//         a1.acting();
//         // a2.acting();// not access any value (java.lang.NullPointerException)
//     }
// }

/**
 * Program1 About NullPointerException
 */
// class Delta {
//     void test() {
//         System.out.println("Executing test............");
//     }
// }

// public class Program1 {
//     public static void main(String[] args) {
//         Delta obj = null; //--> it's ok 
//         System.out.println(obj); //--> it's ok

//         // Not Suppose to Access Non Static Member it will give ullPointerException
//         // obj.test();
//     }

// }

/**
 * Program1 Player Follow Diagram how ref is linked Deep Copy
 */
// class Player {
//     String name = "Dhoni";
// }

// public class Program1 {
//     public static void main(String[] args) {
//         Player p1 = new Player();
//         Player p2 = new Player();// one more object with same property created

//         /****************************************************** */
//         // Both is having different Address
//         System.out.println(p1);
//         System.out.println(p2);
//         /****************************************************** */

//         System.out.println(p1.name);// Dhoni
//         System.out.println(p2.name);// Dhoni

//         // it will only affect p1 not p2
//         p1.name = "Kohli";
//         System.out.println(p1.name); // Changed to Kohli
//         System.out.println(p2.name);// --> remain Dhoni
//     }
// }

/**
 * Program1 Laptop Shallow Copy
 */
class Laptop {
    String wallpaper = "Dipika.jpeg";
}

public class Program1 {
    public static void main(String[] args) {
        // One Object Created not two it's assigned to another ref variable
        Laptop l1 = new Laptop();
        Laptop l2 = l1;

        /************************************************ */
        // Now it's a same Address.
        System.out.println(l1);
        System.out.println(l2);
        /************************************************ */

        System.out.println(l1.wallpaper);// Dipika.jpeg
        System.out.println(l2.wallpaper);// Dipika.jpeg

        l1.wallpaper = "Alia.jpeg";
        // l2.wallpaper = "Raja Bhai"; --> it will also change Becoz it's 3shallow copy
        /*********************************************** */
        // This time it will change both
        System.out.println(l1.wallpaper);// Alia.jpeg
        System.out.println(l2.wallpaper);// Alia.jpeg
        /*********************************************** */
    }

}9