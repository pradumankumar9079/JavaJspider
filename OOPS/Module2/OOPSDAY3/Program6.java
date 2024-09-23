/**
 * Program6 Creating Bank Account Object
 */
class BankAccount {
    long accountNumber;
    double accountBalance;

    void withdraw() {
        System.out.println("WithDraw from Acoount Number: " + accountNumber);
    }

    void deposit() {
        System.out.println("Account Balance is" + accountBalance);
    }

}

public class Program6 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accountNumber = 2324;
        b1.accountBalance = 20000;

    }
}