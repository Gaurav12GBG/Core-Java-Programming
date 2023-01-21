package tut_58_practiseSetsolPackage;

class Calculator{
    public void calculate(int a, int b){
        System.out.println("Your result is: "+ a+b);
    }
}

class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is: "+ Math.sin(a+b));
    }
}

class HyCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is: "+ a+b);
        System.out.println("Your result is: "+ Math.sin(a+b));
    }
}
public class problem1 {
    public static void main(String[] args) {
        
        //Problem 1: Create three classes Calculator, scCalculator and hybridCalculator group them into a package.
        System.out.println("I am solving my first problem");
    }
}
