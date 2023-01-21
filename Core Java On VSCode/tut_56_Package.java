// import java.util.*;       ---> 1st way
// import java.util.Scanner; ---> 2nd way
public class tut_56_Package {
    public static void main(String[] args) {
        
        /* 
        PACKAGE IN JAVA :
        => - A package is used to group related classes.
           - Package helps in avoiding name conflicts.
           - There are two types of packages : A] Built In Packages ----------> Java API
                                               B] User Defined Packages ------> Custom Packages

        => Create the Java Packages :
        - Using a java package :
                                - import java.lang.*            --------> importing everything from java.lang
                                - import java.lang.String       --------> import string from java.lang
                                - s = new java.lang.String("Gaurav") ---> Use without importing

        => Creating a Package :
        - javac Demo.java  ---------> Creates a Demo.class
        - javac -d . Demo.java -----> Creates a package folder
        - javac -d . *.java --------> creates a package folder for all

        => We can keep adding classes to a package like this,
        - We can also create inner packages by adding "package(folder).inner(subfolder)" as package names.
        - These packages once created can be used by other classes.
        
        */

        java.util.Scanner sc = new java.util.Scanner(System.in); // 3rd way

        sc.close();
    }
}
