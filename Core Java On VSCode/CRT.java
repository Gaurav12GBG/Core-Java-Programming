// import java.io.*;
public class CRT {

    static int inv(int a, int m) {
        int x, x1 = 0;
        for (x = 1; x < m; x++)
            if ((a * x) % m == 1)

                x1 = x;

        System.out.println("....." + a);
        return x1;
    }

    static int finalValue(int num[], int rem[], int k) {
        int prod = 1;
        for (int i = 0; i < k; i++) {
            prod = prod * num[i];
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            int M = prod / num[i];

            result += rem[i] * inv(M, num[i]) * M;
        }
        return result % prod;
    }

    public static void main(String[] args) {

        
        int num[] = { 5, 7, 11 };
        int rem[] = { 1, 1, 3 };
        int k = num.length;

        System.out.println("x is a " + finalValue(num, rem, k));
    }
}
