class MyThreadRunnable1 implements Runnable{// Built in runnable interfaces..
    @Override
    public void run(){
        int i = 0;
        while(i<5){

            System.out.println("I am a thread1 from the runnable interfaces");
            i++;
        }
    }
};

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<5){

            System.out.println("I am a thread2 from the runnable interfaces");
            i++;
        }
    }
};

public class tut_62_ThreadByImplementingRunnableInterface {
    public static void main(String[] args) {
        
        /* 
        THREAD BY IMPLEMENTING RUNNABLE INTERFACES :
        => 
        */

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

        // It is concurrently run one by one ....sometimes thread1 and sometimes thread2

        System.out.println("Thread is running...Now");


    }
}
