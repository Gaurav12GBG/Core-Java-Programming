// Base class
class Base{
    public int x;

    public int getX(){
        return x;
    }
    
    public void setX(int x){
        System.out.println("I am in base and setting x now!");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

// Derived class means it is a sub class
class Derived extends Base{
    public int y;

    public int getY(){ 
        return y;
    }
    
    public void setY(int y){
        System.out.println("I am in derived and setting y now!");
        this.y = y;
    } 
}

public class tut_39_inheritance {
    public static void main(String[] args) {

        /* 
        INHERITANCE => Inheritance is used to borrow the properties and methods from an
                       existing class.
                       Example -
                                [phone]  --------->  [Smart phone]

                          [Super class]  --------->  [Sub class]     
                                                        (Sub class extends Super class)
                            
                    => Declaration :- Inheritance in java is declared using extends
                                      keyword.

                    => We can access variable or whole class from base class to derived
                       class using inheritance (extends keyword), 
                       but we cannot access variable or whole class from derived class 
                       to base class when extends base class into derived class.

                    => When a class inherits from a super class , it inherits part of  
                       super class methods and fields.

                    => Java doesn`t support multiple inheritance i.e. two classes cannot
                       be super classes for a sub class.  
        */
        
        // creating a object of Base class
        System.out.println("Using Base :");
        Base base = new Base();
        base.setX(55);
        System.out.println(base.getX());
        
        // creating a object of Derived class
        System.out.println("\nUsing Derived :");
        Derived derive = new Derived();
        derive.setX(15);
        System.out.println(derive.getX());
        derive.setY(150);
        System.out.println(derive.getY());
    }
}
