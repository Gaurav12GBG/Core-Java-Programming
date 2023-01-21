import java.util.Scanner;

public interface tut_13_practiseSet3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question 1: Write a java program to convert a string to lowercase.

        System.out.println("Enter the string in uppercase or mix with upper and lower to convert it into the lowercase :");
        String sentence = sc.nextLine();
        String lCase = sentence.toLowerCase();
        System.out.println("The string in lower case is : " + lCase);

        // Question 2: Write a java program to replace the spaces with underscores.

        System.out.println("Enter the string here: ");
        String text = sc.nextLine();
        String replaceText = text.replace(" ", "_");
        System.out.println("After replacing white spaces with underscores : " +replaceText);

        /* Question 3: Write a java program to fill a letter template which looks like below: 
        Dear <|name|> , Thanks a lot !!.
        Replace <|name|> with a string (some name)
        */

        System.out.println("Enter the name here: ");
        String name = sc.nextLine();
        System.out.println("Dear " + name + ", Thanks a lot");

        /* Question 4: Write a java program to detect double and double and tripple
                       spaces in string. 
        */

        String myString = "This string contains  double and tripple   spaces.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        /* Question 5: Write a java program to format following letter using escape
                       sequence character.
                       letter = "Dear Gaurav, The java course is nice. Thanks!"
        */

        String myLetter = "Dear Gaurav,\n\tThe java course is nice.\n\tThanks!";
        System.out.println(myLetter);
        
        sc.close();
    }
}
