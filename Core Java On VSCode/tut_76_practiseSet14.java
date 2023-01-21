import java.util.Scanner;

public class tut_76_practiseSet14 {
    public static void main(String[] args) {
        
        // Problem 1: Write a java code to demonstrate syntax, logical and runtime error.

        //Syntax Error
        // int x ------> Throws syntax error
        // int y = 100;
        // int z = x - y;
        // System.out.println(z);

        //Logical error
        // int age = 78;
        // int year_born = 2000-78;

        //Runtime error
        // System.out.println(6/0);

        //Problem 2 : Write a java program that prints "haha" during the ArithmeticException and "HeHe" during the illigal argument exception.

      /*   try{
            int a = 666/0;
            // System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        } */

        //Problem 3: Write a program that allows u to keep accessing an array until valid index is given . if max retries exceed 5 print error.

        String[] name = {"Gaurav", "Vaishnavi", "Akshay", "Harish", "Ram", "HarryBhai"};
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean flag = true;
        while(flag && i<5){
            try{
                System.out.println("Enter the index position : ");
                int indexPos = sc.nextInt();
                System.out.println("The name at indexPos is :"+ name[indexPos]);
                break;
            }
            catch(Exception e){
                System.out.println("Error");
                i++;
            }
        }
        
        sc.close();

        //Problem 4 : Modify program in pbl3 to throw an custom exception if max retries are reached.

        //Problem 5: Wrap the program in pbl3 inside a method which throws your custom exception.

    }
}
