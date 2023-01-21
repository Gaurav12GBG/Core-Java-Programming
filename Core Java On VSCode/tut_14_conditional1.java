import java.util.Scanner;

public class tut_14_conditional1 {
   public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        //if-else :

        System.out.println("Enter your age here:");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Yes you can drive !!!");
        }
        else{
            System.out.println("No you cannot yet !!!");
        }

        //if-else Ladder :
        System.out.println("Enter your percentage to check the grade :");
        float percentage = sc.nextFloat();

        if(percentage >= 90){
            System.out.println("Congratulaions !! You got grade 'A'");
        }
        else if(percentage >= 70){
            System.out.println("Congratulaions !! You got grade 'B'");
        }
        else if(percentage >= 35){
            System.out.println("Congratulaions !! You got grade 'C'");
        }
        else{
            System.out.println("Sorry !! You are Fail..");
        }
        sc.close();
   } 
}
