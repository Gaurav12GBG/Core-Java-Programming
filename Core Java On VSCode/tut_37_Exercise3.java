import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number : ");
        inputNumber = sc.nextInt();
    
        sc.close();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber == number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            // return true;
        }
        else if(inputNumber<number){
            System.out.println("Too less....");
        }
        else if(inputNumber>number){
            System.out.println("Too high....");
        }
        return false;
    }
}

public class tut_37_Exercise3 {
    public static void main(String[] args) {
        
       /*
        Exercise problem : Create a class Game, which allows a user to play "Guess the
                           Number" game once. Game should have the following methods :
                           1. Constructor to generate the random number
                           2. takeUserInput() to take a user i/p of a number
                           3. isCorrectNumber() whether the number entered by the
                              user is true
                           
                           Use properties such as noOfGuessess(int), etc to get this
                           task done !.  
       */

       Game g = new Game();
       boolean b = false;
       while(!b){
       g.takeUserInput();
       b = g.isCorrectNumber();
    
       }
    }   
}