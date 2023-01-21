import java.util.Scanner;

public class tut_29_vowelsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character that you want to check whether it is vowels or not :");
        char character = sc.next().charAt(0);

        if ((character == 'a') | (character == 'e') | (character == 'i') | (character == 'o') | (character == 'u')) {
            System.out.println("Yes it is a vowels");
        } else {
            System.out.println("No it is not a vowels");
        }
        sc.close();
    } 
}