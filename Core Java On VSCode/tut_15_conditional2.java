import java.util.Scanner;

public class tut_15_conditional2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            // switch case statements
            System.out.println("\n Arithmetic Operations :\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
            System.out.println(" Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value of a : ");
                    float a = sc.nextInt();
                    System.out.println("Enter the value of b : ");
                    float b = sc.nextInt();
                    System.out.println("a + b = " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter the value of x : ");
                    float x = sc.nextInt();
                    System.out.println("Enter the value of y : ");
                    float y = sc.nextInt();
                    System.out.println("x - y = " + (x - y));
                    break;
                case 3:
                    System.out.println("Enter the value of m : ");
                    float m = sc.nextInt();
                    System.out.println("Enter the value of n : ");
                    float n = sc.nextInt();
                    System.out.println("m * n = " + (m * n));
                    break;
                case 4:
                    System.out.println("Enter the value of p : ");
                    float p = sc.nextInt();
                    System.out.println("Enter the value of q : ");
                    float q = sc.nextInt();
                    System.out.println("p / q = " + (p / q));
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        sc.close();
    }
}
