
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Password?");
        String password = scan.nextLine();
        String goodPassword = "Caput Draconis";

        if (password.equals(goodPassword)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
