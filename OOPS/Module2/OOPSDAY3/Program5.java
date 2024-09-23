/**
 * Program5 Object Creation Login Page
 */
class LoginPage {
    String username;
    String password;

    void login() {
        System.out.println("Login with: " + username + " and " + password);
    }

    void createAccount() {
        System.out.println("Redirected to create account page");
    }

    void forgotPassword() {
        System.out.println("Account Recovery Option for: " + username);
    }
}

public class Program5 {
    public static void main(String[] args) {
        LoginPage lp1 = new LoginPage();
        lp1.createAccount();

        System.out.println("================================");
        LoginPage lp2 = new LoginPage();
        lp2.username = "Raja raj";
        lp2.password = "123";
        lp2.login();

        System.out.println("================================");
        LoginPage lp3 = new LoginPage();
        lp3.username = "Raja raj";
        lp3.forgotPassword();
    }
}