class MyThreadMethods1 extends Thread {
    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("My Class 1");
            i++;

        }
    }
};

class MyThreadMethods2 extends Thread {
    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("class 2" );

            try{
                Thread.sleep(50); // Interrupt method
            }catch(Exception e){
                System.out.println(e);
            }

            i++;

        }
    }
};


public class tut_66_ThreadMethods {
    public static void main(String[] args) {

        // Methods of threads => join(), 
        MyThreadMethods1 t1 = new MyThreadMethods1();
        MyThreadMethods2 t2 = new MyThreadMethods2();
        t1.start();
        // try{
        //     t1.join();  // First up all t1.start() run and after that t2.start() RUN BECUASE OF JOIN()
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        t2.start();

    }
}
