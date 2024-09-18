/**
 * Pd12 While loop --> it's also a looping statement (repeatedly perform task)
 * if we don't know number of itearation go for while loop
 * print all odd presemnt between using while loop
 */
public class Pd12 {
    public static void main(String[] args) {
        int i = 1;
        int n = 20;
        while (i <= n) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            // if no updation go in infinite loop
            i++;
        }
    }
}