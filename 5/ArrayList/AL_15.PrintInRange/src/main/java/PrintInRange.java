
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        System.out.println("The number in the range [0, 5]");
        printNumbersinRange(numbers, 0, 5);
        System.out.println("The number in the range [3, 10]");
        printNumbersinRange(numbers, 3, 10);
    }


    public static void printNumbersinRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int number : numbers){
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
