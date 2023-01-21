import java.util.Scanner;

public class tut_20_practiseSet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
          Question 1 : Write a java program to print following pattern 
                       * * * * 
                       * * *
                       * *
                       *
          
         */

        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        /* 
        Question 2 : Write a java program to sum of first n even numbers using while
                     loop. 
        */
        int sum = 0;
        System.out.println("\nEnter the any number :");
        int number = sc.nextInt();

        for(int a = 0; a < number; a++){
            sum = sum + (2*a);
        }
        System.out.print("The Sum of first " + number + " even numbers is : " + sum);


        /* 
        Question 3 : Write a java program to print multiplication table of a given 
                     number n.
        */
        System.out.println("\n\nEnter the number for knowing their multiplication table :");
        int Number1 = sc.nextInt();
        System.out.println("Multiplication table of : " + Number1);

        for(int i = 1; i<= 10; i++){
            System.out.println("" + Number1 + " * " + i + "  =  " + Number1*i + "");
         }

         /* 
         Question 4 : Write a java program to print multiplication table of a given 
                      number n in reverse order.
         */
        System.out.println("\nEnter the number for knowing their multiplication table in reverse order :");
        int Number2 = sc.nextInt();
        System.out.println("In reverse order multiplication table of : " + Number2);

        for(int i = 10; i>=1; i--){
            System.out.println("" + Number2 + " * " + i + "  =  " + Number2*i + "");
         }

         /* 
         Question 5 : Write a program to find the factorial of a given number using for
                      loop.
         */
        System.out.println("\nEnter the number to check factorial :");
        int Number3 = sc.nextInt();
         // Factorial of n = n * n-1 * n-2 * ......1
         // 5! = 5 * 4 * 3 * 2 * 1 = 120
        if (Number3 == 0){
            System.out.println("Factorial of " + Number3 + " is : 1");
        }
        else{
            int factorial = 1;
            for(int i = 1; i <= Number3; i++){
                factorial = factorial * i;   
            }
            System.out.println("Factorial of " + Number3 + " is : " + factorial);
        }


        /* 
        Question 6 : Write a java program to calculate sum of numbers of multiplication 
                     table of any given number n.
        */

        System.out.println("\n\nEnter the number for knowing their sum of multiplication table :");
        int Number4 = sc.nextInt();

        int sumMultTableIs = 0;
        for(int i = 1; i<= 10; i++){
            sumMultTableIs = sumMultTableIs + (Number4 * i);
         }

        System.out.println("Sum of multiplication table of " + Number4 + " is : " + sumMultTableIs);

        sc.close();
    }
}