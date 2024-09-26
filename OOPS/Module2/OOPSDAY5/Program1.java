/**
 * Program1 static initailization Block TWO Way
 */

// public class Program1 {
// // First way of static member initialization
// static int a = 10;

// // Second way of static member initialization
// /******************************************************************* */
// static int b;
// static {
// b = 20;
// System.out.println("This is Raja raj");
// // We can Print This in static Block is only fro intialization Recommanded

// };

// static {
// System.out.println("This is Raja raj");// outside static block error
// }

// /******************************************************************* */

// public static void main(String[] args) {
// System.out.println("Program starts");
// System.out.println(Program1.a);
// System.out.println(Program1.b);
// System.out.println("Program ends");
// }
// }

/**
 * Program1 in a single static block we can initialize so many member
 */
// public class Program1 {
// static int num;
// static double val;

// static {
// num = 25;
// val = 2.5;
// }
// }

// public static void main(String[] args) {
// System.out.println("Program start");
// System.out.println(Program1.num);
// System.out.println(Program1.val);
// System.out.println("Program ends");
// }
// }

/**
 * Program1 we can initialize multiple static in one class (First always Execute
 * static Block than go for main)
 */
// public class Program1 {
// /***************************************** */
// // CTE
// // int d = 40;
// // static{
// // d = 20;
// // }
// /***************************************** */

// /***************************************** */
// // it will Execute first than go for main method
// static {
// System.out.println("Hii Raja raj");
// // Don't write it outside it's CTE
// }
// /***************************************** */

// static int a;
// static {
// a = 10;
// }

// static {
// a = 20;
// }
// // Got Updated
// static {
// a = 30;
// }

// public static void main(String[] args) {
// System.out.println("Program Starts");
// // a = 40;// in same class so no need to provide Program1.a in differ class
// than
// // provide
// System.out.println(Program1.a);
// System.out.println("Program Ends");
// }
// }

/**
 * Program1 Non Static initialization Block
 */
// public class Program1 {
// int a;

// // Non Static
// {
// a = 10;
// }

// public static void main(String[] args) {
// System.out.println("Program starts");
// // Object for accessing non static Data member
// Program1 ref = new Program1();
// System.out.println(ref.a);
// System.out.println("Program ends");
// }
// }

/**
 * Program1 multiple value initialization in non static Block
 */
// public class Program1 {
// int num;
// double val;

// {
// num = 45;
// val = 8.9;
// }

// public static void main(String[] args) {
// System.out.println("Program starts");
// Program1 p1 = new Program1();
// System.out.println(p1.num);
// System.out.println(p1.val);
// System.out.println("Program ends");
// }
// }

/**
 * Program1 we can create multiple non static block
 */
// public class Program1 {
//     int a;
//     {
//         a = 20;
//     }
//     {
//         a = 30;
//     }
//     {
//         a = 40;
//     }

//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         // non static load after object creation
//         Program1 p1 = new Program1();
//         System.out.println(p1.a);
//         System.out.println("Program ends");
//     }
// }

/**
 * Program1 last point static block executing once in life time for non static
 * vice versa
 */
// public class Program1 {
//     static {
//         System.out.println("Executing static Block");
//     }
//     {
//         System.out.println("Executing Non-static Block");
//     }

//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         Program1 p1 = new Program1();
//         Program1 p2 = new Program1();
//         Program1 p3 = new Program1();
//         System.out.println("Program ends");
//     }
// }

/**
 * Program1 Example
 */
// public class Program1 {
//     static int i;
//     // it is allowd take 0 but not right approach(because i am not creating object
//     // that's why it's work)
//     {
//         i = 20;
//     }

//     public static void main(String[] args) {
//         // Program1 p1 = new Program1();// it will still work now output 20
//         // Unwanted dependency
//         System.out.println(Program1.i);
//     }
// }

/**
 * Program1 Eg
 */
// public class Program1 {
//     static {
//         System.out.println("Java");
//     }
//     {
//         System.out.println("Sql");
//     }
//     static {
//         System.out.println("Web-tech");
//     }
//     {
//         System.out.println("J2ee");
//     }

//     public static void main(String[] args) {
//         Program1 p1 = new Program1();
//         // Java
//         // Web-tech
//         // Sql
//         // J2ee
//     }
// }

/**
 * Program1 initializiion of static member with three ways
 */
// public class Program1 {
//     static int a = 10; // Initialization during declaration
//     static {
//         a = 20; // Initialization during class loading
//     }

//     public static void main(String[] args) {
//         Program1.a = 30;// Initialization after class loading
//         System.out.println(Program1.a);
//     }
// }

/**
 * Program1 initializiion of non-static member with three ways one other way is
 * constructor
 * or Different stages in which a non-static member can be initialized
 */
public class Program1 {
    int a = 10; // Initialization during declaration or before object creation
    {
        a = 20; // Initialization during object creation
    }

    public static void main(String[] args) {
        Program1 p1 = new Program1();
        p1.a = 30;// Initialization after object creation
        System.out.println(p1.a);
    }
}