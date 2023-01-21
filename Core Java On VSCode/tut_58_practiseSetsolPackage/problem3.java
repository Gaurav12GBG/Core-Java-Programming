package tut_58_practiseSetsolPackage;

class Calculator1{
    public void calculate(int a, int b){
        System.out.println("Your result is: "+ a+b);
    }
}

class ScCalculator1{
    public void calculate(int a, int b){
        System.out.println("Your result is: "+ Math.sin(a+b));
    }
}

class HyCalculator1{
    public void calculate(int a, int b){
        System.out.println("Your result is: "+ a+b);
        System.out.println("Your result is: "+ Math.sin(a+b));
    }
}
public class problem3 {
    public static void main(String[] args) {
        
        //Problem 3: Create package in class with three package levels tut_practiseSetsolPackage, problem, problem1.
        System.out.println("I am solving my Third problem");
    }
}

