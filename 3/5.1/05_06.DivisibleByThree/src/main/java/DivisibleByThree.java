
import java.util.Scanner;

public class DivisibleByThree {

    public static void divisibleByThreeInRange(int firstNumber, int secondNumber){
        for (int i = firstNumber; i<=secondNumber; i++){
            int divisible = i % 3;
            if (divisible==0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        divisibleByThreeInRange(1,13);


    }

}
