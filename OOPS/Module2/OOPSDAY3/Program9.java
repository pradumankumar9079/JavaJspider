/**
 * Program9 Profile
 */
class Profile {
    // Non Static Date Memeber or Value Based Property
    String name;
    int age;
    String gender;

    // Non Static Member Function or Action Based Property
    void create() {
        System.out.println(name + " Profile Created");
    }

    void update() {
        System.out.println(age + " and Gender " + gender + " is Updated");
    }

    void rename() {
        System.out.println(name + " Renamed");
    }
}

public class Program9 {
    public static void main(String[] args) {
        // Person1 Profile Object
        Profile p1 = new Profile();
        // State
        p1.name = "Riya raj";
        p1.age = 22;
        p1.gender = "Female";
        // Behaviour
        p1.create();
        p1.update();
        p1.rename();

        // Person2 Profile Object
        Profile p2 = new Profile();
        // State
        p2.name = "Raja raj";
        p2.age = 23;
        p2.gender = "Male";
        // Behaviour
        p2.create();
        p2.update();
        p2.rename();
    }
}