class MyThread5 extends Thread{
    public MyThread5(String name){
        super(name);
    }

    public void run(){
        System.out.println("I am a Thread");
    }
};

public class tut_64_ConstructorFromThreadClass {

    public static void main(String[] args) {
        
        /* 
        THE THREAD CLASS :
        => Below are commonly used constructors of thread class :
            1. Thread()
            2. Thread(String name)
            3. Thread(Runnable r)
            4. Thread(Runnable r, String name)
        */

        MyThread5 mt1 = new MyThread5("Gaurav");
        MyThread5 mt2 = new MyThread5("Akshay");
        mt1.start();
        mt2.start();
        
        System.out.println("The id of the given thread is : " + mt1.getId());
        System.out.println("The name of the given thread is : " + mt1.getName());

        System.out.println("The id of the given thread is : " + mt2.getId());
        System.out.println("The name of the given thread is : " + mt2.getName());
    }
}