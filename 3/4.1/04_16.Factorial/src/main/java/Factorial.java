
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int givenNumber = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i<=givenNumber; i++){
            factorial *= i;
        }
        System.out.print("Factorial: " +factorial);
    }
}
