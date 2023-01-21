public class tut_55_IsJavaInterpretedORCompliled {

    public static void main(String[] args) {
        
        /* 
        IS JAVA INTERPRETED OR COMPLILED LANGUAGE ?
        => Java is a hybrid language --> Means both compliled as well as interpreted !!

                            compiled                          bytecode
        =>  Java File --------------------> Class File -----------------------> Can be used by java interpreter
           (file.java)     using javac                       file.class

           Note : file is a simply file name.
                  bytecode means it is present in classfile.

        => - A JVM can be used to interprete this bytecode.
           - This bytecode can be taken to any platform(WIN/MAC/LINUX) for execution.
           - Hence java is platform independent (Write Once Run Everywhere).

        => Executing a java program
           - javac file.java  ---------> Compiled
           - Java file  ---------------> Interpreted

           - So fare the execution of our program was being managed by vscode itself.
           - We can write the code on notepad also and run it on windows powershell/command prompt using above two
             commands.
        */
    }
}