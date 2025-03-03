
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();
        while (true){
            Double input = Double.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        Double sumOfNumber = (double) 0;
        for (int i=0; i < list.size(); i++){
            sumOfNumber += list.get(i);
        }
        double average = sumOfNumber / list.size();
        System.out.println("Average: " +average);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
