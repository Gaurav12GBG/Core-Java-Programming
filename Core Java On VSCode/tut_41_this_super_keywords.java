class Ekclass{
    int a;

    Ekclass(int a){
       this.a = a;      // Use of the 'this'
    }

    public int getA(){
        return a;
    }

    public int returnOne(){
        return 1;
    }
}

class DoClass extends Ekclass{
    DoClass(int c){
        super(c);      // Use of the 'super'
        System.out.println("I am a constructor");
    }
}

public class tut_41_this_super_keywords {
    public static void main(String[] args) {

        /* 
        THIS AND SUPER KEYWORDS =>

        1. THIS => 'this' is a way for us to reference on object of the class
                    which is being created OR referenced.

                    this.a = 2;  ===> this is a reference to current object

        2. SUPER => 'super' is a reference variable used to refer immediate parent
                    class object 
                 => can be used to refer immediate parent class instance variable
                 => can be used to invoke parent class methods
                 => can be used to invoke parent class constructor. 
        */

        Ekclass ek = new Ekclass(65);
        System.out.println(ek.getA());
        // DoClass d = new DoClass(5);


        
    }
}
