/*
Creating Object Problem1
*/
class Student {
    // Value Based Property
    String name;
    int id;

    // Action Based Property
    void study() {
        System.out.println("Student " + name + " " + id + " is Studying");
    }

    void sleep() {
        System.out.println("Student " + name + " " + id + " is Sleeping");
    }
}

public class Program1 {
    public static void main(String[] args) {
        // 1'st Object Using Student Template and can be Used to Create multiple Object
        Student s1 = new Student();
        s1.name = "Rama";
        s1.id = 101;
        s1.study();

        // 2 nd Object
        Student s2 = new Student();
        s2.name = "Sita";
        s2.id = 102;
        s2.sleep();

    }
}
