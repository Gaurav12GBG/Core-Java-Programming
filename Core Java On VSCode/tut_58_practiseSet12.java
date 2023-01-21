import java.util.Scanner;

public class tut_58_practiseSet12 {
    public static void main(String[] args) {
        /* 
        Problem 1: Create three classes Calculator, scCalculator and hybridCalculator group them into a package.

        solution in tut_58_practiseSetsolPackage folder


        Problem 2: Use a built in package in java to write a class which displays a messege after taking i/p from the user
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the messege: ");
        String msg = sc.nextLine();
        System.out.println(msg); 

        sc.close();

        //Problem 3: Create package in class with three package levels tut_practiseSetsolPackage, problem, problem1.
        //solution in tut_58_practiseSetsolPackage folder

        //Problem 4: prove that you cannot access default property but can access protected property from the subclass.

    }
}