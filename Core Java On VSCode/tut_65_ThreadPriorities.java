class MyThreadPriorities extends Thread {
    public MyThreadPriorities(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("I am a Thread with name " + getName());
            i++;

        }
    }
};

public class tut_65_ThreadPriorities {
    public static void main(String[] args) {

        MyThreadPriorities mt1 = new MyThreadPriorities("Gaurav1");
        MyThreadPriorities mt2 = new MyThreadPriorities("Akshay2");
        MyThreadPriorities mt3 = new MyThreadPriorities("Vaishnavi3");
        MyThreadPriorities mt4 = new MyThreadPriorities("Rashi4");
        MyThreadPriorities mt5 = new MyThreadPriorities("Abhishek5 (Most iMP");
        mt5.setPriority(Thread.MAX_PRIORITY); // 10
        mt4.setPriority(Thread.MIN_PRIORITY); // 10
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}
