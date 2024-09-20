
/**
 * OopsDay2
 */
public class Sample {
    double val = 4.5;
    char ch = 'J';

    void play() {
        System.out.println("Executing play()..........");
    }

    void run() {
        System.out.println("Executing Run()...............");
    }

    public static void main(String[] args) {
        Sample s = new Sample(); // Object Creation
        System.out.println(s.val);
        System.out.println(s.ch);

        s.play();
        s.run();
    }

}