public class tut_60_multiThreading {
    public static void main(String[] args) {
        
        /* 
        MULTITHREADING IN JAVA :
        => Multithreading and multiprocessing both are used to achieve multitasking.
         - Multiprocessing :- It is system that has more than one or two processors.CPU are added for increasing the 
                              computing speed of the system.
                            - Types : Symmetric and Asymmetric

         - Multithreading :- It is a system in which multiple thread are created of a process for increasing the
                             computing speed of the system.

         - Multitasking :- It is the ability of the cpu to perform multiple tasks simultaneously.

        => OS ----> process1, process2, process3.
           Within a process if we have to perform multitasking then we have use threading concept.

           Process ----->  Thread1, Thread2-----

        => In a nut shell :
         - Threads use shared memory area.
         - Threads --> Faster content switching
         - Thread is a light-weight whereas process is a heavy-weight.

        => For Example : A word processor can have one thread running in foreground as an editor and another as an
                         background auto saving the document !

        => Flow of control in java :
         - Without Threading :- Main() ---> Fun1() ---> Fun2() ---> End
                                    executes one by one at a time

                              - Main() ---> Fun1(), Func2() ------> End
                                     Parallely executes at a time

        => Creating a thread :
         - There are two ways to create a thread a thread in java : 1) By extending thread class
                                                                    2) By implementing runnable interface
        
        */
    }
}
