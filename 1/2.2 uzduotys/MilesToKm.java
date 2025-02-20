import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter miles:");
        double miles = scanner.nextDouble();
        double km = miles * 1.6;
        System.out.printf("%.1f miles = %.1f km", miles, km);
    }
}