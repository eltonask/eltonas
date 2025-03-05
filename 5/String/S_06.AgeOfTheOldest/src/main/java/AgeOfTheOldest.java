import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0; // Variable to store the oldest age

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) { // Stop when an empty line is entered
                break;
            }

            // Split input by comma
            String[] parts = input.split(",");

            // Extract name and age
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());

            // Update maxAge if the current age is greater
            if (age > maxAge) {
                maxAge = age;
            }
        }

        System.out.println("Age of the oldest person: " + maxAge);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}