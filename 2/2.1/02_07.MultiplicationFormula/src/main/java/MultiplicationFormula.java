
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Give the second number:");
        int secondNumber = scanner.nextInt();

        int Multipplication = firstNumber * secondNumber;

        System.out.println(firstNumber+ " * " +secondNumber + " = " +Multipplication);

    }
}
