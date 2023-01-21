import java.util.Scanner;

public class tut_03_intOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the specific value to check whether that value is integer OR not :");
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
