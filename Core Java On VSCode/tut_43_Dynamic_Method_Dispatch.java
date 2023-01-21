class Phone{
    public void showTime(){
        System.out.println("Time is 8am");
    }

    public void on(){
        System.out.println("Turning on Phone !!!");

    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music !!!");
    }

    public void on(){
        System.out.println("Turning on SmartPhone!!");

    }
    
}

public class tut_43_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        
        /* 
        DYNAMIC METHOD DISPATCH =>

        Defination : Super class (REFERENCE) = Sub class (OBJECT)

        [SUPER] --- meth2(1), meth1 
                  |
        [SUB] <---- meth2(Overriden)(2), meth3

        Scenario 1 =>
                      super obj = new sub()  --> Allowed
                      obj.meth2()  --> (2) is called [Method Of Object]
                      obj.meth3()  --> Not Allowed

        Scenario 2 => sub obj = new super()  --> Not Allowed
        
        */


        // Phone obj = new Phone();  // Allowed
        // SmartPhone smob = new SmartPhone();  // Allowed
        

        Phone obj1 = new SmartPhone();  // Allowed
        // SmartPhone obj2 = new Phone();  // Not Allowed

        obj1.showTime();
        obj1.on();  // SmartPhone ka on() run hoga because it is actual object
        // obj1.music(); // not Allowed


        // Phone obj1 => Reference
        // SmartPhone => Actual Object creats at runtime
        
        
    }
}
