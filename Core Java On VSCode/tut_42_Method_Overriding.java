class A{
    public int a;
    public int gbg(){
        return 4;
    }

    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override       // is used because to show the error 
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }

    public void meth3(){
        System.out.println("I am method 3 of class A");
    }
}

public class tut_42_Method_Overriding {
    public static void main(String[] args) {

        /* 
        METHOD OVERRIDING => If the child class implement the same method present
                             in the parent class again, it is known as method overriding.

                          => When an object of subclass is created and the
                             overrided method is called, the method which has been implemented in the subclass is called & its code is executed. 
        
        */
        
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}