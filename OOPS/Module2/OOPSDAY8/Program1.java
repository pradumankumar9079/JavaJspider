
/**
 * Program1
 */
import java.util.Scanner;

class Employee {
    int eId;
    double ctc;

    Employee(int a, double d) {
        eId = a;
        ctc = d;
    }
}

class EmployeeUtility {
    static Employee creatEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Eid");
        int id = sc.nextInt();
        System.out.println("Enter Eid");
        double c = sc.nextDouble();

        Employee emp = new Employee(id, c);
        return emp;
    }

    static void displayEmployeeDetails(Employee e) {
        System.out.println("Eid is " + e.eId);
        System.out.println("Ctc is " + e.ctc);
    }
}

public class Program1 {
    public static void main(String[] args) {
        // in eclipse
    }
}