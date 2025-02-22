
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number");
        int givenNumber = scan.nextInt();
        int liekana = givenNumber % 2;
        if (liekana == 0) {
            System.out.println("Number " +givenNumber+ " is even");
        } else if (liekana == 1) {
            System.out.println("Number " +givenNumber+ " is odd");
        }
    }
}
