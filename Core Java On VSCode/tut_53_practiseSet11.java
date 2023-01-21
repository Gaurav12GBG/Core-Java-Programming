// pbl1 and pbl2 sol :
abstract class Pen{
    abstract void write();
    abstract void reFill();
    abstract void ChangeNib();
};

class FountainPen extends Pen{
    void write(){
        System.out.println("I am abstract write method");
    }

    void reFill(){
        System.out.println("I am abstract refill method");
    }

    void ChangeNib(){
        System.out.println("I am abstract ChangeNib method");
    }
};

// pbl3 sol:
interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("I am a jump method");
    }

    public void bite(){
        System.out.println("I am a bite method");
    }
};

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("I am a eat method");
    }

    public void sleep(){
        System.out.println("I am a sleep method");
    }
};

// pbl4 sol:

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disConnect();
};

class smartTelepone extends Telephone{
    void ring(){
        System.out.println("I am a ring method");
    }

    void lift(){
        System.out.println("I am a lift method");
    }

    void disConnect(){
        System.out.println("I am a disConnect method");
    }
};

// pbl5 sol:
interface BasicAnimal2{
    void eat();
    void sleep();
}

class Monkey2{
    public void jump(){
        System.out.println("I am a jump method");
    }

    public void bite(){
        System.out.println("I am a bite method");
    }
};

class Human2 extends Monkey2 implements BasicAnimal2{
    public void eat(){
        System.out.println("I am a eat method");
    }

    public void sleep(){
        System.out.println("I am a sleep method");
    }
};

// pbl6 and pbl7 sol:
 interface TvRemote{
     void changeChannel();
     void findSignal();
 }

 interface SmartTvRemote extends TvRemote{
     void smartTv();
     void impLED();
 }

 class Tv implements SmartTvRemote{
    public void changeChannel(){
        System.out.println("I am changing the channel");
    }

    public void findSignal(){
        System.out.println("I am finding the signal with aggregate");
    }

    public void smartTv(){
        System.out.println("I am a smartTv i have hd quality");
    }

    public void impLED(){
        System.out.println("I am a imp file in SmartTv i have much more information about the smartTv");
    }
 };

// main function
public class tut_53_practiseSet11 {
    public static void main(String[] args) {
        
        /* 
        Problem 1 : Create an abstract class Pen with methods write() and refill() as abstract methods.
        Problem 2 : Use Pen class In PBL1 to create a concrete class FountainPen with additional method ChangeNib()
        */

        FountainPen p = new FountainPen();
        p.write();
        p.reFill();

        /* 
        Problem 3 : Create a class monkey with jump() and bite() methods. Create a class Human which inherits this monkeyclass and implements BasicAnimal interface and eat() and sleep() methods.
        */

        Human h = new Human();
        h.jump();
        h.eat();

        /* 
        Problem 4: Create a class Telephone with ring(), lift() and disConnect() methods as abstract methoda create another class smartTelepone and demonstrate polymorphism.
        */
       
        Telephone tel = new smartTelepone(); // This is show dynamic method dispatch...i.e Polymorphism
        tel.ring();
        tel.lift();
        tel.disConnect();

        /* 
        Problem 5 : Demonstrate polymorphism using mokey class from question 3.
        */

        BasicAnimal2 b = new Human2(); // Use only BasicAnimal2 methods and this will show polymorphism using interfces

        b.eat(); 
        // b.jump(); Not Allowed

        Monkey2 m = new Human2(); // use only Monkey2 methods
        m.jump();
        // m.eat(); Not Allowed

        Human h1 = new Human(); // use all methods...
        h1.eat();
        h1.jump();


        /* 
        Problem 6 : Create an interface TvRemote and use it to inherit another interface SmartTvRemote.
        Problem 7 : Create a class Tv which implements the TvRemote and SmartTvremote interface from pbl6.
        */

        Tv tv = new Tv();
        tv.changeChannel();
        tv.findSignal();
        tv.smartTv();
        tv.impLED();

    }   
}