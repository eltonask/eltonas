
import java.util.Scanner;

public class   CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int years = scan.nextInt();
        if (years>0 && years<120){
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }
    }
}
