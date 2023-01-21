public class tut_09_Associativity {
    public static void main(String[] args) {
        
        // Precedence & Associativity => (), [], *, /, +, -, %

        int a = 6*5-45/9+12;
        int b = 85/25-15+100*12/15%2;
        System.out.println(a);
        System.out.println(b);
        
        // (y^2 - 4xz)/2x using formula
        float x = 10;
        float y = 20;
        float z = 30;

        float k = (y*y - 4*x*z)/(2*x); 
        System.out.println(k);
    }
}
