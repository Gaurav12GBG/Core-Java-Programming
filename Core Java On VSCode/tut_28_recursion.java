import java.util.Scanner;

public class tut_28_recursion {

    // factorial(0) = 1
    // factorial(n) = n * n-1 * ......1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial (n-1)
    static int factorial(int n){
        if (n == 0 | n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    static int factorial_Iterative(int n){
        if (n == 0 | n == 1){
            return 1;
        }
        else{
            int product = 1;
            for(int i = 1; i<=n; i++){
                product = product * i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
        Recursion in java :
            A function in java can call itself. Such calling of function by itself is called recursion in java.
        */

        System.out.println("Enter the number to find the factorial : ");
        int number = sc.nextInt();

        System.out.println("The factorial of the " + number + " is : " + factorial(number));
        System.out.println("The factorial of the " + number + " is : " + factorial_Iterative(number));

        sc.close();
    }   
}