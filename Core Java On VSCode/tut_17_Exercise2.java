import java.util.Random;
import java.util.Scanner;

public class tut_17_Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rock, Paper and Scissors Game in java...
        System.out.println("ROCK, PAPER AND SCISSORS GAME :");
        System.out.println("Choose : 0 for Rock \n\t 1 for Paper \n\t 2 for Scissors");
        System.out.print("Please enter your choice :");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Game draw !!");
        } 
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } 
        else {
            System.out.println("Computer Win!");
        }
        // Computer choice
        if (computerInput == 0) {
            System.out.println("Computer choice: Rock");
        } 
        else if (computerInput == 1) {
            System.out.println("Computer choice: Paper");
        } 
        else if (computerInput == 2) {
            System.out.println("Computer choice: Scissors");
        }

        sc.close();
    }
}
