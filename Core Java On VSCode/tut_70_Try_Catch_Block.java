public class tut_70_Try_Catch_Block {
    public static void main(String[] args) {
        
        /* 
        EXCEPTIONS IN JAVA:
        => A exception is an event that occurs when a program is executed disrupting the normal flow of instructions.
           - There are two types of exceptions in java :- Checked Exception ---> Compile time exception(Handled by
                                                                                                         compiler)
                                                        - Unchecked Exception -> Run time exceptions

           - Commonly Occuring Exceptions :- Following are few commonly occuring exceptions in java ,
                                           - NullPointer Exception
                                           - Arithmetic Exception
                                           - ArrayIndexOutOfBound Exception
                                           - IlligalArgument Exception
                                           - numberFormat Exception

        => Try, Catch block in java :
        - In java, Exceptions are managed using try, catch blocks.
        - Syntax :- try{
                        //code to try
                    }
                    catch(Exception e){
                        //code if exception
                    }

        */

        int a = 6000;
        int b = 0;
        
        //Without try:
        // int c = a/b;
        // System.out.println("The result of c is "+ c);

        //With try:
        try{
            int c = a/b;
            System.out.println("the result of c is "+ c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason : " + e);
        }

        System.out.println("End of the program");
    }
}
