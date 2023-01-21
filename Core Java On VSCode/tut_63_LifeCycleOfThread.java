public class tut_63_LifeCycleOfThread {
    public static void main(String[] args) {
        
        /* 
        LIFE CYCLE OF THREAD IN JAVA :
        =>
        -  (1)NEW ----> (2)RUNNABLE ------------------------------------> (3)RUNNING  ----> (5)TERMINATED
                       RUNNABLE(2) <---- (NON_RUNNABLE or BLOCKED)(4) <---- RUNNING(3)

        => Explain :-
                    - NEW : Instance of thread created which is not yet started by invoking start().
                    - RUNNABLE : Alter invocation of start and before it is selected to the run by the schedular.
                    - RUNNING : After thread schedular has select it.
                    - NON RUNNABLE : Thread alive, not eligible to run.
                    - TERMINATED : run() method has exitted.
        */
    }
}
