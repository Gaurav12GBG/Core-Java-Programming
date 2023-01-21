import java.util.Scanner;

public class exchangeGreeting {
    public static int handshake(int num){
        if(num < 2){
            return 0;
        }

        return handshake(num - 1) + (num - 1)  ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("handshake("+ (i) +") = "+ handshake(i));
        }
        sc.close();
    }
}
