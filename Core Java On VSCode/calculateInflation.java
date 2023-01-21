import java.util.Scanner;

public class calculateInflation {

    public static double calculateCost(double cost, int years, double iRate) {

        double inflationrate = iRate/100*.01;
        for (int i = 0; i < years; i++){

            cost += cost * inflationrate;
        }
        cost = (int) (cost * 100) / 100.0;
        return cost;
    }

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        int years = sc.nextInt();
        double rate = sc.nextDouble();

        double amt = calculateCost(cost, years, rate);
        System.out.printf("%.2f", amt);
        sc.close();

    }
}
