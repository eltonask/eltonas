

public class Division {

    public static void main(String[] args) {
        division(3,5);
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
    }
    public static void division(int numerator, int denominator){
        if (denominator==0){
            System.out.println("Division by zero is illegal");
        } else {
            double division = (double) numerator/denominator;
            System.out.println(division);
        }
    }
    // implement the method here
}
