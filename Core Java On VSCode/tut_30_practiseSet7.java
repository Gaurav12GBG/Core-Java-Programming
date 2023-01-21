import java.util.Scanner;

public class tut_30_practiseSet7 {

    // Methods for Que1 :
    static void multiplication(int n){
        for(int i = 1; i<= 10; i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }

    // Methods for Que2 :
    static void pattern(int num){
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // Methods for Que3 :
    static int sumOfFirstNnaturalNo(int num1){

        //Based condition
        if(num1 == 1){
            return 1;
        }
        return num1 + sumOfFirstNnaturalNo(num1-1);
    }

    // Methods for Que4 :
    static void patternInReverseOrder(int num){
        for(int i = num; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // Methods for Que5 :
    static int fib(int num2){
        /* if(num2 == 1){
            return 0;
        }
        else if(num2 == 2){
            return 1;
        } */
        if(num2 == 1 || num2 == 2){
            return num2-1;
        }
        else{
            return fib(num2-1) + fib(num2-2);
        }
    }

    // Methods for Que6 :
    static int average(int ...arr){
        int result = 0;
        for (int a: arr){
           result = result + a;
        }
        return result/5;
    }

    // Methods for Que7 :
    static void pattern_rec(int n){
        if(n > 0){
            pattern_rec(n-1);
            for(int i =0; i<n; i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // pattern_rec(3);
    // pattern_rec(2) + 3 times and newline
    // pattern_rec(1) + 2 times and newline + 3 times star and newline
    // pattern_rec(0) + 1 times and newline + 2 times star and newline + 3 times star and newline

    // Methods for Que8 :
    // Fahrenhite to celcius = (^F - 32) X 5/9
    // Celcius to fahrenhite = (^C X 9/5) + 32
    static float tempConverter(float temperature){
        return (temperature * 9/5) + 32;
    } 




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questiuon 1 : Write a java program to print the multiplication table using methods.

        System.out.println("Enter the number to find the multiplication table  : ");
        int number = sc.nextInt();

        System.out.println("The multiplication table of " + number + " is : ");
        multiplication(number);


        /* 
        Question 2 : Write a java program to print the following pattern :
                     
                     *
                     * *
                     * * *
                     * * * *
        */

        // for above pattern please enter 4
        System.out.println("\nEnter the number to print the pattern : "); 
        int number1 = sc.nextInt();

        System.out.println("Now the pattern is : ");
        pattern(number1);


        // Question 3 : Write a recursive function to calculate sum of first n natural number.

        System.out.println("\nEnter the number to check sum of first n natural number : "); 
        int number2 = sc.nextInt();

        int sum;
        sum = sumOfFirstNnaturalNo(number2);
        System.out.println("The sum of the first " + number2 + " natural number is : "+ sum);


         /* 
        Question 4 : Write a java program to print the following pattern :
                     
                     * * * *
                     * * *
                     * * 
                     * 
        */

        // for above pattern please enter 4
        System.out.println("\nEnter the number to print pattern in reverse order : "); 
        int number3 = sc.nextInt();

        System.out.println("Now the pattern is : ");
        patternInReverseOrder(number3);


        // Question 5 : Write a function to print nth term of fibonacci series using recursion .

        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13....
        System.out.println("\nEnter the number to print fibonacci series : ");
        int number4 = sc.nextInt();

        int result = fib(number4);
        System.out.println(result);


        // Question 6 : Write a function to find average of set of numbers passed as arguments.

        System.out.println("\nEnter the numbers to calculate average : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        int average = average(n1, n2, n3, n4, n5);
        System.out.println("The average of " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + " is : "+ average);


        // Question 7 : Que.2 using recursive method.

        System.out.println("\nEnter the number to print the pattern : "); 
        int number5 = sc.nextInt();

        System.out.println("Now the pattern is : ");
        pattern_rec(number5);


       // Question 8 : Write a function to convert celsius temperature to fohrenite.
       System.out.println("\nEnter the celcius temperature to convert into the fahrenhite");
       float celciusTemp = sc.nextFloat();

       float fohreniteTemp = tempConverter(celciusTemp);
       System.out.println("The celcius temperature into the fahrenhite is : " + fohreniteTemp + " ^F");

       sc.close();         
    }
}