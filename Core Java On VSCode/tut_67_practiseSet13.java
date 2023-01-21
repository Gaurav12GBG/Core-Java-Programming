// pbl1 and pbl2 sol
class PractiseThreadClass extends Thread{
    public void run(){
        while(true){

            System.out.println("good morning");
        }
    }
}

class PractiseThreadClass2 extends Thread{
    public void run(){
        // while(true){

        //     try{
        //         Thread.sleep(200);
        //     }catch(Exception e){
        //         System.out.println(e);
        //     }

        //     System.out.println("Welcome");

        // }
    }
}

public class tut_67_practiseSet13 {
    public static void main(String[] args) {
        
        /* 
        Problem 1 : Write a java program to print "Good Morning" and "Welcome" continuosly on the screen using 
                    thread.

        Problem 2 : Add a sleep method in welcome thread of question 1 to delay its execution for 200ms.

        Problem 3 : Demonstrate getPriority and setPriority method in java thread.

        Problem 4 : How do you get state of a given thread in java ?

        Problem 5 : How do you get reference to the current thread in java ?
        
        */

        PractiseThreadClass ptc = new PractiseThreadClass();
        PractiseThreadClass2 ptc2 = new PractiseThreadClass2();

        ptc.setPriority(6);
        ptc2.setPriority(9);
        
        System.out.println(ptc.getPriority());
        System.out.println(ptc2.getPriority());

        System.out.println(ptc2.getState());


        // ptc.start();
        ptc2.start();
        System.out.println(ptc2.getState());
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());

    }
}
