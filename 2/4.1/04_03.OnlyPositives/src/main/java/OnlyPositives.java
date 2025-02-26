import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int givenNumber = scanner.nextInt();
            if (givenNumber > 0) {
                int square = (int) Math.pow(givenNumber, 2);
                System.out.println("Square: " + square);
            } else if (givenNumber < 0) {
                System.out.println("Unsuitable number");
            } else if (givenNumber == 0) {
                break;
            }
        }


    }
}
