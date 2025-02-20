
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Write yout name:");
        //Read user input
        String writeName = scanner.nextLine();
        //Say hello for user
        System.out.println("Hello " + writeName);

    }
}
