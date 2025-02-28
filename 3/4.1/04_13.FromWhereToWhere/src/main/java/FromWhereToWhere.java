
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int toNumber = scanner.nextInt();
        System.out.print("Where from? ");
        int fromNumber = scanner.nextInt();
        while (fromNumber<=toNumber){
            System.out.println(fromNumber);
            fromNumber++;
        }


    }
}
