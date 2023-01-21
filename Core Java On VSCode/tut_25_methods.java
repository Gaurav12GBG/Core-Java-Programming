import java.util.Scanner;

public class tut_25_methods {
    // int logic(int x, int y)
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = x + y * 5;
        }
        return z;   // returns value
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        Method in java :- Method is a simply function written inside a class since java
                          is a OOP language.
                        - We need to write the method inside some class.
                        - Syntax :  static datatype name(){
                                       method body
                                    }
                        - Method Call :- A method can be called by creating an object of
                                         the class in which the method exists followed by
                                         the method call.
                                       - e.g.  calc obj = new calc(); // Object creation
                                               obj.logic(a, b); // method call by object

        */

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int add;
        
        // Method Invocation using object creation
        // tut_25_methods obj = new tut_25_methods();
        // add = obj.logic(a, b);

        add = logic(a, b);
        System.out.println("The sum is :"+ add);

        sc.close();
    }
}
