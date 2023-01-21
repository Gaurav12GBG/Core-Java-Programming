import java.util.Scanner;

public class tut_16_practiseSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1 :
        int a = 10;

        if (a == 11) {
            System.out.println("You are win!!");
        } else {
            System.out.println("You are not win!!");
        }

        /* 
        Question 2 : Write a java program to check whether a student is pass or fail;
                     if it requires total 40% and at least 33% in each subject to pass
                     Assume three subjects and take marks as an i/p from th\e user.
        */
        System.out.print("\nEnter your marks in physics :");
        float physics = sc.nextFloat();
        System.out.print("Enter your marks in Chemistry :");
        float chemistry = sc.nextFloat();
        System.out.print("Enter your marks in Mathematics :");
        float Mathematics = sc.nextFloat();

        float percentage = (physics + chemistry + Mathematics)/3;
        System.out.println("Overall Percentage is :"+percentage);

        if ((percentage >= 40)|(physics >= 33)|(chemistry >= 33)|(Mathematics >= 33))
        {
            System.out.println("Congratulations !! You have been promoted...");
        }
        else{
            System.out.println("Sorry !! You have not been promoted Please try again..");
        }

        /* 
        Question 3 : Calculate the income tax paid by an employee to the government as
                     per the slabs mentioned below :

                     INCOME   SLABS    TAX
                      2.5L  -  5.0L     5%
                      5.0L  - 10.0L    20%
                      Above 10.0L      30%

                      Note that there is no tax below 2.5L. Take input amount as a input from the user.
        */
        float tax = 0;
        System.out.print("\nEnter your income in lakhs :");
        float income = sc.nextFloat();

        if(income < 2.5f){
            tax = tax + 0;
        }
        else if(income > 2.5f && income < 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income > 5f && income < 10.0f){
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is :" + tax);

        /* 
        Question 4 : Write a java program to find the day of the week given the number
                     [e.g. 1 for monday , 2 for tuesday.... upto 7 for sunday]
        */
        System.out.print("\nEnter the number to check day in a week :");
        int day = sc.nextInt();

        switch(day){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Choice");

        }

        /* 
        Question 5 : Write a java program to find the year entered by the user is a leap
                     year or not.
        */
        System.out.print("\nEnter the year to check whether it is leap year or not :");
        int year = sc.nextInt();

        int checkCompleteDivide = year%4;

        if(checkCompleteDivide == 0){
            System.out.println("" + year + " is a leap year.");
        }
        else
        {
            System.out.println("" + year + " is not a leap year.");
        }

        /* 
        Question 6 : Write a java program to find out type of website from the url
                     .com -> Commercial Website
                     .org -> Organization Website
                     .in -> Indian Website
        */
        System.out.println("\nWrite the website here to check the type of website :");
        String website = sc.nextLine();

        if(website.endsWith(".com")){
            System.out.println("This is a commercial website.");
        }
        else if (website.endsWith(".org")){
            System.out.println("This is a organization website.");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is a indian website.");
        }

        sc.close();
    }
}