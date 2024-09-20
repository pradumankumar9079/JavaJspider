/**
 * OopsDay2 How to Create and Access Non Static Member
 */
// public class OopsDay2 {

// int a = 10;

// void test() {
// System.out.println("Executing test()................");
// }

// public static void main(String[] args) {
// // OopsDay2.test(); Error it's not a static Member
// // Using Object or instance to Access Non Static Member

// /*********************************************************************************
// */
// // This Will also Work
// System.out.println(new OopsDay2().a);
// new OopsDay2().test();// Here We Created two Object Memory Wastage
// /*********************************************************************************
// */

// // Here We Reuse Object (Created Object and Assigned to Reference) Memory
// // Efficient
// // LHS:- it's a variable to refer the object RHS:- Object Created

// OopsDay2 obj = new OopsDay2();

// System.out.println(obj.a);
// obj.test();
// }
// }
