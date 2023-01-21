import java.util.Scanner;

public class tut_24_practiseSet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Question 1 : Create an array of 5 flats and calculate their sum.

        float flats[] = {101.65f, 102.5f, 103.12f, 104.1f, 105.78f};
        float sum = 0;
        for(int i=0; i<5; i++){
            sum = sum + flats[i];
        }
        System.out.println("The sum flats present in a array is : "+ sum);

        // Question 2 :
        // Write a program to find whether a given integer in array is present or not.
        int marks[] = {98, 95, 96, 99, 94};
        System.out.println("\nEnter the number that you want to check in a array :");
        int num = sc.nextInt();
        boolean IsInArray = false;
        for(int element : marks){
            if(num == element){
                IsInArray = true;
                break;
            }
        }
        if(IsInArray){
            System.out.println("The element is present in a array");
        }
        else{
            System.out.println("The element is not present in a array");
        }

        // Question 3 :
        // Calculate the average marks from an array containing marks of all students in physics using for-each loop.

        float Physics_M[] = {98, 95, 96, 99, 94};
        float sum1 = 0;
        for(float element : Physics_M){
            sum1 = sum1 + element;
        }
        System.out.println("\nThe average marks of students in physics is : "+ sum1/Physics_M.length + " %");

        // Question 4 : Create a java program to add two matrices of size 2x3.
        int mat1 [][] = {{12, 20, 22},
                        {22, 20, 15}};
        int mat2 [][] = {{15, 24, 22},
                        {28, 75, 19}};
        int result [][] = {{0, 0, 0},
                           {0, 0, 0}};

        for(int i=0; i<mat1.length; i++){ //row number of times
            for(int j=0; j<mat1[i].length; j++){ // column number of times
                System.out.format("\nSetting the value of i=%d and j=%d", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        
        }

        System.out.println("\nThe addition of two matrices is :");
        for(int i=0; i<mat1.length; i++){ //row number of times
            for(int j=0; j<mat1[i].length; j++){ // column number of times
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }

            System.out.println(" "); // prints a new line
        }

        // Question 5: Write a java program to reverse an array.

        // String name[] = {"Gaurav", "Amit", "Krishna", "Anuj", "Sanket"};
        // System.out.println(" ");
        // for(int i=name.length-1; i>=0; i--){
        //     System.out.print(name[i] + " ");
        // }

        // OR

        int arr[] = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2); // mid number - length/2
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        System.out.println("\nThe number from array in reverse order :");
        for (int element : arr) {
            System.out.print(element + " ");   
        }


        // Question 6: find out the maximum number from the array.

        System.out.println("\n");
        int number[] = {68, 98, 52, 455, 65, 23, -1, -8954};
        int max = Integer.MIN_VALUE;
        for(int el:number){
            if(el>max){
                max = el;
            }
        } 
        System.out.println("The value of maximum element from the array is : "+ max);


        // Question 7: find out the minimum number from the array.

        System.out.println("");
        int number1[] = {68, 98, 52, 455, 65, 23, -1, -8954};
        int min = Integer.MAX_VALUE;
        for(int el:number1){
            if(el<min){
                min = el;
            }
        } 
        System.out.println("The value of manimum element from the array is : "+ min);


        // Question 8: Write a java progarm to find whether given array is sorted or not.
        boolean isSorted = true;
        System.out.println("");
        int number2[] = {68, 98, 52, 455, 65, 23, -1, -8954};
        for(int i=0; i<number.length-1; i++){
            if(number2[i] > number2[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

        sc.close();

    }
}
