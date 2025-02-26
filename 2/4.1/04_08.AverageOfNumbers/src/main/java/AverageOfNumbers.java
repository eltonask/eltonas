
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sumofNumbers = 0;

        while (true) {
            System.out.println("Give a number: ");
            double number = scanner.nextDouble();

            if (number == 0){
                break;
            }
            count++;
            sumofNumbers += number;
        }
        double averageofNumbers = sumofNumbers/count;
        System.out.println("Average of numbers: " +averageofNumbers);
    }
}
