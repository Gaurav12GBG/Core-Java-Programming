import java.util.Scanner;
public class monkeyTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bollean value for aSmile= ");
        boolean aSmile = sc.nextBoolean();
        System.out.print("Enetr only booblean value for bSmile=  ");
        boolean bSmile = sc.nextBoolean();
        if (aSmile && bSmile || !aSmile && !bSmile) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }

}
