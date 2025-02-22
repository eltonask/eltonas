
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String givenString = scanner.nextLine();
        System.out.println("Give an integr:");
        int givenInteger = scanner.nextInt();
        System.out.println("Give a double:");
        double givenDouble = scanner.nextDouble();
        System.out.println("Give a boolen");
        boolean givenBoolen = scanner.nextBoolean();

        System.out.println("You gave the string " + givenString);
        System.out.println("You gave the integer " + givenInteger);
        System.out.println("You gave the double " + givenDouble);
        System.out.println("You gave the boolean " + givenBoolen);
    }
}
