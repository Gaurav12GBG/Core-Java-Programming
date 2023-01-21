interface Interface1{
    void meth1();
    void meth2();
}

interface Interface2 extends Interface1{
    void meth3();
    void meth4();
}

class Myclass implements Interface2{
    public void meth1(){
        System.out.println("Meth1");
    }

    public void meth2(){
        System.out.println("Meth2");
    }

    public void meth3(){
        System.out.println("Meth3");
    }

    public void meth4(){
        System.out.println("Meth4");
    }
};


public class tut_51_Inheritance_In_Interfaces {
    public static void main(String[] args) {
        
        /* 
        INHERITANCE USING INTERFACES :
        => Interfaces can extends the another interfaces - 
                public interface Interface1{
                    void meth1();
                }

                public interface Interface2 extends Interface1{
                    void meth2();
                }

        => Remember that interface cannot implements the another interface only classes can do it !
        */
        
        Myclass obj = new Myclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }
}
