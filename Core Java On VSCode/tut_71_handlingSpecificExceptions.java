import java.util.Scanner;

public class tut_71_handlingSpecificExceptions {
    public static void main(String[] args) {
        
        /* 
        HANDLING SPECIFIC EXCEPTIONS :
        => In java, We can handle specific exceptions by typing multiple try and catch blocks.
           
           try{
               //code...
           }
           catch(IoException e){ --------> Handle all exception of type IOException
               //code...
           }
           catch(ArithmeticException e){ -----> Handle all Arithmetic type of exceptions
               //code...
           }
           catch(Exception e){ ----------> Handle all other of exceptions
               //code...
           }
    
        */

        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int index = sc.nextInt();

        System.out.println("Enter the number u want to divide the value with : ");
        int number = sc.nextInt();

        try{
            System.out.println("The value at the position of array index that u entered is : "+ marks[index]);
            System.out.println("The value of array-value/number is :" + marks[index]/number );
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Occured! : "+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured! : "+ e);
        }
        catch(Exception e){
            System.out.println("Some other Exception Occured! : "+ e);
        }

        sc.close();
    }
}
