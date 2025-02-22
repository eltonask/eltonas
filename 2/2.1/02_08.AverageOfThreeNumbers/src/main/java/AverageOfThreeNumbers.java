
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("First number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Third number:");
        double thirdNumber = scanner.nextDouble();

        double sum = (firstNumber + secondNumber + thirdNumber);
        double averageNumber = sum / 3;

        System.out.println("The average of numbers is " + averageNumber);
    }
}
