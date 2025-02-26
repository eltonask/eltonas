
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.nextLine().equals("Stop")) {
                break;
            }
            System.out.println("Shall we carry on?");
        }
    }
}
