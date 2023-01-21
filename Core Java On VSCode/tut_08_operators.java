public class tut_08_operators {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;

        // Basic four Operators in java
        System.out.println("1.Arithmetic Operators:");
        System.out.println("a + b = "+(a + b));
        System.out.println("a - b = "+(a - b));
        System.out.println("a * b = "+(a * b));
        System.out.println("a / b = "+(a / b));
        System.out.println("a % b = "+(a % b));
        System.out.println("a++ = "+(a++));
        System.out.println("b-- = "+(b--));
        System.out.println("++a = "+(++a));
        System.out.println("--b = "+(--b));


        System.out.println("\n2.Assignment Operators: =, +=, -=, *=, /=, %=");
        System.out.println(a);
        System.out.println(b);
        System.out.println("a += b : "+(a += b));
        System.out.println("a -= b : "+(a -= b));
        System.out.println("a *= b : "+(a *= b));
        System.out.println("a /= b : "+(a /= b));
        System.out.println("a %= b : "+(a %= b));


        System.out.println("\n2.Relational OR Comparison Operators: ==, !=, >, <, <=, >=");
        System.out.println("a == b :"+(a == b));
        System.out.println("a != b :"+(a != b));
        System.out.println("a > b :"+(a > b));
        System.out.println("a < b :"+(a < b));
        System.out.println("a >= b :"+(a >= b));
        System.out.println("a <= b :"+(a <= b));


        System.out.println("\n4.Logical Operators: &&, ||, !");
        System.out.println("((a > b) && (a < b)) :"+((a > b) && (a < b)));
        System.out.println("((a > b) && (a < b)) :"+((a > b) || (a < b)));
        System.out.println("!(a > b) :"+!(a > b));
    }

}
