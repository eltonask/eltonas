
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sumofnumbers = 0;
        while (true){
            int numbers = scanner.nextInt();

            if (numbers == 0) {
                break;
            }
            if (numbers>0){
                sumofnumbers+=numbers;
                count++;
            }
        }
        double averageofnumbers = sumofnumbers/count;
        if (count==0){
            System.out.println("Cannot calculate average");
        } else if (count>0) {
            System.out.println(averageofnumbers);
        }



    }
}
