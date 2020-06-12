package rumen;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 1 || n > 1000000)
            return;
        int F[] = new int[n+2];
        F[1] = 1;
        F[2] = 1;
        for(int i = 3; i <= n; i++){
            F[i] = F[i-1] + F[i-2];
        }
        System.out.println(F[n]%10007);
    }
}
