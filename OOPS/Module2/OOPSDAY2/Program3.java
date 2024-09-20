/**
 * Example
 */
class Example {
    int num = 45;
    boolean status = false;

    void send() {
        System.out.println("Executing Send()..............");
    }

    void execute() {
        System.out.println("Executing Execute()..............");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.num);
        System.out.println(ex.status);

        ex.send();
        ex.execute();
    }
}
