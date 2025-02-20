import java.util.Scanner;

public class Distence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X1:");
        Double X1 = scanner.nextDouble();
        System.out.println("Enter Y1:");
        Double Y1 = scanner.nextDouble();
        System.out.println("Enter X2:");
        Double X2 = scanner.nextDouble();
        System.out.println("Enter Y2:");
        Double Y2 = scanner.nextDouble();

        double atstumas = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2  - Y1),2));
        System.out.println("The distance between points is " +atstumas);

    }
}
