import java.util.Scanner;

public class tut_04_kiloToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length in kilometer to convert it into the miles :");
        double lengthInKilometer = sc.nextDouble();
        double miles = lengthInKilometer / 1.609;
        System.out.println("The kilometer length in miles is : "+miles);
        sc.close();
    }
}
