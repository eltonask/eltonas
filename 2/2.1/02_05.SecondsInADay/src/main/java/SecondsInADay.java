
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days you want convert to seconds");
        int enterDays = scanner.nextInt();
        int secondsDays = enterDays * 24 * 60 * 60;
        System.out.println(secondsDays);

    }
}
