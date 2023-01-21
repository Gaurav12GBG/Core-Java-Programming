import java.util.Scanner;

/* String in java =>
                  - A string is a sequence of character.
                  - Immutable
                  - Ways to print output:System.out.print(); => No new line at end 
                                         System.out.println();=> Newline at the end
                                         System.out.printf();=> Access Specifier
                                         System.out.format();=> Access Specifier
*/
public class tut_11_strings {
    public static void main(String[] args) {
        String name = new String("Gaurav");
        System.out.print("The name is:"+name);
        System.out.print("\n"+name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("\nThe value of a is %d and b is %f\n", a, b);
        System.out.format("The value of a is %d and b is %f\n", a, b);
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(str);
        String str2 = sc.nextLine();
        System.out.println(str2);

        sc.close();

    }
    
}