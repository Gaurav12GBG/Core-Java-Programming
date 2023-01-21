import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
      
        return "I am toString() method";
    }

    @Override
    public String getMessage() {
        
        return "I am getMessege() method";
    }
}

public class tut_73_ExceptionClass {
    public static void main(String[] args) {
        
        /* 
        EXCEPTION CLASS IN JAVA :
        => We can write our custom exception using the exception class in java.

           public class MyException extends Exception{
               //Overriden methods
           }

        => The exception class has following methods :- String toString() --> Executed when sout(e) is run.
                                                      - void printStackTrace() --> prints stack trace
                                                      - String getMessege() --> prints the exception messege

        => The Throw Keyword :
          - The Throw keyword is used to throw an exception explicitly by the programmer. 
          -   if(b == 0){
              throw new AriothmeticException("Divide by 0");
              }
              else{
                  return a/b;
              }

          - In a similar manner, we can throw user defined exception:
              throw new MyException("Thrown exception");

          
        */

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        a = sc.nextInt();

        sc.close();

        if(a<10){
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
        
        
    }
}
