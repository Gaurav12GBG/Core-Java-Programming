import java.util.Scanner;

// class of pblm1
class Employees{

    int salary;
    String name;
    
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

// class of Pblm2
class CellPhones{
    public void ringing(){
        System.out.println("\nRinging...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void callFriend(){
        System.out.println("Call Gaurav...");
    }
}

// class of pblm3
class Square{
    float side;

    public float area(){
        return side * side;
    }

    public float perimeter(){
        return 4 * side;
    }

}

// class of pblm4
class TommyVecetti{
    public void hit(){
        System.out.println("\nHitting the enemy");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class tut_34_practiseSet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Problem 1 : Creating a class employee with following properties and methods :
                    1. salary (property)(int)
                    2. getsalary (method returning int)
                    3. name (property)(String)
                    4. getName (Method returning String)
                    5. setName (method changing name)
        */

        Employees obj1 = new Employees();

        obj1.setName("Gaurav");
        obj1.salary = 54000;

        System.out.println(obj1.getName());
        System.out.println(obj1.getSalary());


        /* 
        Problem 2 : Create a class cellphones with methods to print "Ringing...",
                    "Vibrating" etc.
        */

        CellPhones VivoV3 = new CellPhones();
        VivoV3.ringing();
        VivoV3.vibrate();
        VivoV3.callFriend();


        /* 
        Problem 3 : Create a class square with amethod to initialize its side,
                    calculating area and perimeter etc.
    
        */

        Square obj = new Square();

        obj.side = 47;
        obj.area();
        obj.perimeter();

        System.out.println("\nThe area of a square is : " + obj.area() + " sq.cm");
        System.out.println("The perimeter of a square is : " + obj.perimeter() + " sq.cm");


        /* 
        Problem 4 : Create a class TommyVecetti for Rockstar Games capable of hitting
                    (print hitting), Running and firing.        
        */
        TommyVecetti player = new TommyVecetti();
        player.hit();
        player.run();
        player.fire();

        sc.close();
    }
}