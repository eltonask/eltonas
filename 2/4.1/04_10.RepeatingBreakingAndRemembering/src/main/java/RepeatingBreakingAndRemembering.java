
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumOfNumbers = 0;
        int count = 0;
        int counteven = 0;
        int countodd = 0;
        System.out.println("Give a numbers: ");
        while (true){

            double numbers = scanner.nextDouble();
            if (numbers == -1){
                break;
            }
            if (numbers % 2 ==0){
                counteven++;
            } else {
                countodd++;
            }
            sumOfNumbers += numbers;
            count++;
        }

        double numbersAverage = sumOfNumbers/count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" +sumOfNumbers);
        System.out.println("Numbers: " +count);
        System.out.println("Average: " +numbersAverage);
        System.out.println("Even: " +counteven);
        System.out.println("Odd: " +countodd);
    }
}
