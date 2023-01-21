/*
In this java tutorial we are covering the point as :
     1. data types and variables
     2. Input-Output function : O/P : System.out.println() , I/P : Scanner + Object 
     3. control statements : a. if-else  b. switch case
     4. function in java
*/
import java.util.Scanner;

public class tut_02_calender {
    static void start() {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to continue !! If yes press Y Otherwise press N:");
        char ch2 = input.next().charAt(0);
        System.out.println(ch2);

        if ((ch2 == 'Y') | (ch2 == 'y')) {
            menu();
        }
        else if((ch2 == 'N') | (ch2 == 'n')) {
            System.out.println("Thanks for visiting on our site...");
            System.out.println("See You Later !!!");
        } 

        input.close();
    }

    static void menu() {
        
        System.out.println("Welcome in GBG`s Day Speaker :");
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        menu();
        System.out.print("Please enter the day number from 1 to 7 to check out day:");
        int ch = sc.nextInt();
        System.out.println(ch);

        switch (ch) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thirsday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid Choice");
                start();
                break;
        }

        sc.close();
    }

}
