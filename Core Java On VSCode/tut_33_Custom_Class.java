class Employee{

    int id;
    int salary;
    String name;

    // A custom class with methods.....

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}


public class tut_33_Custom_Class {
    public static void main(String[] args) {

        System.out.println("This is our custom class");
 
        /* 
        WHAT IS CUSTOM CLASS ?
        ==> We can create a custom class as follows :
            public class Employee{

                int id;    ======> Attribute 1
                String name;  ===> Attribute 2
            }

        Note : We can create only one public class ina program.
        
        */

        Employee obj1 = new Employee(); // Instantiating a new employee object
        Employee obj2 = new Employee();

        // Setting Attributes for obj1
        obj1.id = 12;
        obj1.name = "Gaurav Gangurde";
        obj1.salary = 34000;

        // Setting Attributes for obj2
        obj2.id = 18;
        obj2.name = "Raman Raghav";
        obj2.salary = 12000;

        // Printing the Attributes
        obj1.printDetails();
        obj2.printDetails();

        int salary = obj2.getSalary();
        System.out.println("My salary is " + salary);

        // System.out.println(obj.id);
        // System.out.println(obj.name);

    }
    
}
