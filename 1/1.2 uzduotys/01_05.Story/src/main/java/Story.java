
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first. \nWhat is the main character called?");
        String characterName = scanner.nextLine();
        System.out.println("What is " +characterName+" job?");
        String characterJob = scanner.nextLine();
        System.out.println("Here is the story: \nOnce upon a time there was " +characterName+", who was a " + characterJob+".\nOn the way to work, " + characterName+" reflected on life.\nPerhaps " + characterName +" will not be a " + characterJob +" forever.");
    }
}
