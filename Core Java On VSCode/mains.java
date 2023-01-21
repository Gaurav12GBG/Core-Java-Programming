import java.util.Scanner;
public class mains {
	//method to determine whether the dimension is a perfect cube or not.
	public static boolean dimens_is_cube(int n) {
		int i=1;
		boolean result = false;
		while(i<=n) {
			if(i*i*i == n) {
				result = true;
				break;
			}
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//read input
		int numDimensions = scan.nextInt();
		int[] dimens = new int[numDimensions];  //initialize an array to store dimensions
		for(int i=0;i<numDimensions;i++) {
			dimens[i] = scan.nextInt();
		}
		int perfect_cube = 0;  //initialize counter
		//determine whether the dimensions are a perfect cube, if yes then increment the counter
		for(int i=0;i<numDimensions;i++) {
			if(dimens_is_cube(dimens[i])) {
				perfect_cube++;
			}
		}
		System.out.println(perfect_cube);  //print result
        scan.close();
	}
}
