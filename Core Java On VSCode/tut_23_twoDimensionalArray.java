public class tut_23_twoDimensionalArray {
    public static void main(String[] args) {

        // int marks[];     1-D Array
        
        /* Multi-dimensional Array :- Array of arrays
                                    - Each element in the M-D array is an array itself
                                    - Marks in a previous example was a 1-D array
                                    - Multidimensional can be 2D, 3D, 4D.......ND
        */

        // Multi-dimensional 2D Array :
        int flats[][] = new int[2][3];    
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2D Array using for loop :
        System.out.println("Printing the value of 2D Array using for loop : ");
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
    }
}
