
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fromNumber = scanner.nextInt();
        int toNumber = 100;
        while (fromNumber<=toNumber){
            System.out.println(fromNumber);
            fromNumber++;
        }

    }
}
