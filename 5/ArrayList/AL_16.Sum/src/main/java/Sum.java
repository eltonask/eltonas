
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        sum(numbers);
        numbers.add(5);
        numbers.add(1);
        sum(numbers);
    }

    public static void sum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }
        System.out.println(total);
    }

}

