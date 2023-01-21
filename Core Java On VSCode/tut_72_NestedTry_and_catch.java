import java.util.Scanner;

public class tut_72_NestedTry_and_catch {
    public static void main(String[] args) {

        /* 
        NESTED TRY CATCH :
        => We can nest multiple try catch block as follows :
           try{
               //code..
               try{
                   //code...
               }
               catch(Exception e){
                   //code...level 2
               }
           }
           catch(Exception e){
               //code...level 1
           }

        => We can further nest try catch blocks inside the nested try catch blocks.

        => Quick Quiz : Write a java program that keep u to allows accessing until a valid index which is given by
                        the users.

        */

        int [] marks = {10, 20, 55};

        Scanner sc = new Scanner(System.in);
        
        boolean flag = true;
        while(flag){
            System.out.println("Enter the value of array index: ");
            int index = sc.nextInt();
            
            try{
                System.out.println("Welcome to Exception handling tutorial");
    
                try{
                    System.out.println("The value at array index entered is: "+ marks[index]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBoundsException occured!");
                    System.out.println(e);
                }
            }
            catch(Exception e){
                System.out.println("Some Exception occured!");
                System.out.println(e);
            }
        }

        System.out.println("Thanks for using our program");

        sc.close();
        
    }
}
