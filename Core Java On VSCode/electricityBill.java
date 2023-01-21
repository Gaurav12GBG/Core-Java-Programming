public class electricityBill {
    public static double calculateBill(int units)
    {
        if(units < 0)
          return 1;

        double first_unit_cost = 3.5;
        double second_unit_cost = 4.0;
        double third_unit_cost = 5.0;
        
        
        if (units >= 1 && units <= 30) {
            return units * first_unit_cost;
        }
        else if (units > 30 && units <= 70) {
            return (30 * first_unit_cost)
                + (units - (units-70))
                      * second_unit_cost;
        }
        else if (units > 70 && units > 100) {
            return (30 * first_unit_cost)
                + (70 * second_unit_cost)
                + (units - 100)
                      * third_unit_cost;
        }
       
        return 0;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        int units = 150;
        double billAmt = calculateBill(units);
        if(billAmt == 1.0)
            System.out.println(
                "INAVALID INPUT");
        else
            System.out.println(billAmt);
    }
}