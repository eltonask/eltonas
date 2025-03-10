
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        while (true){
            int number = scanner.nextInt();
            if (number == -1){
                break;
            }
            statistics.addNumber(number);
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " +statistics.getSum());
        System.out.println("Average: " + statistics.average());

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
