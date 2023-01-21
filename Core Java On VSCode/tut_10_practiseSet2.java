import java.util.Scanner;

public class tut_10_practiseSet2 {

    public static void main(String[] args) {
        /*
         * Question 1 : What will be the result of following expression 
         *              float a = 7/4*9/2
         */

        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println("The result of above expression is = " + a);

        /*
        *  Question 2 : Write a java program to encrypt grade by adding 8 to 
        *                it.Decrypt it to show the correct grade.
        */

        // Encrypt the grade
        char grade = 'A';
        grade = (char) (grade + 8);
        System.out.println("After adding 8 with the grade : " + grade);

        // Decrypt the grade
        grade = (char) (grade - 8);
        System.out.println("After decrypting : " + grade);

        /*
         * Question 3 : Use comparision operator to check whether given number is
         * greater than the user entered number or not
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is greater than num1");
        }

        /* Question 4 : Write the following expression in the java program :
        *                            v^2 - u^2 / 2rc     */

        float v = 5;
        float u = 4;
        float r = 1;
        float c = 2;

        float res = (v*v - u*u)/ 2*r*c;
        System.out.println("The result of above expression is :" +res);

        sc.close();

    }
}