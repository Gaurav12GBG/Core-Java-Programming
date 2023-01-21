public class tut_26_methodOverloading {

    static void foo(){
        System.out.println("Good morning bro!");
    }
    
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    // static void change2(int arr[]){
    //     arr [0] = 55;
    // } 

    // static void change(int a){
    //     a = 80;
    // }

    // static void tellJoke(){
    //     System.out.println("I invented a new word!\n" + "Plagiarism!");
    // }
    public static void main(String[] args) {
        
        // tellJoke();

        // Case 1 : Changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is : "+ x);
        
        // Case 2 : Changing the array
        // In case of arrays, the reference is passed.Same is the case for object passing to methods.
        // int marks [] = {98, 52, 68, 78, 75};
        // change2(marks);
        // System.out.println("The value of x after running change is : "+ marks[0]);


        // Method Overloading : 
        // Two or more methods can have same name but different parameters, such methods are called overloaded methods.
        // Method overloading cannot be performed by changing the return type of methods
        int a = 3000;
        int b = 4000;
        
        foo();
        foo(a);
        foo(a, b);

    }
}
