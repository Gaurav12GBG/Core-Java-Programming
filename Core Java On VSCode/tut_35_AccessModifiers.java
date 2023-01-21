class Employee1{
    private int id;
    private String name;

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
}


public class tut_35_AccessModifiers {
    public static void main(String[] args) {
        /* 
        ACCESS MODIFIERS => Specifier where a property/method is accessible.
                         => Four types of access modifier : 
                                                           1] Private
                                                           2] Default
                                                           3] Protected
                                                           4] Public

        GETTERS AND SETTERS =>
                              a) Getters ==> Returns a value       [Accessors]
                              b) Setters ==> Set/Updates the value [ Mutators]   
        */

        Employee1 emp = new Employee1();
        // emp.id = 12;
        // emp.name = "Ram"; --> Throws an error due to private access modifier

        emp.setName("Gaurav");
        emp.setId(55);
        System.out.println(emp.getName());
        System.out.println(emp.getId());
    }
}
