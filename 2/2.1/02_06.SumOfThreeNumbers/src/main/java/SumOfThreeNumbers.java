
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("First number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Third number:");
        int thirdNumber = scanner.nextInt();

        int sumNumbers = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum of the numbers is " +sumNumbers);

    }
}
