

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        String userneme1 = "alex";
        String password1 = "sunshine";
        String username2 = "emma";
        String password2 = "haskell";
        if (username.equals(userneme1) && password1.equals(password)){
            System.out.println("You have successfully logged in!");
        } else if (username2.equals(username) && password.equals(password2)) {
            System.out.println("You have successfully logged in!");

        } else {
            System.out.println("Incorrect username or password");
        }
    }
}
