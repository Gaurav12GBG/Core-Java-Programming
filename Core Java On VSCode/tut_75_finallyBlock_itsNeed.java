
public class tut_75_finallyBlock_itsNeed {

    public static int greet(){
        try{
            int a = 6;
            int b = 0;
            int c = a/b;
            return c;

        }
        catch(Exception e){
            System.out.println("Exception occured"+ e);
        }

        // Always Execute
        finally{
            System.out.println("Cleaned up the system resources...");
        }
        return -1;

    }
    public static void main(String[] args) {
        
        /* 
        FINALLY BLOCK :
        => Finally block contains the code which is always executed whether the exception is handled OR not.
         - It is used to execute code containing instructions to release the system resources, close the
           connection !

        => Important :- The finally block is a key tool for preventing resource leaks. When closing
                        a file or otherwise recovering resources, place the code in a finally block
                        to ensure that resource is always recovered.
        
        */
        
        int k = greet();
        System.out.println(k);
        int a = 78;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for the value of b = "+ b);
            }
            b--;
        }

        try{
            System.out.println(5/0);
        }
        finally{
            System.out.println("Yes this is valid java code");
        }

       
    }
}
