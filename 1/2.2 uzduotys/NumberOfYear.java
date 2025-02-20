import java.util.Scanner;

public class NumberOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the minutes:");
        int minutes = scanner.nextInt();
        int year = minutes / 525600;
        int day = minutes / 1440 - (year*365);
        System.out.println(year +" years and " +day+" days");

    }


}
