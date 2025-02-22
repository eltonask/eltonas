
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Give a second number");
        double secondNumber = scanner.nextDouble();

        double Sum = firstNumber + secondNumber;
        double Minus = firstNumber - secondNumber;
        double multi = firstNumber * secondNumber;
        double divider = firstNumber / secondNumber;

        System.out.println(firstNumber+ " + " + secondNumber + " = " +Sum );
        System.out.println(firstNumber+ " - " + secondNumber + " = " +Minus );
        System.out.println(firstNumber+ " * " + secondNumber + " = " +multi );
        System.out.println(firstNumber+ " / " + secondNumber + " = " +divider );
    }
}
