class Base1{

    Base1(){
        System.out.println("I am a constructor from the base class");
    }   

    Base1(int a){
        System.out.println("I am a overloaded constructor of base with value of a : "+ a);
    }  
}

class Derived1 extends Base1{
    
    Derived1(){
        super(0);
        System.out.println("I am a constructor from the derived class");
    }

    Derived1(int a, int b){
        super(a);
        System.out.println("I am a overloaded constructor of derived with value of b : "+ b);
    }
}

class childOfDerived1 extends Derived1{
    childOfDerived1(){
        System.out.println("I am a constructor from the child of derived class");
    }

    childOfDerived1(int a, int b, int c){
        super(a, b);
        System.out.println("I am a overloaded constructor from the child of derived with value of c : "+ c);
    }
}

public class tut_40_constructors_In_Inheritance {
    public static void main(String[] args) {

        /* 
        CONSTRUCTOR IN INHERITANCE :
                             => When a derived class is extended from the base
                                class,
                                the constructor of the base class is executed first followed by the constructor of the derived class.

                             => For the following inheritance hierarchy, the 
                                constructor are executed in the following order :

                                c1  ----->  child           | [Constructor are 
                                c2  ----->  Parent          |   executed in top to
                                c3  ----->  Grand child     |   bottom order]

                                       C1 ----> C2 ----> C3 

                             => When there are multiple constructors in the parent
                                class, without any parameters is called from the child class.
                                If we want to call the constructor woth parameters from the parent class , we can use super keyword.

                                                    Calls the constructor from 
                                Super(a, b) ====>   the parent class which takes 2
                                                    variables
                                   
                                                    
        */

        // Base1 base1 = new Base1();
        // Derived1 derive1 = new Derived1();
        // Derived1 derive1 = new Derived1();
        // childOfDerived1 cd = new childOfDerived1(12, 15, 16);
        
    }
}