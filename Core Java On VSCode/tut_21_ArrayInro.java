public class tut_21_ArrayInro {
    public static void main(String[] args) {

        /* 
        Classroom of 500 students - You have to stored marks of these 500 students.
        You have 2 options :
        1. Create 500 variables
        2. Use Arrays (Recommended)

        Array in java - Collection of similar types of data
                      - Arrays having two types :- one dimensional
                                                 - two/multi-dimensional
                      - Arrays index start from 0 and end with size-1
                      - Array is mutable
                      - e.g. int arr[5];
                             Here 5 is a size of array. It means actual size is 20 bytes. Because int size having 4 byte so, we can calculate
                             it as -  5 x 4 = 20 bytes. 

        There are three main ways to create array in java :

        1.Declaration + Memory allocation :
        int marks[] = new int[5];  
        
        2.Declaration and then memory allocation :
        int [] marks1; 
        marks1 = new int[10]; 
        
        Initialization :   
        marks[0] = 98;
        marks[1] = 56;
        marks[2] = 78;
        marks[3] = 80;
        marks[4] = 55;
        marks[5] = 85; => throws an error
        */

        // 3.Declarations, Memory Allocation and Initialization together :
        int marks[] = {98, 56, 78, 80, 55};
        System.out.println(marks[4]);

    }
}
