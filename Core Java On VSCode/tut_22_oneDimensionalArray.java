public class tut_22_oneDimensionalArray {
    public static void main(String[] args) {
        
        // float marks[] = {98.5f, 55.5f, 65.23f, 98.16f, 78.75f};
        // String student[] = {"Gaurav", "Vaishnavi", "Ram", "Amar"};
        // System.out.println("Length of array is : "+(student.length));
        // System.out.println(student[3]);
        
        // 1-D Array :
        int marks[] = {98, 58, 78, 46, 78, 100, 121, 150};
        System.out.println("Length of array is : "+(marks.length));

        // Displaying the array (Naive way)
        System.out.println("Printing using Naive way :");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);

        // Displaying the array (for loop)
        System.out.println("\nPrinting using for loop :");
        for(int i=0; i<=7; i++){
            System.out.println(marks[i]);
        }

        // Quick Quiz : 
        // Write a java program to print the element in a array in reverse order
        System.out.println("\nPrinting array element in reverse order :");
        for(int i=(marks.length-1); i>=0; i--){
            System.out.println(marks[i]);
        }

        // for-each loop: Displayiny the array element using for-each loop 
        // It directly take the element from the array one by one
        System.out.println("\nPrinting array element using for-each loop :");
        for (int element : marks){
            System.out.println(element);
        }
    }
}
