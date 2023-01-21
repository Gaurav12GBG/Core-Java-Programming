import java.util.Scanner;

public class tut_06_Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in GBG`s Calculator =>");
        System.out.println("Subject names are :\n 1.DBMS \n 2.OS \n 3.CNT \n 4.PSOOP \n 5.COA");

        System.out.println("Enter the marks of above subjects:");
        System.out.print(" DBMS -> ");
        float DBMS = input.nextInt();
        System.out.print("   OS -> ");
        float OS = input.nextInt();
        System.out.print("  CNT -> ");
        float CNT = input.nextInt();
        System.out.print("PSOOP -> ");
        float PSOOP = input.nextInt();
        System.out.print("  COA -> ");
        float COA = input.nextInt();
        float percentage = (DBMS + OS + CNT + PSOOP + COA) / 5;
        System.out.println("Congratulations !!! You got a " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Hey...You got a price and Trophy because you are in distinction");
        } else if (percentage >= 70) {
            System.out.println("Hey...You got a only Trophy because you are in first class");
        } else {
            System.out.println("Sorry....You cannot got anything");
        }

        input.close();
    }

}
