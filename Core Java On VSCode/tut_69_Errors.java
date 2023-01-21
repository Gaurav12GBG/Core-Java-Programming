import java.util.Scanner;

public class tut_69_Errors {
    public static void main(String[] args) {
        
        // Syntax Error Demo :
        // int a = 5 --------> Throws a syntax error missing semicolon
        // a = a + 54;
        // b = 15;   --------> Error: b is not declared !    
        // System.out.println(a);

        // Logical Error Demo :
        // Write a java program to print the all prime numbers between 1 to 10.
        System.out.println(2);
        for(int i=0; i<10; i++){
            System.out.println(2*i+1);  /* Here due to this logic 9 is print under the output so it shows logical 
                                           error */

        // Runtime Error Demo
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is : " + 1000/k);

        // when divided by 0 it throws an error....that is what runtime error

        sc.close();
        }
    }
}
