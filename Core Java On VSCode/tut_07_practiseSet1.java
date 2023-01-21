import java.util.Scanner;

public class tut_07_practiseSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*   // We have to calculate the cgpa of 3 subjects
        System.out.println("Enter your C Lang marks:");
        float c = sc.nextFloat();
        System.out.println("Enter your CPP marks:");
        float cpp = sc.nextFloat();
        System.out.println("Enter your JAVA marks:");
        float java = sc.nextFloat();
        float cgpa = (c + cpp + java) / 30;
        System.out.println("You got a " + cgpa + " cgpa"); */

        // Question 3:
        System.out.print("Please enter your name here:");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day !!!");

        sc.close();
    }
}