public class tut_27_VarArgs {

    // static int sum(int a, int b){
    //     return a + b;
    // }

    // static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d){
    //     return a + b + c + d;
    // }

    static int sum(int x, int ...arr){
        // available as int [] arr
        int result = 0;
        for(int a : arr){
            result = result + a;
        } 
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");

        /*
        Variable Arguments (varargs) => 
                                     => Syntax : static void foo(int ...arr){
                                                   // arr is available here as int [] arr
                                                 }
        
        */

        // System.out.println("The sum of nothing is : "+ sum());
        // Above statement create error if there are (int x, int ...arr). for that we have to pass atleast one argument.
        // If there is only (int ...arr) then it not shows error.
         
        System.out.println("The sum of 1 is : "+ sum(1));
        System.out.println("The sum of 4 and 5 is : "+ sum(4, 5));
        System.out.println("The sum of 4, 5 and 6 is : "+ sum(4, 5, 6));
        System.out.println("The sum of 4, 5, 6 and 10 is : "+ sum(4, 5, 6, 10));
        System.out.println("The sum of 4, 5, 6, 10 and 12 is : "+ sum(4, 5, 6, 10, 12));


    }
}
