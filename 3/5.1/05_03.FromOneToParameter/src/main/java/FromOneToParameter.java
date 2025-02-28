

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(6);
    }

    public static void printUntilNumber (int enterNumber){
        int firstNumber = 1;
        while (firstNumber <= enterNumber){
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
