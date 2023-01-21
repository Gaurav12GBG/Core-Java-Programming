// Loops in java :

public class tut_18_loops {

    public static void main(String[] args) {

        // 1.while loop :
        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        int a = 0;
        do{
            System.out.println(a);
            a++;
        }while(a < 6);

        // 3.for loop

        /* int b = 0;
        for(b = 0; b < 6; b++){
            System.out.println(b);;
        }
        */ 
           
        for(int x = 0; x < 4; x++ ){
            for(int y = 0; y <= x; y++){
                System.out.print("*");
            }
            System.out.println("");
        }

        int n = 4;
        for (int p = n; p > 0; p--) {
            for (int q = 0; q < p; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}