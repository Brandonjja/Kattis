// Rijeci https://open.kattis.com/problems/rijeci

import java.util.Scanner;

public class Rijeci {
    static int fib(int n) {
        int a = 0, b = 1, c = 1;
        if (n < 1) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(fib(k - 1) + " " + fib(k));
        sc.close();
    }
}
