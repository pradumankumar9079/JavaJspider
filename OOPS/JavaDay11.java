/**
 * JavaDay11 String Day 1
 */
public class JavaDay11 {
    public static void main(String[] args) {
        String city = "Bangalore";
        System.out.println(city);

        /*************************************************************** */
        // charAt()
        String str = "Developer";
        System.out.println(str.charAt(4)); // l
        System.out.println(str.charAt(6)); // p
        System.out.println(str.charAt(2)); // v
        System.out.println(str.charAt(3)); // e
        // System.out.println(str.charAt(12)); // Invalid Index
        // (StringIndexOutOfBoundsException)
        /*************************************************************** */

        /*************************************************************** */
        // Length --> In String lenght() is method
        String s1 = "BTM";
        System.out.println(s1.length()); // 3

        String s2 = "Java_SE22";
        System.out.println(s2.length()); // 9

        // if i will insert one more space it will counted as 18 than
        String s3 = "Software Engineer";
        System.out.println(s3.length()); // 17
        /*************************************************************** */

        /*************************************************************** */
        // toCharArray()
        String str1 = "Tiger";
        System.out.println("String is: " + str1);

        // Converted into Character Array Listen it will won't affect original String
        // str1
        char[] ch = str1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
        /*************************************************************** */

        /*************************************************************** */
        // indexOf() and lastIndexOf()
        String str2 = "Developer";

        // IndexOf--> Search L to R
        System.out.println("Index Of");
        System.out.print(str.indexOf('D') + " ");
        System.out.print(str.indexOf('e') + " ");
        System.out.print(str.indexOf('v') + " ");
        System.out.print(str.indexOf('e') + " ");
        System.out.print(str.indexOf('l') + " ");
        System.out.print(str.indexOf('k') + " "); // Not Present -1 return

        System.out.println();
        // lastIndexOf()--> Search R to L
        System.out.println("Last Index Of");
        System.out.print(str.lastIndexOf('e') + " ");// 7 return last Occerence Index
        System.out.print(str.lastIndexOf('D') + " ");
        System.out.print(str.lastIndexOf('v') + " ");
        System.out.print(str.lastIndexOf('l') + " ");
        System.out.print(str.lastIndexOf('k') + " "); // Not Present -1 return
        System.out.println();
        /*************************************************************** */

        /*************************************************************** */
        // i wanna find all occuerence 1,2,3 -->Important
        // String str2 = "Developer";
        int a = str.indexOf('e'); // Seraching First Index
        int b = str.indexOf('e', a + 1); // Seraching after First Occurenece (a+1)
        int c = str.indexOf('e', b + 1); // Searching after Second Occurence With (b+1)

        System.out.println("First Occurence: " + a);
        System.out.println("Second Occurence: " + b);
        System.out.println("Third Occurence: " + c);
        /*************************************************************** */

        /*************************************************************** */
        // i wanna find all occuerence 1,2,3 -->Important
        // String str2 = "Developer";
        int d = str.lastIndexOf('e'); // Seraching First Index
        int e = str.lastIndexOf('e', d - 1); // Seraching after First Occurenece (a-1)
        int f = str.lastIndexOf('e', e - 1); // Searching after Second Occurence With (b-1)

        System.out.println("First Occurence from Last: " + d);
        System.out.println("Second Occurence from Last: " + e);
        System.out.println("Third Occurence from Last: " + f);
        /*************************************************************** */

    }
}