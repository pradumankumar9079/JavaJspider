/**
 * JavaDay12
 */
public class JavaDay12 {
    public static void main(String[] args) {
        /********************************************************************* */
        // contains,startsWith,endsWith--> use in searching engine --> ans as true or
        // false
        // String str = "Engineering";
        // System.out.println(str.contains("job")); // false
        // System.out.println(str.contains("gin"));// true

        // // Case Sensitive
        // System.out.println(str.contains("Eer"));// false
        // System.out.println(str.contains("eer")); // true

        // System.out.println(str.contains('e')); // not work for Character
        /********************************************************************* */

        /********************************************************************* */
        // startsWith()
        // String str = "Engineering";
        // System.out.println(str.startsWith("engine"));// false case sensitive
        // System.out.println(str.startsWith("Eng")); // true

        // System.out.println(str.endsWith("i ng")); // false extra space
        // System.out.println(str.endsWith("ing"));// false
        /********************************************************************* */

        /********************************************************************* */
        // equals(), equalsIgnoreCase()
        // String str1 = "j2ee";
        // System.out.println(str1.equals("j2ee"));// true
        // System.out.println(str1.equals("J2ee"));// false
        // System.out.println(str1.equals("adv java")); // false

        // System.out.println(str1.equalsIgnoreCase("J2ee")); // true
        // System.out.println(str1.equalsIgnoreCase("j2ee")); // true
        // System.out.println(str1.equalsIgnoreCase("adv java")); // false // Different
        // Content
        /********************************************************************* */

        /********************************************************************* */
        // toLowerCase() toUpperCase() --> not affect real String
        // String str = "Java_SE22";
        // System.out.println(str.toUpperCase());// JAVA_SE22
        // System.out.println(str.toLowerCase()); // java_se22

        // // it will not convert str one new string Created Proof of that Below
        // System.out.println(str); // Original String
        /********************************************************************* */

        /********************************************************************* */
        // substring() --> last index is Excluded
        // String str = "Developer";
        // System.out.println(str.substring(6));// not mention take whole string after
        // that Index //per
        // System.out.println(str.substring(4));// loper

        // System.out.println(str.substring(0, 2)); // (last index is Excluded-->imp)
        // //De
        // System.out.println(str.substring(3, 8)); // first index included but last
        // index Excluded //elope
        // System.out.println(str.substring(0, 7)); // Develop

        /********************************************************************* */
        // trim() --> it will remove starting space and ending space it will won't make
        // remove leading and trailing whitespace from a string
        // (Any number of space)
        // any changes in between space
        // String str = " Core Java ";
        // System.out.println("-------->" + str + "<-------");
        // System.out.println("-------->" + str.trim() + "<-------");
        /********************************************************************* */

        /********************************************************************* */
        // split()--> Breakup method
        String str = " Java is an Object Oriented Programming Language";
        String[] arr = str.split(" ");// --> one space and multiple space is Different here
        // String[] arr1 = str.split('i');// --> it will also work (don't go with single
        // quote won't work)
        String[] arr1 = str.split("i");// --> it will also work (don't go with single quote won't work)

        /******************************************************************************** */
        // trailing space is not removed(means starting and ending space solve with
        // trim)
        /******************************************************************************** */

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("/*************************Different One*****************************/");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        /********************************************************************* */

    }
}