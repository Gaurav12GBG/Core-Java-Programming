abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor of base2 class");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }

    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class tut_46_AbstractClass_AbstractMethod {
    public static void main(String[] args) {

        /* 
        ABSTRACT CLASS AND ABSTRACT METHOD :

        WHAT IS ABSTRACT IN ENGLISH ?
        ===> Existing in thought or as an idea without concrete existance.
        
        ABSTRACT METHOD => A method that is declared without an
                           implementation.
                        => Syntax :
                                   abstract void moveTo(double x, double y) 

        ABSTRACT CLASS  => If a class includes abstract methods, then the 
                           class itself must be declared abstract, as in : 
                           
                           public abstract class PhoneModel{
                               abstract void SwitchOff();
                               // more code
                            }

                        => When an abstract class is subclassed, the 
                           subclass provides implementations for all the methods in parent class. if it doesn`t , it must be declared abstract.

                        => Example :
                                            |----> Circle
                                    Shape -------> Rectangle
                                            |----> Rhombus

                        => Note : i] It is possible to create reference of 
                                     an abstract class.
                                 ii] It ia not possible to create an object
                                     of an abstract class.
                                     
                        => We can also assign references of an abstract
                           class to the object of a concrete subclass.
        */

        // Parent2 p = new parent2(); // Not Allowed it is abstract
 
        // Child2 c = new Child2();   // Allowed

        // Child3 p = new Child3();   // Not Allowed it is abstract

        // Child2 c2 = new Parent2(); // Not allowed

        // Parent2 p2 = new Child2(); // Allowed


    }
}
