/**
 * OopsDay1 Counting Member of Class
 */
// public class OopsDay1 {

//     int a = 10;// -->Member

//     void fun() { // -->Member
//         // it's not a member it's a local variable (b)
//         int b = 20;// --> Local Variable not member of Class
//     }
// }

/**
 * OopsDay1 Memeber Type 
 */
// public class OopsDay1 {
//     static int a = 10; // -->Static Data member
//     int b = 20;// -->Non static Data member we can call it as Global variable as well

//     static void play() {// -->Static member function

//     }

//     void disp() {// -->Non static member function

//     }
// }

/**
 * OopsDay1 Static and non Static member
 */
// class Demo {
// static int a = 10;

// static void test() {
// System.out.println("Executing test..........");
// }
// }

// public class OopsDay1 {
// public static void main(String[] args) {
// // System.out.println(a); --> error javac don't know about it
// // test();

// // Access static with className
// System.out.println(Demo.a);
// Demo.test();
// }
// }

// /**
// * OopsDay1 Eg 1 --> Follow Diagram
// */
// class Sample {
// static double val = 4.5;
// static char ch = 'J';

// static void play() {
// System.out.println("Executing Play........");
// }

// static void run() {
// System.out.println("Executing Run........");

// }
// }

// public class OopsDay1 {

// public static void main(String[] args) {

// // Accessing Static Data Member With ClassName and Dot Opeartor
// System.out.println(Sample.val);
// System.out.println(Sample.ch);

// // Accessing Static Member Function With ClassName and Dot Opeartor
// Sample.play();
// Sample.run();
// }
// }

/**
 * OopsDay1 Eg 2 Follow Diagram
 */
class Example {
    static int num = 45;
    static boolean status = true;

    static void help() {
        System.out.println("Executing Help.........");
    }

    static void execute() {
        System.out.println("Executing Execute.........");
    }
}

public class OopsDay1 {
    public static void main(String[] args) {
        System.out.println(Example.num);
        System.out.println(Example.status);

        Example.help();
        Example.execute();
    }
}