
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number: ");
        int givenNumber = scan.nextInt();
        if (givenNumber>0) {
            System.out.println("The number is positive");
        } else if (givenNumber<0) {
            System.out.println("The number is negative");
        } else if (givenNumber==0) {
            System.out.println("The nuber is zero");
        } else {
            System.out.println("It is not a number");
        }
    }
}
