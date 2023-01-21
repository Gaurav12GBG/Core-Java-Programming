class myEmployee{
    private int id;
    private int salary;
    private String name;

    // Constructor in a class
    public myEmployee(){
        id = 45;
        name = "Your-name-here";
    }

    // We can pass the arguments in a constructor
    public myEmployee(String myName, int myId){
            id = myId;
            name = myName;
        }

    public myEmployee(String myName){
            id = 100;
            name = myName;
        }

    public myEmployee(int mySalary){
           salary = mySalary;
    }
     

    // Methods in a class
    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }
}

public class tut_36_Constructor {
    public static void main(String[] args) {

        /* 
        CONSTRUCTOR => A member function used to initiaze an object while creating it.
                    => In order to write our own constructor, we define a method with
                       name same as class name.
                    => Syntax :
                                public myEmployee(){
                                    // write code here
                                }
                    => Automatically invoked at the time of object creation.

        CONSTRUCTOR OVERLOADING => Constructor can be overloaded just like other methods
                                   in java.
                                => Two or more constructors can have same name but
                                   different parameters. 

                                NOTE :
                                      1) Constructors can take parameters without being
                                         overloaded.
                                      2) There can be more than two overloaded
                                         constructors.
        */

        // myEmployee myEmp = new myEmployee();
        myEmployee myEmp = new myEmployee("GBG A World famous coder", 12);
        myEmployee myEmp1 = new myEmployee(12000);
        // myEmp.setId(25);
        // myEmp.setName("Gaurav");

        System.out.println(myEmp.getId());
        System.out.println(myEmp.getName());
        System.out.println(myEmp1.getSalary());   
    }    
}
