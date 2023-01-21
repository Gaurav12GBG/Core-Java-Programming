import java.util.Scanner;

public class tut_01_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name here:");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("Enter your age: ");
        int x = sc.nextInt();
        int res = x * x;
        System.out.println(res);

        sc.close();

    }

}