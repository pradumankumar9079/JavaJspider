/**
 * Program1
 * public class Program1 {
 * // Default Constructor is Present By Default javac Created check with
 * (javap-->Java Properties)
 * public Program1();
 * }
 */
// class Sample {
// // User Define Constructor Zero Argument Constructor
// Sample() {

// }
// }

// class Example {
// // User Define Constructor Parameterrized Constructor
// Example(int arg) {

// }
// }

// public class Program1 {

// }

/**
 * Program1 javac provide default value using constructor
 */
// class Demo {
// int a;
// double b;
// String s;
// }

// public class Program1 {
// public static void main(String[] args) {
// Demo ref = new Demo();// -->Object Created By Calling Default Constructor
// System.out.println(ref.a);// 0 javac gave default value using constructor
// check with javap
// System.out.println(ref.b);// 0.0
// System.out.println(ref.s);// null
// }
// }

/**
 * Program1
 */
// class Sample {
// // if i initialize val than it will take that value
// double val;

// void test() {
// System.out.println("Executing Test");
// }
// }

// public class Program1 {
// public static void main(String[] args) {
// // Default constructor Provide Default Value Using Default
// Sample s1 = new Sample(); // Creating Object By Calling Default Constructor
// System.out.println(s1.val);
// s1.test();
// }
// }

/**
 * Program1 Eg on Zero argument Constructor
 */
// class Alpha {
// int val;

// // Constructor is not having Return Type
// Alpha() {
// System.out.println("Executing Constructor");
// /*********************************************************************************
// */
// // Default constructor will not allow to initialize val=25 on other hand zero
// // argument constructor allow to initialize value
// val = 25;
// /*********************************************************************************
// */
// }
// }

// public class Program1 {
// public static void main(String[] args) {
// Alpha a1 = new Alpha();// Calling it
// // Alpha a2 = new Alpha();// Calling it
// // Alpha a3 = new Alpha();// Calling it

// // Alpha a4 = a3;// it is assigning not creating and Calling it's ref only

// System.out.println(a1.val);
// }

// }

/**
 * Program1 Eg on Zero argument Constructor we will initalize some value inside
 * zero argument constructor in Default Constructor it's not possible
 */
// class Beta {
// int a;
// double d;
// char c;

// Beta() {
// System.out.println("Executing Beta Constructor");
// a = 15;
// d = 4.5;
// c = 'A';
// }
// }

// public class Program1 {
// public static void main(String[] args) {
// Beta obj = new Beta();
// System.out.println(obj.a);// We have to call Each Non static using object
// System.out.println(obj.d);
// System.out.println(obj.c);
// }

// }

/**
 * Program1 Parameterized Constructor We can pass user Define value solve
 * problem of zero argument
 */
// class Example {
//     int a;

//     Example(int arg) {
//         System.out.println("Executing Example Constructor");
//         a = arg;
//     }
// }

// public class Program1 {
//     public static void main(String[] args) {
//         // Example ex1 = new Example()//--> This is a Error Because We are having
//         // Parametrized ones
//         Example ex1 = new Example(15);
//         System.out.println(ex1.a);
//         System.out.println("--------------------------------------------");
//         Example ex2 = new Example(25);
//         System.out.println(ex2.a);

//     }

// }

/**
 * Program1 Parametrized Constructor with multiple Initialization
 */
// class Delta {
//     int num;
//     double val;
//     char ch;

//     Delta(int a, double d, char c) {
//         System.out.println("Executing Delta Constructor");
//         num = a;
//         val = d;
//         ch = c;

//     }
// }

// public class Program1 {
//     public static void main(String[] args) {
//         Delta d1 = new Delta(10, 6.8, 'A');
//         System.out.println(d1.num);
//         System.out.println(d1.val);
//         System.out.println(d1.ch);

//     }
// }

/**
 * Program1 Trick Question
 */
class Gamma {
    // it will behave like a method but it work now it's not Constructor now
    static int a = 10;

    // void Gamma() {
    // System.out.println("Gamma Executing");
    // }
    Gamma() {
        a = 20;
    }
}

public class Program1 {
    public static void main(String[] args) {
        // Gamma g = new Gamma();
        // g.Gamma();

        // Gamma g = new Gamma(); // after object creation it's 20
        System.out.println(Gamma.a); // 10 here
    }
}