import java.util.Scanner;

public class tut_05_sum {
    public static void main(String[] args) {
        // sum of three numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x:");
        int x = sc.nextInt();
        System.out.print("Enter y:");
        int y = sc.nextInt();
        System.out.print("Enter z:");
        int z = sc.nextInt();
        int sum = x + y + z;
        System.out.println("The sum is "+sum);
        sc.close();

    }

}
