
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        //Read writen text
        String message = scanner.nextLine();
        //Print the message
        System.out.println("Buvo irasyta: " + message);

    }
}
