
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Give a second number:");
        int secondtNumber = scan.nextInt();

        if (firstNumber>secondtNumber) {
            System.out.println("Greater number is " +firstNumber);
        } else if (firstNumber<secondtNumber) {
            System.out.println("Greater number is " + secondtNumber);
        } else if (firstNumber == secondtNumber) {
            System.out.println("The numbers is equal");
        }
    }
}
