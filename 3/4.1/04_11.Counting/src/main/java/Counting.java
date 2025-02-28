
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNumber = scanner.nextInt();
        int fromNumber = 0;
        while (fromNumber <= enterNumber) {
            System.out.println(fromNumber);
            fromNumber++;
        }

    }
}
