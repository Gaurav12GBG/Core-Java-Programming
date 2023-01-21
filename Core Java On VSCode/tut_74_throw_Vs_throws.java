//custom class for handling the exception
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class tut_74_throw_Vs_throws {

    public static double area(int r) throws NegativeRadiusException {
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    //Main method
    public static void main(String[] args) {

        /*
          Throws Keyword : 
          => - The java throws keyword is used to declare an exception
             - This gives an information to the programmer that there might be an exception so its better to be
               prepared with try catch blocks!

             - public static void Calculate(int a, int b) throws ArithmeticException{
                    //code
               }
          
         */
        
        // divide method handled using try catch blocks
        try {
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        // area method handled using try catch blocks
        try{
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception occured !"+ e);
        }

    }
}
