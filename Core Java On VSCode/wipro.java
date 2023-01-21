import java.util.*;
public class wipro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];
        String singlechar[] = new String[n];
        int sumofsq = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        for(int i=0; i<n;i++){
            for(int j=i+1; j<n-1; j++){
                if(arr[i].length()!=arr[j].length()){
                  
                    char c = arr[i].charAt(0);
                    String s = Character.toString(c);
                    singlechar[i] = s;
                }
            }
        }

        for(int i=0; i<singlechar.length; i++){
            sumofsq = sumofsq + Integer.parseInt(singlechar[i]) * Integer.parseInt(singlechar[i]);
        }

        System.out.println(sumofsq);

    }
}