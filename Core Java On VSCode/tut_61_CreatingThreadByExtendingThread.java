class MyThread1 extends Thread{ //Thread is a built in class
    public void run(){
        System.out.println("y Cooking Thread Is Running !!");
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread2 for chatting with her");
        System.out.println("Little bit good....!");
    }
}

public class tut_61_CreatingThreadByExtendingThread {

    public static void main(String[] args) {
        
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}