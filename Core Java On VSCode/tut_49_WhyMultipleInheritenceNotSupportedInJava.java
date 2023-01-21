public class tut_49_WhyMultipleInheritenceNotSupportedInJava {

    public static void main(String[] args) {
        
        /* 
        IS MULTIPLE INHERITANCE NOT ALLOWED IN JAVA ?
        => i) Multiple inheritance face problems when there exists methods with same signature in both the super
           classes.
           ii) Due to such problem java does not support directly but the similar concept can be achieved using
               interfaces
           iii) A class can implement a multiple interface and extends the class at the same time.

           iv) Note :
                     - Interfaces in java is a bit like class but with a significant difference.
                     - An interface can only have method signatures, field(constant) and default method.
                     - The class declaring an interface needs to define the methods but not field.
                     - You can create the reference of the interfaces but not the object.
                     - Interface methods are public by default.
          
        */
    }
}